package com.Fujitsu;

public class CircumferenceOfCircle {
	int radius;
	double Circumference;
	double PI=3.14;	
	public CircumferenceOfCircle(int radius, double pI) {
		super();
		this.radius = radius;
		PI = pI;
	}
	public void Circumference()
	{
		Circumference=3.14*2*radius;
		
	}
	@Override
	public String toString() {
		Circumference();
		return "CircumferenceOfCircle = "+Circumference;
	}
	
	
}