package com.Fujitsu;

public class Multiplication2 {

	
	
		int a,b,c;

		public Multiplication2(int a, int b) {
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




