package com.cg.springioc;

public class Jio implements Sim {
	
	Jio() {
		System.out.println("Jio constructor is called");
	}

	public void calling() {
		System.out.println("Calling using Jio");
	}

	public void internet() {
		System.out.println("Browsing using Jio");
	}

}
