package com.revature.services;

import java.util.List;

import com.revature.models.Events;


public interface EventService {
	public List<Events> getAllEvents();
	public Events saveNewEvent(Events e);
	public Events getById(int id);

}
