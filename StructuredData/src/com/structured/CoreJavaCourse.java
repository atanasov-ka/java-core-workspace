package com.structured;

import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CoreJavaCourse {
	public  List<Student> students = null;
	public int courseId;
	public String courseName;

	public CoreJavaCourse() {
		courseId = 333;
		courseName = "Salam";
		students = new LinkedList<>();
		students.add(new Student());
	}
	@Override
	public String toString() {

		StringBuilder studentsStrBuilder = new StringBuilder();
		for (Student oneStudent : students) {
			studentsStrBuilder.append(String.format("%s\r\n", oneStudent.toString()));
		}
		
		return String.format("Course Id: %s name: %s students: %s", courseId, courseName, studentsStrBuilder.toString()); 
	}
}
