package com.Fujitsu;

public class modulus {
	int a,b,c;

	public modulus(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
    public void mod()
    {
    	c=a%b;
    }
	@Override
	public String toString() {
		mod();
		return "modulus of"+a+" and "+b+" =" + c ;
	}
	

}
