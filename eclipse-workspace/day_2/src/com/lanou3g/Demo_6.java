package com.lanou3g;

import java.util.Scanner;

/***
 * 循环控制
 * @author lanou
 *
 */
public class Demo_6 {

	public static void main(String[] args) {
		// break 跳出当前循环  或者 switch语句
		// continue 继续
		/*
		int max = 0;
		for(int i = 0;i<101;++i) {
			if(i % 7 == 0) {
				max = i;
			}
		}
		System.out.println(max);   
		for( int i = 100; i >= 0; i--)
		{
			if(i % 7 == 0)
			{
				System.out.println(i);
				break;
			}
		}
		*/
		
		/*
		System.out.println("说出你嫉妒的人是几号吧,骚年");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		for(int i = 1; i < 11 ; ++i) {
			if( i == a) {
				continue;
			}
			System.out.println( i + "号,你好");
//			if( i != a)
//				System.out.println( i + "号,你好");
//			
		}
		scanner.close();
		*/
		//嵌套循环中,break和continue 的作用
		
		// break在嵌套循环中 只跳出当前的循环
		
		for(int i = 0 ; i < 5 ; ++i) {
			for(int j = 0 ; j < 5; ++j) {
				if(j == 0)
					break;
				System.out.println("11111");
			}
			System.out.println("-----");
		}
		
	}

}
