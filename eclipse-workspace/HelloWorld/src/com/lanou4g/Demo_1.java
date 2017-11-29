package com.lanou4g;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

/**
 * 
 * @author lanou
 * @version 1.0.1
 * 测试类
 *
 */
public class Demo_1 {

	public static void main(String[] args) {
		// 注释的三种形式
		// 1.单行			
		// 2.多行			
		// 3.文档			
		/*
		 * 多行注释
		 */
		/**
		 * 文档注释
		 */
		// 定义一个变量 	变量类型  变量名  = 初值;
		//定义一个整型变量
		int a = 10;
		System.out.println("a ="+a);
		int b = 15;
		//打印时  字符串与任何类型一起拼接  打印出来的都是字符串
		System.out.println("a + b = "+(a+b));
		System.out.println(a + " " + b);
		String str = "Nice_try";
		System.out.println(str);
		// byte
		// 隐式转换
		// 类型进行提升,只可以小类型提升到大类型
		// 强制转换 值前面加上要强制转换的类型
		byte c = 5;
		// 自动提升为两个int型值相加
		c = (byte)(c + 2);
		System.out.println(c);
		
		
		//运算符
		//    + - * / %
		// 变量名: 不能以数字 下划线  除$符以外的其他符号 开头
		// 见名知意
		// 没有初始值的变量是不能使用的
		int num1 = 10,num2;
		num2 = 5;
		System.out.println(num2);
		
		int num3 = 5;
		int num4 = 2;
		// 双精度浮点型
		double num5 = 5.0;
		double num6 = 2.0;
		int num7= 0;
		// 两个整型进行运算,结果只能是整型
		int num8 = num3 / num4;
		System.out.println(num8);
		double num9 = (num5 / num6);
		System.out.println(num9);
		// 当0作为被除数时,编译不会发生错误,但是运行的时候,会报算数异常
//		int num10 = num3/num7;
//		System.out.println(num10);
		// 单精度浮点型(需要末尾添加f来表示这个变量是单精度浮点型)
		float f = 3.1f;
		// 布尔型  true false
		boolean boo = true;
		
		//  取余运算
		//	当有负数参与的取余运算时  ,符号和除数相同
		System.out.println(-5 % 3);
		
		//	自增  自减
		int i = 5;
		int k = ++i;
		System.out.println("i = " + i +" k = " + k);
/*		
		// 控制台输入
		// 输入和输出  
		Scanner scanner = new Scanner(System.in);
		//取出从控制台输入的值
		int m = scanner.nextInt();
		System.out.println(m);
		//关闭scanner
		scanner.close();
*/		
		
		//	字符类型 
		//	字符型和整型可以相互转换	ASCII   A:65   a:97
		char ch = 'a';
		System.out.println(ch);
		System.out.println((char)(ch + 1));
		
		
		for(int l = 0;l < 26; ++l)
		{
			System.out.print((char)(97+l)+" ");
		}
	}

}
