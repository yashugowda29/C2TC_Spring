package com.cg.springdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		
		ApplicationContext c = new ClassPathXmlApplicationContext("Beans.xml");
		
		Student s1 = c.getBean("Student1", Student.class);
		s1.display();
		
		Student s2 = c.getBean("Student2", Student.class);
		s2.display();
		
	}
}
