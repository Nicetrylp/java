package com.lanou3g;
/**
 * 循环: 流程控制之一
 * do-while
 * while
 * for(以后开发用的最多)
 * @author lanou
 *
 */
public class Deme_1 {

	public static void main(String[] args) {
		// 初始化一个变量,作为循环的判断条件
		int i = 0;
		// while循环
		while(i < 10) {
			System.out.println("今天星期三");
			++i;	// 循环增量
		}
		i = 0;
		// do-while 循环
		do {
			System.out.println("jtxqs" + i);
			++i;
		} while (i<10);
		// for循环
		for( int k = 0;k < 10 ; ++k) {
			System.out.println("星期三" + k);
		}
	}

}
