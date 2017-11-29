package com.lanou3g;

import java.util.Scanner;
/**
 * 
 * 迷宫
 *
 */
public class Labyrinth {

	static int X;	// 定义全局变量,用来保存0元素的X轴坐标
	static int Y;	// 定义全局变量,用来保存0元素的Y轴坐标
	static int x;	// 定义全局变量,用来保存0元素相邻元素的X轴坐标
	static int y;	// 定义全局变量,用来保存0元素相邻元素的Y轴坐标

	// main函数是摆设,不干活
	public static void main(String[] args) {
		
		trial(); //运行测试函数
	}
	
	// 测试函数,脏活累活我来干
	public static void trial() {
		char[][]map = initialize();	// 初始化地图
		printLaby(map);	// 控制台打印输出初始地图
		while(true) {	// 死循环
		realize(map);	// 0元素移动函数
		if(Y == 9 || Y==0 || X == 0 || X == 8) {	// 当0元素移动到地图边界时,游戏结束
			System.out.println("你赢了");
			break;
		}
		}
	}
	
	// 初始化迷宫地图
	public static char[][] initialize() {
		char[][] map = {
				// 好像这个标记没什么用的说
			//	  0	  1   2   3   4   5   6   7   8   9
				{'#','#','#','#','#','#','#','#','#','#'},// 0
				{'#','0',' ',' ',' ',' ','#','#','#','#'},// 1
				{'#','#',' ','#','#','#','#',' ',' ',' '},// 2
				{'#','#',' ',' ','#',' ',' ','#',' ','#'},// 3
				{'#','#','#',' ','#',' ','#','#',' ','#'},// 4
				{'#',' ',' ',' ',' ','#',' ',' ',' ','#'},// 5
				{'#',' ','#','#',' ','#','#',' ','#','#'},// 6
				{'#',' ',' ','#',' ',' ',' ',' ','#','#'},// 7
				{'#','#','#','#','#','#','#','#','#','#'},// 8
				
		};
		//	获取0元素的初始坐标
		for(int i = 0; i<map.length;++i)
			for(int j = 0;j<map[i].length;++j)
				if(map[i][j] == '0') {
					X = i;
					Y = j;
				}
		
//		X = 1;	// 0元素的初始位置x
//		Y = 1;	// 0元素的初始位置y
		return map;	
	}
	// 控制台打印输出迷宫
	public static void printLaby(char[][]map) {
		for (char[] cs : map) {
			for (char c : cs) {
				System.out.print(c);
			}
			System.out.println();
		}		
	}
	// 实现移动
	public static void realize(char[][]map) {
		char key = imo();
		switch (key) {
		case 'w':
		case 'W':
		{
			judge(-1, 0, map);//向上移动,x坐标-1
//			printLaby(map);
			break;
		}
		case 's':
		case 'S':
		{
			judge(1, 0, map);
//			printLaby(map);
			break;
		}
		case 'a':
		case 'A':
		{
			judge(0, -1, map);
//			printLaby(map);
			break;
		}
		case 'd':
		case 'D':
		{
			judge(0, 1, map);
//			printLaby(map);
			break;
		}

		default:System.out.println("请重新输入");
			break;
		}
		printLaby(map);
	}
	
	// 键入方向
	public static char imo() {
		System.out.println("请输入 W A S D...");
		Scanner scanner = new Scanner(System.in);	//控制台输入一个字符串
		String str = scanner.nextLine();	//接收输入的字符串
		char cha = str.charAt(0);	//获取输入的字符
//		scanner.close();	//这里为什么不close,因为close了报错啊,我也很绝望的好吧
		return cha;
	}
	
	// 交换位置
	public static void change(char[][]map) {	//为何要传数组进来,因为不传他喵的值改不了啊
		char temp = map[x][y];
		map[x][y] = map[X][Y];
		map[X][Y] = temp;
		// 交换后,0元素的初始位置将发生改变
		X = x;	
		Y = y;
	}
	
	// 判断条件	判断要不要移动
	public static void judge(int a,int b,char[][]map) {
		if(map[X+a][Y+b] != '#') {
			x=X+a;
			y=Y+b;
			change(map);
			}
	}
		
}
