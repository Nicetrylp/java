package com.lanou3g.demo;

import java.util.Scanner;

public class Demo_3 {

	public static void main(String[] args) {
		/*
		System.out.println("请输入这次考试的分数:");
		Scanner scanner = new Scanner(System.in);
		// 接收分数
		int score = scanner.nextInt();
		if(score >= 90)
		{
			System.out.println("优秀");
		}else if (score >= 70) {
			System.out.println("良好");
		}else if (score >= 60) {
			System.out.println("及格");
		}else {
			System.out.println("不及格");
		}
		//
		scanner.close();
		*/
		
		/*
		 * 练习题1.从控制台输入一个字符 如果是‘m’则输出男性 否则什么都不输出
		 */
		
		/*
		System.out.println("请输入一个字符:");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		//将字符串转成char类型
			//	字符		索引	下标
		char ch = str.charAt(0);
		if(ch == 'm') {
			System.out.println("男");
		}
		scanner.close();
		
		*/
		
		/*
		 * 输入一个数 判断 是哪个季节(3 4 5 春季 6 7 8 夏季  9 10 11 秋季 12 1 2 冬季)
		 */
		// 当有多个case同时执行一个语句时,可以省略break(根据实际情况选择)
		
		/*
		System.out.println("请输入一个月份");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("春");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("夏");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("秋");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("冬");
			break;

		default:
			System.out.println("error");
			break;
		}
		scanner.close();
		
		*/
	}

}
