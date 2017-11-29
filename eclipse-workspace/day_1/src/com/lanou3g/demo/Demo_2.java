package com.lanou3g.demo;

import java.util.Scanner;
/**
 * 
 * @author lanou
 *
 */
public class Demo_2 {
	
	public static void main(String[] args) {
		/*
		 * 键盘输入一个分数
		   1.如果成绩大于90分，打印优秀
		   2.如果成绩刚好为60分，则打印刚好及格，否则不管
		   3.如果成绩大于60，可以进入下一阶段学习，否则不可以
		   4.初级课程大于85分，且中级课程大于80分，才算通过，否则均以重修处理
		 */
		
		/*
		System.out.println("请输入一个分数:");
		// 从键盘输入一个数
		Scanner scanner = new Scanner(System.in);
		// 接收从键盘输入的数
		int score1 = scanner.nextInt();
		if (score1 > 90) {
			System.out.println("优秀");
		}else if (score1 == 60) {
			System.out.println("刚好及格");
		}
		
		if(score1 > 60) {
			System.out.println("你可以进入下一阶段学习");
			System.out.println("请输入中级课程分数:");
			//接收中级课程分数
			int score2 = scanner.nextInt();
			if(score1 > 85 && score2 >80) {
				System.out.println("恭喜你,考试通过了");
			}else {
				System.out.println("滚去重修");
			}
		}
		scanner.close();
		
		*/
		
		/*
		System.out.println("请输入一个1-4的数字:");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		//	无论default放在哪一个位置,当你所有的case条件都没有匹配上,最后都会去执行default(你必须写了才行)
		//	建议,default最好写上,而且写在最后;
		switch (a) {
		case 1:
			System.out.println("春天");
			break;
		case 2: 
			System.out.println("夏天");
			break;
		case 3:
			System.out.println("秋天");
			break;
		case 4:
			System.out.println("冬天");
			break;
		default:
			System.out.println("error");
			break;

		}
		scanner.close();
		
		*/
		
		
	}

}
