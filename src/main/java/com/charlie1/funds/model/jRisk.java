package com.charlie1.funds.model;




public class jRisk {
	
	
	String risk1;
	String risk2;
	public jRisk(String risk1, String risk2) {
		super();
		this.risk1 = risk1;
		this.risk2 = risk2;
	}
	
	public jRisk() {}

	public String getRisk1() {
		return risk1;
	}

	public void setRisk1(String risk1) {
		this.risk1 = risk1;
	}

	public String getRisk2() {
		return risk2;
	}

	public void setRisk2(String risk2) {
		this.risk2 = risk2;
	}

	@Override
	public String toString() {
		return "jRisk [risk1=" + risk1 + ", risk2=" + risk2 + "]";
	}
	
	
	
	

}
