package com.nice_try;

import java.util.Scanner;

/**
 * 2048
 * 很早之前就听人说这个游戏了,一直想试试
 * 毕竟这是萌新眼中一个牛逼xx的玩意
 * 执行顺序: 初始化一个地图 - 随机出现一个元素 - 输出 -键入方向 - 移动 - 输出-出现元素...
 * 判断条件: 无法出现新元素 -- lose --结束
 * 判断条件: 求和值为2048 -- win  --继续
 * 移动: ← 左到右,如果相等,加     如果是0,交换位置
 */


public class Game_2018 {
	 static int add ;

	public static void main(String[] args) {
		// 2048小游戏初试
		add = 1;
		fun();
		
	}
	
	public static void fun() {
		int[][] map = Init();//初始化
		while(true)	//这里还有bug,日后再改
		{
		//System.out.println(add);
		if(add != 0) {
		boolean boo = add(map);
		if(boo)
			break;}
		printArray(map);//输出
		Move(map);
		}
		System.out.println("游戏结束");
	}

	// 初始化数组
	public static int[][] Init() {
		// 用二维数组还是一维数组,可以考虑一下
		// 一维数组更优化
		int[][] map= new int[4][4];
		return map;
	}
	// 加入元素
	public static boolean add(int[][] map) {
		while(addJudge(map)) //这里加一个判断条件
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
	
	// 测试输出数组
	public static void printArray(int[][]map) {
		for (int[] is : map) {
			for (int i : is) {
				System.out.print(i+"\t");
			}
			System.out.println();
		}
	}
	
	// 键入方向
	public static char Input() {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		char cha = string.charAt(0);		 
		return cha;
	}
	
	// 移动
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
	
	// 向左移动
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
	
	// 右移
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
	// 上移
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
	// 下移
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
