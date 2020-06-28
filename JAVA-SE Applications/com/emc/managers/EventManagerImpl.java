package com.emc.managers;

import com.emc.dto.Event;

public class EventManagerImpl implements EventManager 
{
	public Event create(long id) 
	{
		return new Event(id, null, null);
		
	}
	
}
