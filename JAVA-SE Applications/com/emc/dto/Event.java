package com.emc.dto;

public class Event extends EMBase
{
	private String description;
	private String start_time;
	private String end_time;
	private boolean started;
	
	public Event(Long id, String name, String description)
	{
		this.id = id;
		this.name = name;
		this.description = description;
	}
	public String getDescription() 
	{
		return description;
	}
	public void setDescription(String description) 
	{
		this.description = description;
	}
	public String getStart_time() 
	{
		return start_time;
	}
	public void setStart_time(String start_time) 
	{
		this.start_time = start_time;
	}
	public String getEnd_time() 
	{
		return end_time;
	}
	public void setEnd_time(String end_time) 
	{
		this.end_time = end_time;
	}
	public boolean isStarted() 
	{
		return started;
	}
	public void setStarted(boolean started) 
	{
		this.started = started;
	}
	
}
