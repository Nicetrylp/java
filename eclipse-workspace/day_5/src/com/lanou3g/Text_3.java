package com.lanou3g;

import java.util.Scanner;

public class Text_3 {
	// main�������ɻ�
	public static void main(String[] args) {
		
		fun();		// ��8��
//		fun1(); 	// ��7��
	}
	// ��7��
	public static void  fun1() {
		CellGame cellGame = new CellGame();
		printCell(cellGame); //�õ�ʱ��ע��printCell�����һ��
		cellGame.moveRight();
		printCell(cellGame);
		cellGame.moveRight(3);
		printCell(cellGame);
	}
	
	// ���Ժ���
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
	
	// �ƶ�����
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
			System.out.println("��Ϸ����");
			cellGame.setOver(true);
			break;
		}
		default:
			System.out.println("����������");
			break;
		}
	}
	
	// ��ӡ����
	public static void printCell(CellGame cellGame) {
		System.out.println("Cell��λ����:(" + cellGame.getX() + "," + cellGame.getY() + ")");
		for(int i = 0;i < 20;++i) {
			for(int j = 0;j < 10;++j) {
				if(cellGame.getX() == j && cellGame.getY() == i)
					System.out.print("* ");
				else
					System.out.print("_ ");
			}
			System.out.println();
		}
		System.out.println("1-����    2-����   3-����    0-�˳�");
	}

}

class CellGame{
	private int x;	// x����
	private int y;	// y����
	private boolean over;	// ��Ϸ������־
	// �޲ι��캯��
	public CellGame() {
		x = 3;
		y = 3;
		over = false;
	}
	
	//get �� set����
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
	//�ƶ�����
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