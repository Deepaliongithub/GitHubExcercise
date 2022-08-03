package com.Fujitsu;
public class CosFunction  
{  
   double a,b;
	
 public CosFunction(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

     public void cos()
     {
    	 double b = Math.toRadians(a);
     }
     
     
	@Override
	public String toString() 
	{
		cos();
		return "CosFunction = "+b;
	}
}  

