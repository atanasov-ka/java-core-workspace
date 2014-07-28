package com.structured;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	
	public int studentId;
	private String name;
	public Student ()
	{
		studentId = 132;
		name = "Gundi";
	}
	
	@Override
	public String toString() {
		return String.format("student ID: %s name: %s", studentId, name);		
	}
}
