package com.cg.springioc;

public class Airtel implements Sim {
	
	Airtel() {
		System.out.println("Airtel constructor is called");
	}

	public void calling() {
		System.out.println("Calling using Airtel");
	}

	public void internet() {
		System.out.println("Browsing using Airtel");
	}

}
