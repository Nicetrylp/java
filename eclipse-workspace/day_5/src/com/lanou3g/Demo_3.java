package com.lanou3g;

import java.awt.Paint;

public class Demo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		paint();
		// 引用类型的变量会自动赋初始值
		Cell cell = new Cell();
		System.out.println( cell.x + "," +cell.y);
		cell .x = 1;
		cell.y =1;
//		cell.drop();
		paint(cell);
//		paint( new Cell()); 	// 使用匿名对象作为参数
		
	}
	public static void paint() {
		for(int i = 0; i < 5;++i) {
			for(int j = 0; j < 10; ++j) {
				System.out.print("_ ");
			}
			System.out.println();
		}
	}
	// 重载
	public static void paint(Cell cell) {
		for(int i = 0; i < 5;++i) {
			for(int j = 0; j < 10; ++j) {
				if(cell.x == j && cell.y == i)
					System.out.print("* ");
				else
					System.out.print("_ ");
			}
			System.out.println();
		}
	}
	

}

/**
 * 定义一个格子类
 */
// 类名使用大驼峰命名法
// 变量和方法名使用小驼峰命名法
class Cell{
	int x;
	int y;
	/*
	 * 构造函数的规则
	 * 1.如果你不添加构造方法,系统会默认给你添加
	 * 2.构造方法没有返回值
	 * 3.构造方法名与类名一致
	 */
	public Cell() {
		// 这就是一个构造方法(无参的)
		x = 1;
		y = 1;
	}
	/**
	 * 下降的方法
	 */
	public void drop() {
		++y;
	}
	/*
	 * 
	 */
}
