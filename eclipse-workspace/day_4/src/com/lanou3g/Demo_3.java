package com.lanou3g;
/**
 * 递归函数
 * 不断地重复调用一个和自己函数同名的函数
 * 注意,递归函数需要一个条件来停止递归
 * 这个条件叫做递归出口
 * 注意,开发中,尽量不要使用递归	递归巨耗内存
 */
public class Demo_3 {

	public static void main(String[] args) {
		int a = 5;
		System.out.println(factorial(a));
		System.out.println(circulation(a));
	}
	
	/*递归算法*/
	public static int factorial(int a) {
		if( a == 1)
			return a; //递归函数出口
		else		
			return a*factorial(--a);		
	}

	/*循环实现*/
	public static int circulation(int a) {
		int sum = 1;
		for(int i = 1;i <= a; i++) {
			sum *= i;
		}
		return sum;
	}
}
