package com.revature.dto;


import java.util.Date;


public class EventSolution {

	
	private int eventId;
	
	private String eventName;
	private String times;
	private String location;
	private  Date dates;
	public EventSolution() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getTimes() {
		return times;
	}
	public void setTimes(String times) {
		this.times = times;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getDates() {
		return dates;
	}
	public void setDates(Date dates) {
		this.dates = dates;
	}
	public EventSolution(int eventId, String eventName, String times, String location, Date dates) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.times = times;
		this.location = location;
		this.dates = dates;
	}
	@Override
	public String toString() {
		return "EventSolution [eventId=" + eventId + ", eventName=" + eventName + ", times=" + times + ", location="
				+ location + ", dates=" + dates + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dates == null) ? 0 : dates.hashCode());
		result = prime * result + eventId;
		result = prime * result + ((eventName == null) ? 0 : eventName.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((times == null) ? 0 : times.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EventSolution other = (EventSolution) obj;
		if (dates == null) {
			if (other.dates != null)
				return false;
		} else if (!dates.equals(other.dates))
			return false;
		if (eventId != other.eventId)
			return false;
		if (eventName == null) {
			if (other.eventName != null)
				return false;
		} else if (!eventName.equals(other.eventName))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (times == null) {
			if (other.times != null)
				return false;
		} else if (!times.equals(other.times))
			return false;
		return true;
	}
	
	
}
