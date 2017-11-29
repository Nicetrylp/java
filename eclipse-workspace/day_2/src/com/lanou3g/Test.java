package com.lanou3g;

import java.util.Scanner;

/**
 * 作业
 * 
 *
 */
public class Test {

	public static void main(String[] args) {
		//输入一个数 做为随机个数 
		//  随机[90 , 200]的数 寻找 当中的最大值
//		fun1();	
		
		// 从控制台输入一个n 控制循环次数 如果不是7的倍数 并且该数字不包含7 输出该数 
		// 随机数范围（1 - 100）
//		fun2();
		
		// 鸡兔同笼35个头94只脚用 鸡有多少只 兔有多少只
//		fun3();
	}
	
	/* 从控制台输入一个数字的方法 */
	public static int scanner() {
		System.out.println("请输入一个数字,作为随机数个数:");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		scanner.close();
		return a;
	}
	
	public static void fun1() {
		
		int a = scanner();
		max(a);
	}
	
	public static void fun2() {
		int a = scanner();
		printNum(a);
	}
	
	/* 鸡兔同笼 */
	public static void fun3() {
		//	定义头的个数
		int head = 35;
		// 定义脚的个数
		int foot = 94;
		// 定义并初始化鸡的个数,默认全是鸡
		int chicken = head;
		// 定义并初始化兔的个数,默认兔为0
		int rabbit = 0;
		// 如果,(鸡*鸡的脚+兔*兔的脚) < 总的脚,执行循环体
		while((chicken * 2 + rabbit * 4) < foot) {
			chicken--;	//鸡减少一只
			rabbit++;	//兔增加一只
		}
		// 输出鸡和兔的个数
		System.out.println("鸡:" + chicken + " 兔" + rabbit);
	}
	
	/**/
	public static void printNum(int a) {
		System.out.println("条件:不是7的倍数 并且该数字不包含7 输出该数 ");
		for(int i = 0 ; i < a ; ++i ) {
			// [1,100]随机数
			int m = (int)(Math.random()*100+1);
			// 只为测试看数
			//System.out.println(m);
			if(m % 7 != 0 && m % 10 != 7 && m/10 != 7) {
				System.out.println("满足条件的数是:" + m);
			}
		}
	}
	
	/*最大值*/
	public static void max(int a)
	{
		int max = 0;	//定义一个变量,用来保存最大值
		for(int i = 0; i < a ; i++) {
			int m = (int)(Math.random()*111+90);	//接收随机数
			// 只为测试看数
			//System.out.println(m);
			if(max < m)
				max = m;
		}
		System.out.println("这串随机数中,最大值是" + max);
			
	}
	
	
}
