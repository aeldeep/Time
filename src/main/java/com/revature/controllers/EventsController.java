package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Events;
import com.revature.services.EventService;




@RestController
@RequestMapping("events")
public class EventsController {

	private EventService es;
	
	@Autowired
	public EventsController(EventService es) {
		this.es = es;
	}
	

	@GetMapping
	public ResponseEntity<List<Events>> getAllEvents(){
		return new ResponseEntity(es.getAllEvents(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Events> saveNewEvent(@RequestBody Events e) {
		if(e.getEventId() != 0) {
			return new ResponseEntity("eventId must be 0", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity(es.saveNewEvent(e), HttpStatus.CREATED);
	}
	
	

	@GetMapping("{id}")
	public ResponseEntity<Events> getEventById(@PathVariable int id){// will try and turn the body into the object type on its right
		if(id== 0) {
			return new ResponseEntity("eventId must not be 0", HttpStatus.BAD_REQUEST);
		}
		
		
		System.out.println("##WE ARE IN CONTROLLER##");
		System.out.print(es);
		
		return new ResponseEntity(es.getById(id), HttpStatus.CREATED);
	}
	
}
