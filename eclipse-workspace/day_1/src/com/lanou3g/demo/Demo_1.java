package com.lanou3g.demo;

import java.util.Scanner;

/**
 * 运算符
 * 算数运算符	+ - / * %
 * 赋值运算符	=	+=	/=	*=	-=	%=	++	--
 * 比较运算符	>	<	>=	<=	!=	==
 * 逻辑运算符	&& || !
 * 	&&短路情况: 当条件一确定不成立时,条件二不会执行
 * 	||短路情况: 当条件一确定成立时,条件二不会执行
 * 条件表达式(三元表达式) 		//  (条件) ? 方法1 : 方法2
 * 当条件成立时,返回方法1  当条件不成立的时候,返回方法二
 * (a > b) ? a : b;		
 * 
 * 分支结构
 * 执行结构
 * 1.顺序执行
 * 2.分支执行
 * 3.循环执行
 * 
 * @author lanou
 *
 */
public class Demo_1 {
	
	// 枚举
	// 提高代码的阅读
	enum Season{
		spring,
		summer,
		autnum,
		winter,
	}

	public static void main(String[] args) {
/*
		// 判断两个数字相等

		// 使用比较运算符比较后,只会返回一个值,不是true,就是false
		boolean result1 = (10 == 5);
		System.out.println(result1);
		
		// 判断两个字符串相等
		// 需要使用字符串中给定的方法
		String str1 = "Nice_try";
		String str2 = "Nice_try";
		boolean result2 = str1.equals(str2);
		System.out.println(result2);
*/
		/*
		// 逻辑与 短路
		int a = 5;
		int b = 6;
		boolean rel = (a > b) && (a > ++b);
		System.out.println("rel = " + rel + " a = " + a + " b = " + b );
		// 逻辑或短路
		rel = !((a < b ) || (a < ++b));
		System.out.println(rel);
		System.out.println(a);
		System.out.println(b);
		*/
		
		// 条件表达式
		// 需求,返回两个数的 最大值
		/*
		int a = 5;
		int b = 6;
		System.out.println("请输入a的值:");
		Scanner scanner1  =  new Scanner(System.in);
		a = scanner1.nextInt();
		System.out.println("请输入b的值:");
		Scanner scanner2 = new Scanner(System.in);
		b = scanner2.nextInt();
		System.out.println(a + "和" + b + "的最大值是:");
		System.out.println( a > b ? ("a = " + a) : ("b = " +b));
			*/
		/*
		// 作业; 使用三目运算符,判断三个数的最大值
		int a = 5;
		int b = 6;
		int c = 7;
		int d = a > b ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println(d);
		*/
		
		// 分支形式
		// condition成立时,执行执行语句,否则,不执行
		// if形式1
		/*
		if (condition) {
			执行语句
		}
		*/
		
		// condition 成立时,执行执行语句1,否则,执行语句2
		// if形式2
		/*
		if (condition) {
			执行语句1
		} else {
			执行语句2
		}
		*/
		
		// condition1 成立时,执行语句1,否则,判断condition2,成立时,执行语句2,否则....
		// if语句3
		// 一个if语句中,else最多只能有一个,并且只能在if语句的最后.
		/*
		if (condition1) {
			语句1
		}else if (condition2) {
			语句2
		}
		*/
		
		// switch分支
		// 如果,case中执行的语句超过一条,需要加上大括号
		// break  跳出整个switch的语句
		
		/*
		switch (key) {
		// 满足条件执行语句
		case value:
			语句
			break;	// 跳出整个switch语句
		// 都不满足,default
		default:
			break;
		}
		*/
		/*
		// 获取枚举中的其中一个值
		Season spring = Season.spring;
		System.out.println(spring);
		*/
		
		// 什么时候使用 if     什么时候使用switch
		// 如果值是区间,使用if,会简便一点
		// 如果判断的值,是少数的几个数字或者字符或者字符串,可以使用switch,效率会略高
		// if的使用率会高一点
	}
	
}











