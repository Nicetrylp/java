package com.Nice_try;

public class Test {
	public static void main(String[] args) {
		
		System.out.println(fun(11591));
	}
	public static int fun(int number) {
		int value = 0;
		int j = 0;
		while(number > 0) {
			int a = number % 10;
			a*=a;
			value =(int) (a*Math.pow(10, j))+value;
			if(a>10)
				j+=2;
			else
				j++;
			number/=10;
		}
		return value;
	}
}