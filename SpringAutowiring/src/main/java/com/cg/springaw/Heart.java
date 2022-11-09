package com.cg.springaw;

public class Heart {
	
	private String NameOfAnimal;
	private int NoOfHeart;
	
	public String getNameOfAnimal() {
		return NameOfAnimal;
	}
	public void setNameOfAnimal(String nameOfAnimal) {
		NameOfAnimal = nameOfAnimal;
	}
	public int getNoOfHeart() {
		return NoOfHeart;
	}
	public void setNoOfHeart(int noOfHeart) {
		NoOfHeart = noOfHeart;
	}
	public void pump() {
		System.out.println("Your heart is pumping");
		System.out.println("You are alive");
	}
}
