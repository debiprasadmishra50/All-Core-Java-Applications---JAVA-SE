package com.emc.managers;

import com.emc.dto.Event;

public class EventManagerImpl2 implements EventManager 
{
	public Event create(long id) 
	{
		return new Event(id, "MacBook Launch", "New Gerenation of MacBooks Launch");
		
	}
	
}
