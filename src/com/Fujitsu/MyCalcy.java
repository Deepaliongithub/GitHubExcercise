package com.Fujitsu;

import java.util.Scanner;

public class MyCalcy {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Addition");
		System.out.println("2.substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.find square");
		System.out.println("6.find square root ");
		System.out.println("7.find A cube");
		System.out.println("8.find reminder ");
		System.out.println("9.find circumference");
		System.out.println("10.find a factorial of  a no ");
		System.out.println("11.find a even or odd no ");
		System.out.println("12.find a sin0 ");
		System.out.println("13.find a cos0");
		System.out.println("14.find a tan0");
		System.out.println("15.Generate random no ");
		System.out.println("Enter your choice ");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
	
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		case 6:  System.out.println("Enter a Number");
		double x =  sc.nextDouble();
        System.out.println(Math.sqrt(x));
			
			break;
		case 7:
			
			break;
		case 8:
			
			break;
		case 9:
			
			break;
		case 10:
			
			break;
		case 11:
			
			break;
		case 12:
			
			break;
		case 13:
			
			break;
		case 14:
			
			break;
		case 15:
			
			break;
			
			default: System.out.println("Enter from the given choice");
		}
	}

}
