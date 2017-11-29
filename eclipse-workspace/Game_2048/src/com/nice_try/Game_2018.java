package com.nice_try;

import java.util.Scanner;

/**
 * 2048
 * ����֮ǰ������˵�����Ϸ��,һֱ������
 * �Ͼ�������������һ��ţ��xx������
 * ִ��˳��: ��ʼ��һ����ͼ - �������һ��Ԫ�� - ��� -���뷽�� - �ƶ� - ���-����Ԫ��...
 * �ж�����: �޷�������Ԫ�� -- lose --����
 * �ж�����: ���ֵΪ2048 -- win  --����
 * �ƶ�: �� ����,������,��     �����0,����λ��
 */


public class Game_2018 {
	 static int add ;

	public static void main(String[] args) {
		// 2048С��Ϸ����
		add = 1;
		fun();
		
	}
	
	public static void fun() {
		int[][] map = Init();//��ʼ��
		while(true)	//���ﻹ��bug,�պ��ٸ�
		{
		//System.out.println(add);
		if(add != 0) {
		boolean boo = add(map);
		if(boo)
			break;}
		printArray(map);//���
		Move(map);
		}
		System.out.println("��Ϸ����");
	}

	// ��ʼ������
	public static int[][] Init() {
		// �ö�ά���黹��һά����,���Կ���һ��
		// һά������Ż�
		int[][] map= new int[4][4];
		return map;
	}
	// ����Ԫ��
	public static boolean add(int[][] map) {
		while(addJudge(map)) //�����һ���ж�����
		{
			int m = (int)(Math.random()*16);
			if(map[m/4][m%4] == 0) {
				map[m/4][m%4] = (int)(Math.random()*2+1)*2;
				return false;
			}
		}
		return true;
	}
	
	public static boolean addJudge(int[][]map) {
		for(int i = 0 ; i<4;i++)
			for(int j = 0;j<4;j++)
			{
				if(map[i][j]==0)
					return true;
			}
		return false;
	}
	
	// �����������
	public static void printArray(int[][]map) {
		for (int[] is : map) {
			for (int i : is) {
				System.out.print(i+"\t");
			}
			System.out.println();
		}
	}
	
	// ���뷽��
	public static char Input() {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		char cha = string.charAt(0);		 
		return cha;
	}
	
	// �ƶ�
	public static void Move(int[][]map) {
		char key = Input();
		switch (key) {
		case 'w':
		{
			add = 0;
			moveTop(map);
			break;
		}
		case 'a':
		{
			add = 0;
			moveLeft(map);
			break;
		}
		case 's':
		{
			add = 0;
			moveDown(map);
			break;
		}
		case 'd':
		{
			add = 0;
			moveRight(map);
			break;
		}
		default:
		{
			//add = 0;
			Move(map);
			break;
		}
		}
	}
	
	// �����ƶ�
	public static void moveLeft(int[][]map) {
		for(int i=0;i<4;++i) {
			moveLeft(map[i]);				
		}
	}
	public static void moveLeft(int[]map) {
		for(int j = 1;j<4;++j) {
			int k = j;
			while(map[k-1]==0) {
				if(k<=1)
					{break;}
				k--;
			}
			if(map[j]!=0) {
			if(map[j] == map[k-1]) {
				map[k-1]*=2;
				map[j]=0;
				add ++;
			}else if(map[k-1]==0) {
				map[k-1] = map[j];
				map[j]=0;
				add ++;
			}else if(k!=j){
				map[k]=map[j];
				map[j]=0;
				add ++;
			}else {
				//add = false;
			}
			}
		}
	}
	
	// ����
	public static void moveRight(int [][]map) {
		for(int i=0;i<4;++i) {
			for(int j=2;j>=0;j--) {
				int k = j;
				while(map[i][k+1]==0) {
					if(k>=2)break;
					k++;
				}
				if(map[i][j]!=0) {
				if(map[i][j]==map[i][k+1]) {
					map[i][k+1]*=2;
					map[i][j]=0;
					add ++;
					//System.out.println("2");
				}else if (map[i][k+1]==0) {
					map[i][k+1] = map[i][j];
					map[i][j]=0;
					add ++;
					//System.out.println("2");
				}else if (k!=j) {
					map[i][k]=map[i][j];
					map[i][j]=0;
					add ++;
					//System.out.println("2");
				}else {
					//add = false;
					//System.out.println("1");
				}
				}
			}
		}
	}
	// ����
	public static void moveTop(int [][]map) {
		for(int i=0;i<4;++i) {
			for(int j=1;j<4;j++) {
				int k = j;
				while(map[k-1][i]==0) {
					if(k<=1)break;
					k--;
				}
				if(map[j][i]!=0) {
				if(map[j][i]==map[k-1][i]) {
					map[k-1][i]*=2;
					map[j][i]=0;
					add ++;
				}else if (map[k-1][i]==0) {
					map[k-1][i] = map[j][i];
					map[j][i]=0;
					add ++;
				}else if (k!=j) {
					map[k][i]=map[j][i];
					map[j][i]=0;
					add ++;
				}else {
				}
				}
			}
		}
	}
	// ����
	public static void moveDown(int [][]map) {
		for(int i=0;i<4;++i) {
			for(int j=2;j>=0;j--) {
				int k = j;
				while(map[k+1][i]==0) {
					if(k>=2)break;
					k++;
				}
				if(map[j][i]!=0)
				if(map[j][i]==map[k+1][i]) {
					map[k+1][i]*=2;
					map[j][i]=0;
					add ++;
				}else if (map[k+1][i]==0) {
					map[k+1][i] = map[j][i];
					map[j][i]=0;
					add ++;
				}else if (k!=j) {
					map[k][i]=map[j][i];
					map[j][i]=0;
					add ++;
				}else {
				}
			}
		}
	}
}
