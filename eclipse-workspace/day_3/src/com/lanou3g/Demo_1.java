package com.lanou3g;
/**
 * ��ϰ����
 * 
 *
 */
public class Demo_1 {

	public static void main(String[] args) {
		/*
		 * �������������ֵ
		 */
		int max =  max(5, 6, 7,8);
		System.out.println(max);
	}
	
	public static int max(int a,int b) {
		return a > b ? a : b;
	}
	
	public static int max(int a,int b,int c) {
		return a > b ? (a > c ? a : c):( b > c ? b : c);
	}
	
	public static int max(int a,int b,int c,int d) {
//		int a1 = a;
//		int b1 = b;				��������
//		int c1 = c;
//		int d1 = d;
//		int max1 = max(a1, b1);
//		int max2 = max(c1, d1);
//		return max(max1, max2);
		return max(max(a, b), max(c, d));
	}
	
	public static int max(int a,int b,int c,int d,int e) {
		return max(max(a, b), max(c, d ,e));
	}
}
