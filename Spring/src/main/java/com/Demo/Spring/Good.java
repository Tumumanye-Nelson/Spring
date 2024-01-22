package com.Demo.Spring;

public class Good implements Staff{
	private String Qualifaction;
	
public String getQualifaction() {
		return Qualifaction;
	}

	public void setQualifaction(String qualifaction) {
		Qualifaction = qualifaction;
	}

public void show() {
	System.out.println("HI Ladies and Gentlemen");
}

@Override
public void assist() {
	System.out.println("Please come here");		
	
}
}
 