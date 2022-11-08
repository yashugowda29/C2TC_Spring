package com.cg.springdi1;

public class AnotherStudent {
	
	private MathCheat mc;

	public MathCheat getMc() {
		return mc;
	}
	public void setMc(MathCheat mc) {
		this.mc = mc;
	}
	public void StartCheating() {
		mc.mathchit();
	}
}
