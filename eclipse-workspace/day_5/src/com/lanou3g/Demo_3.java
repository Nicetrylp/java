package com.lanou3g;

import java.awt.Paint;

public class Demo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		paint();
		// �������͵ı������Զ�����ʼֵ
		Cell cell = new Cell();
		System.out.println( cell.x + "," +cell.y);
		cell .x = 1;
		cell.y =1;
//		cell.drop();
		paint(cell);
//		paint( new Cell()); 	// ʹ������������Ϊ����
		
	}
	public static void paint() {
		for(int i = 0; i < 5;++i) {
			for(int j = 0; j < 10; ++j) {
				System.out.print("_ ");
			}
			System.out.println();
		}
	}
	// ����
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
 * ����һ��������
 */
// ����ʹ�ô��շ�������
// �����ͷ�����ʹ��С�շ�������
class Cell{
	int x;
	int y;
	/*
	 * ���캯���Ĺ���
	 * 1.����㲻��ӹ��췽��,ϵͳ��Ĭ�ϸ������
	 * 2.���췽��û�з���ֵ
	 * 3.���췽����������һ��
	 */
	public Cell() {
		// �����һ�����췽��(�޲ε�)
		x = 1;
		y = 1;
	}
	/**
	 * �½��ķ���
	 */
	public void drop() {
		++y;
	}
	/*
	 * 
	 */
}
