package com.home2.calculator;

public class CalApp implements Methods{
	public int sum=0,sub=0,mul=1,div=1;

	@Override
	public int Add(int a, int b) {
		sum=a+b;
		return sum;
	}

	@Override
	public int Subtract(int a, int b) {
		if(a>b){
			sub=sub-(a-b);
		}
		else{
			sub=sub-(b-a);
			
		}
		return sub;
	}

	@Override
	public int Multiply(int a, int b) {
		mul=mul*(a*b);
		return mul;
	}

	@Override
	public int Division(int a, int b) {
		try{
			div=(a/b);
			return div;
		}catch(ArithmeticException e){
			System.out.print(e);
			return 0;
		}
		
	}
	

}
