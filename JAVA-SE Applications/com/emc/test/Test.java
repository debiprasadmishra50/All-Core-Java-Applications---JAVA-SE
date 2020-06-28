package com.emc.test;

import com.emc.dto.*;
import com.emc.managers.EventManager;
import com.emc.managers.EventManagerImpl;
import com.emc.managers.EventManagerImpl2;

public class Test 
{
	public static void main(String[] args) 
	{
		Organiser org = new Organiser();
		org.setId(123L);
		org.setName("Apple Inc");
		//System.out.println(org); //com.emc.dto.Organiser@1f32e575
		System.out.println(org.getName());
		System.out.println(org.getId());
		
		Event evt = new Event(456L,"Iphone 100 Launch","Grand Launch");
		//System.out.println(evt); //com.emc.dto.Event@2ff4acd0
		System.out.println(evt.getDescription());
//		System.out.println(evt.getName());
//		System.out.println(evt.getId());
		
		
		EventManager em = new EventManagerImpl2();
		System.out.println(em.create(4561).getId());
		System.out.println(em.create(4561).getName());
		System.out.println(em.create(4561).getDescription());
		
		
	}
}
