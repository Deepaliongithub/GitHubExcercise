package com.Fujitsu;

import java.util.Scanner;

public class SquareRoot {
	double x,y;

public SquareRoot(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

public void squareRoot() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ënter a number");
		  x = sc.nextDouble();
	       y=  Math.sqrt(x);
	       
	       
}

@Override
public String toString() {
	return "SquareRoot [ y=" + y + "]";
}

}
