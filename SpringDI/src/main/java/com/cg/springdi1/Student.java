package com.cg.springdi1;

public class Student {
	
	private MathCheat mc;
	
	public MathCheat getMc() {
		return mc;
	}
	public void setMc(MathCheat mc) {
		this.mc = mc;
	}
	public void cheating() {
		mc.mathchit();
	}
}
