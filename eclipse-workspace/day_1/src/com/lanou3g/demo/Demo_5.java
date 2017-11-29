package com.lanou3g.demo;

import java.util.Scanner;

/**
 * 
 * @author lanou
 *
 */
public class Demo_5 {

	public static void main(String[] args) {
		//三个数的最大值
	/*	
	   		// 控制台输入三个数
		System.out.println("请输入a的值:");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println("请输入b的值:");
		int b = scanner.nextInt();
		System.out.println("请输入c的值:");
		int c = scanner.nextInt();
	*/	
		int a = 10;
		int b = 12;
		int c = 8;
		//方法1	三目运算符
		int d = a > b ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println(d);
		//方法2	if
		if(a > b) {
			if(a > c) {
				System.out.println("最大值是" + a);
			}else {
				System.out.println("最大值是" + c);
			}
		}else if (b>c) {
			System.out.println("最大值是" + b);
		}else {
			System.out.println("最大值是" + c);
		}

	}

}
