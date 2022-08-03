package com.Fujitsu;

import java.util.Scanner;

public class Cube 
{
	
 int Num , cube;
 
 private static Scanner sc;
public Cube(int Num) {
	super();
	this.Num = Num;
}
public void cube1()
{
	sc= new Scanner (System.in);
	System.out.println("Enter any Number: ");
	Num = sc.nextInt();
	cube=Num * Num * Num;
	
	
}
@Override
public String toString() {
	cube1();
	return "Cube= " + cube;
}

}
