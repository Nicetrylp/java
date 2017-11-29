package com.lanou3g;
/**
 * 函数:
 * 封装了 特定功能的 一个代码块
 * 增加了代码的复用性
 * 
 * 函数的结构: 
 * 关键字 返回值类型 函数名 (参数类型 参数1,参数类型 参数2,...){
 * 		函数体;
 * 		return 返回值;
 * }
 */
public class Demo_8 {
// 函数需要放类里面
	
	// 一般来说 main函数只做函数的调用
	public static void main(String[] args) {
//		fun();
//		int sum;
//		sum = sum(2,3,4);
//		System.out.println(sum);
		// 调用函数
		fun2(3, 4);
	}
	
	//定义一个函数
		public static void fun() {
			System.out.println("你好");
		}
		
	//求和函数
		public static int sum(int a, int b) {
			return a + b;
		}
		
		//编写一个函数,实现,打印n行m列的星星
		public static void fun2( int n, int m) {
			for(int i = 0; i < n ; ++i) {
				for(int j = 0; j < m ; ++j) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		// 编写函数,计算并返回三个数的和
		public static int sum(int a,int b,int c) {
			return a+b+c;
		}

}
