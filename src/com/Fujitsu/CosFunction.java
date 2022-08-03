package com.Fujitsu;

import java.util.Scanner;

public class CosFunction  
{  
    public static void main(String[] args)   
    {  
    	 Scanner input = new Scanner (System.in);
    	    System.out.print("Enter  number: ");
    	    double a = input.nextInt();
           double b = Math.toRadians(a);  
        System.out.println(Math.cos(b));  
    }  
}  

