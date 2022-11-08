package com.cg.springdi;

public class Student {
	
	private int registerNo;
	private String studentName;
	
	public Student(int registerNo, String studentName) {
		super();
		this.registerNo = registerNo;
		this.studentName = studentName;
	}
	void display() {
		System.out.println(studentName);
		System.out.println(registerNo);
	}
}
