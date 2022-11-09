package com.cg.springaw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	private Heart heart;
	
	public Heart getHeart() {
		return heart;
	}
	
	@Qualifier("dogheart")
	@Autowired
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	public void startpumping() {
		heart.pump();
		System.out.println("The name of the animal is : " + heart.getNameOfAnimal());
		System.out.println("The no of Heart is : " + heart.getNoOfHeart());
	}
}
