package com.lanou3g;

import java.util.Scanner;

public class Text_3 {
	// main函数不干活
	public static void main(String[] args) {
		
		fun();		// 第8题
//		fun1(); 	// 第7题
	}
	// 第7题
	public static void  fun1() {
		CellGame cellGame = new CellGame();
		printCell(cellGame); //用的时候注释printCell的最后一句
		cellGame.moveRight();
		printCell(cellGame);
		cellGame.moveRight(3);
		printCell(cellGame);
	}
	
	// 测试函数
	public static void fun() {
		CellGame cellGame = new CellGame();
		printCell(cellGame);
		while(true) {
			move(cellGame);
			if(cellGame.isOver()) {
				break;
			}
			printCell(cellGame);
		}
	}
	
	// 移动方法
	public static void move(CellGame cellGame) {
		Scanner scanner = new Scanner(System.in);
		int key = scanner.nextInt();
		switch (key) {
		case 1:
			cellGame.moveDown();
			break;
		case 2:
			cellGame.moveLeft();
			break;
		case 3:
			cellGame.moveRight();
			break;
		case 0:
		{
			System.out.println("游戏结束");
			cellGame.setOver(true);
			break;
		}
		default:
			System.out.println("请重新输入");
			break;
		}
	}
	
	// 打印函数
	public static void printCell(CellGame cellGame) {
		System.out.println("Cell的位置是:(" + cellGame.getX() + "," + cellGame.getY() + ")");
		for(int i = 0;i < 20;++i) {
			for(int j = 0;j < 10;++j) {
				if(cellGame.getX() == j && cellGame.getY() == i)
					System.out.print("* ");
				else
					System.out.print("_ ");
			}
			System.out.println();
		}
		System.out.println("1-下落    2-向左   3-向右    0-退出");
	}

}

class CellGame{
	private int x;	// x坐标
	private int y;	// y坐标
	private boolean over;	// 游戏结束标志
	// 无参构造函数
	public CellGame() {
		x = 3;
		y = 3;
		over = false;
	}
	
	//get 与 set方法
	public boolean isOver() {
		return over;
	}
	public void setOver(boolean over) {
		this.over = over;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	//移动函数
	public void moveLeft() {
		--x;
	}
	public void moveLeft(int x) {
		this.x = this.x - x;
	}
	public void moveRight() {
		++x;
	}
	public void moveRight(int x) {
		this.x = this.x + x;
	}
	public void moveDown() {
		++y;
	}
	public void moveDown(int y) {
		this.y = this.y + y;
	}
}