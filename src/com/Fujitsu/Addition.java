
package com.Fujitsu;

public class Addition {

	int a,b,c;

	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public void add()
	{
		c=a+b;
	}

	@Override
	public String toString() {
		add();
		return "Addition=" +c;
	}
	
}


