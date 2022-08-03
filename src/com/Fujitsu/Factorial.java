package com.Fujitsu;
import java.util.Scanner; 
public class Factorial {
	public static void main(String[] args) {  
		int fact = 1;  
		int i = 1;  

		Scanner sr = new Scanner(System.in);  
		System.out.println("Enter a number: ");  
		int num = sr.nextInt();  
		while( i <= num ){  
			fact = fact * i;   
			i++;  
		}     
		System.out.println("\nFactorial of " + num + " is: " + fact);  
	}  
}  

