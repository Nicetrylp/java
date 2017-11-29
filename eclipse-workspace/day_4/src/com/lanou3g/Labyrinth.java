package com.lanou3g;

import java.util.Scanner;
/**
 * 
 * �Թ�
 *
 */
public class Labyrinth {

	static int X;	// ����ȫ�ֱ���,��������0Ԫ�ص�X������
	static int Y;	// ����ȫ�ֱ���,��������0Ԫ�ص�Y������
	static int x;	// ����ȫ�ֱ���,��������0Ԫ������Ԫ�ص�X������
	static int y;	// ����ȫ�ֱ���,��������0Ԫ������Ԫ�ص�Y������

	// main�����ǰ���,���ɻ�
	public static void main(String[] args) {
		
		trial(); //���в��Ժ���
	}
	
	// ���Ժ���,����ۻ�������
	public static void trial() {
		char[][]map = initialize();	// ��ʼ����ͼ
		printLaby(map);	// ����̨��ӡ�����ʼ��ͼ
		while(true) {	// ��ѭ��
		realize(map);	// 0Ԫ���ƶ�����
		if(Y == 9 || Y==0 || X == 0 || X == 8) {	// ��0Ԫ���ƶ�����ͼ�߽�ʱ,��Ϸ����
			System.out.println("��Ӯ��");
			break;
		}
		}
	}
	
	// ��ʼ���Թ���ͼ
	public static char[][] initialize() {
		char[][] map = {
				// ����������ûʲô�õ�˵
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
		//	��ȡ0Ԫ�صĳ�ʼ����
		for(int i = 0; i<map.length;++i)
			for(int j = 0;j<map[i].length;++j)
				if(map[i][j] == '0') {
					X = i;
					Y = j;
				}
		
//		X = 1;	// 0Ԫ�صĳ�ʼλ��x
//		Y = 1;	// 0Ԫ�صĳ�ʼλ��y
		return map;	
	}
	// ����̨��ӡ����Թ�
	public static void printLaby(char[][]map) {
		for (char[] cs : map) {
			for (char c : cs) {
				System.out.print(c);
			}
			System.out.println();
		}		
	}
	// ʵ���ƶ�
	public static void realize(char[][]map) {
		char key = imo();
		switch (key) {
		case 'w':
		case 'W':
		{
			judge(-1, 0, map);//�����ƶ�,x����-1
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

		default:System.out.println("����������");
			break;
		}
		printLaby(map);
	}
	
	// ���뷽��
	public static char imo() {
		System.out.println("������ W A S D...");
		Scanner scanner = new Scanner(System.in);	//����̨����һ���ַ���
		String str = scanner.nextLine();	//����������ַ���
		char cha = str.charAt(0);	//��ȡ������ַ�
//		scanner.close();	//����Ϊʲô��close,��Ϊclose�˱���,��Ҳ�ܾ����ĺð�
		return cha;
	}
	
	// ����λ��
	public static void change(char[][]map) {	//Ϊ��Ҫ���������,��Ϊ����������ֵ�Ĳ��˰�
		char temp = map[x][y];
		map[x][y] = map[X][Y];
		map[X][Y] = temp;
		// ������,0Ԫ�صĳ�ʼλ�ý������ı�
		X = x;	
		Y = y;
	}
	
	// �ж�����	�ж�Ҫ��Ҫ�ƶ�
	public static void judge(int a,int b,char[][]map) {
		if(map[X+a][Y+b] != '#') {
			x=X+a;
			y=Y+b;
			change(map);
			}
	}
		
}
