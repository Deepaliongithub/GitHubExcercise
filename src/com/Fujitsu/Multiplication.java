package com.Fujitsu;

public class Multiplication {

	int a,b,c;

	public Multiplication(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public void mul()
	{
		c=a*b;
	}

	@Override
	public String toString() {
		mul();
		return "Multiplication=" +c;
	}


	}


