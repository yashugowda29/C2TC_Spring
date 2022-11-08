package com.cg.springdi1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext c = new ClassPathXmlApplicationContext("Beans.xml");
		
		Student s1 = c.getBean("Student1", Student.class);
		s1.cheating();
		
		AnotherStudent s2 = c.getBean("Student2", AnotherStudent.class);
		s2.StartCheating();
		
		Student s3 = c.getBean("Student3", Student.class);
		s3.cheating();
		
	}
}
