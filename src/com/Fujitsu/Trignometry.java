package com.Fujitsu;


// Java program for tan() method
import java.lang.*;

class Trignometry {


	double degrees;

	double radians=Math.tan(degrees);
	

	double tanValue = Math.tan(radians);

	public Trignometry(double degrees) {
		super();
		this.degrees = degrees;
		
	}

	@Override
	public String toString() {
		return "Trignometry [tanValue=" + tanValue + "]";
	}
}


