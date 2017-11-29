package com.lanou3g;
/**
 * for循环的嵌套
 * @author lanou
 *
 */
public class Demo_4 {

	public static void main(String[] args) {
		// for循环的嵌套
		/* 倒三角
		for(int i = 5; i > 0; --i) {
			for(int j = i; j > 0; --j) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		/*	正三角
		for(int i = 1; i < 6; ++i) {
			for(int j = 0; j < i; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		/*
		for(int i = 0; i < 5; ++i) {
			for(int j = 0; j < i+1; ++j) {
				System.out.print(j+1);
			}
			System.out.println();
		}*/
		
		//乘法表
		for(int i = 1; i <= 9; ++i) {
			for(int j = 1; j < i+1; ++j) {
				// \t 制表符(前面对齐)
				System.out.print(j + "*" + i + "=" + i*j + "\t");
			}
			System.out.println();
		}
	}

}
