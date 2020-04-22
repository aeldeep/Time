package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.daos.EventsDao;
import com.revature.dto.EventSolution;
import com.revature.models.Events;



@Service
public class EventServiceImpl implements EventService{
private EventsDao ed;

@Autowired
public EventServiceImpl(EventsDao ed) {
	this.ed = ed;
}

@Override
public List<Events> getAllEvents() {
	// TODO Auto-generated method stub
	return ed.findAll();
}

@Override
public Events saveNewEvent(Events e) {
	// TODO Auto-generated method stub
	return ed.save(e);
}

@Override
public Events getById(int id) {
	// TODO Auto-generated method stub
	return ed.getOne(id);
}


}
