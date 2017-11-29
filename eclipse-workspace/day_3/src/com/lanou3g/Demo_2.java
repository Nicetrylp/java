package com.lanou3g;
/**
 * 数组
 * 什么是数组?		容器	可以盛放 一组 数据(相同类型的)
 * 如何来盛放?		根据下标来存放数据
 *
 */
public class Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 定义一个数组,长度为3,名字 array
		// 数组中只能存储int型数据
		// new 这个关键字代表在 堆内存 中开辟一块空间
		// 使用 new 为关键字分配内存时,整型数组中个元素都初始化为0
		// int [] array = new int [3];
		// for (int i : array) {
		//	System.out.println(i);
		// }
		
		// ArrayIndexOutOfBoundsException
		// 数组越界异常`
		// array[5] =10;
		
		
		// NullPointerException
		// 空指针异常:访问了一块不存在的空间
		// array = null;
		// System.out.println(array[1]);
		// 定义数组的两种形式
		// 形式1
		int[] array = new int[3];
		//形式2
		int[] array1 = new int [] {1,3,5,7,9};
		
		// 遍历数组
		for (int i = 0; i < array1.length; ++i) {
			System.out.println(array1[i]);
		}
		// 遍历数组中的元素,使用foreach
		for (int i : array1) {
			System.out.println(i);
		}
		
		//
		fun1(10);
		
	}
	public static void printArray(int [] array) {
		for(int i=0;i<array.length;++i) {
			if(i == array.length-1) {
				System.out.println(array[i]);
				break;
			}
			System.out.print(array[i] + ",");
		}
		
	}
	
	public static void fun1(int a) {
		int [] array = new int [a];
		for(int i = 0; i < array.length; ++i) {
			array[i] = (int)(Math.random()*91+10);
		}
		printArray(array);
	}
	
}
