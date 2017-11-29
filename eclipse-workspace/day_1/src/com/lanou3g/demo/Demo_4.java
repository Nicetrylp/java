package com.lanou3g.demo;

import java.util.Scanner;

public class Demo_4 {

	public static void main(String[] args) {
		
	/*
		// 银行定期存款 5年及以上利率7.5% 否则利率 4.5%
		// 输入一个存款年限  本金为10000 计算本金加利息
		System.out.println("请输入存款年限");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		double money;
		if(year >= 5) {
			money = 10000 * (0.075) * year + 10000;
		}else {
			money = 10000 * 0.045 * year + 10000;
		}
		System.out.println(year + "后,你的10000块变成了:" + money + "块");
		scanner.close();
		
	*/
		
		/*
		 * 练习题3.从控制台输入一个数 如果是偶数 但是不能7的倍数 满足条件输出该数
		 */
		
		/*
		System.out.println("请输入一个整数");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		// 对2取余==0的为偶数
		if( a % 2 == 0) {
			
			if( a % 7 == 0) {
				System.out.println(a + "是偶数,并且" + a + "是7的倍数");
			}else {
				System.out.println(a + "是偶数,并且" + a + "不是7的倍数");
			}
			
		}else {
			System.out.println(a + "不是偶数");
		}
		scanner.close();
		
		*/
		
		// 输入一个年份,判断是不是闰年
		
		/*
		System.out.println("请输入一个年份");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		if((year % 4 == 0 && (year % 100 !=0) ) || year % 400 == 0) {
			System.out.println( year + "是闰年");
		
		}else {
			System.out.println( year + "不是闰年");
		}
		scanner.close();
		*/
		
		/*
		 * 练习题5.从控制台输入一个字符 如果是字母a-z 输出小写字母 如果是A-Z
		 */
		System.out.println("请输入一个字母");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		// 将字符串转成字符
		char ch = str.charAt(0);
		// ASCII 表中  A:65		Z:90		a:97		z:122
		
		//使用运算符,可以使字符装换为整型
		if( ch >= 'A' && ch <='Z') {
			System.out.println("大写字母");
		}else if (ch >= 'a' && ch <= 'z') {
			System.out.println("小写字母");
		}
		else {
			System.out.println("你tm告诉我这是字母???");
		}
		scanner.close();
		
	}

}
