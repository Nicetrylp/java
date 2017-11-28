package game_2048;

import java.util.Random;
import java.util.Scanner;

public class Game_2048 {
	
	public static int counter;
	
	public static void main(String[] args) {
		start();
	}
	// 游戏开始
	public static void start() {
		int [][]map = new int[4][4];	// 初始化数组
		counter = 1;
		initialize(map);
		while(gameOver(lose(map), win(map)))
		{
			move(map);
			addNumber(map);
			print(map);
		}
		System.out.println("游戏结束");	
	}
	
	// 初始化
	public static void initialize(int[][]map) {
		addNumber(map);
		print(map);
	}
	// 输出数组
	public static void print(int[][]map) {
		for (int[] is : map) {
			for (int i : is) {
				System.out.print(i+"\t");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	// 添加一个随机元素
	public static void addNumber(int[][]map) {
		while(counter!=0 && lose(map)) {
		int a = new Random().nextInt(16);
		if(map[a/4][a%4] == 0) {
			int b = (new Random().nextInt(2)+1)*2;
			map[a/4][a%4] = b;
			break;
		}
		}
	}
	// 失败判断条件
	public static boolean lose(int[][]map) {
		for (int[] is : map) {
			for (int i : is) {
				if(i == 0) {
					return true;
				}
			}
		}
		return false;
	}
	
	// 胜利判断条件
	public static boolean win(int[][]map) {
		for (int[] is : map) {
			for (int i : is) {
				if(i == 2048)
					return false;
			}
		}
		return true;
	}
	
	// 游戏结束判断
	public static boolean gameOver(boolean lose,boolean win) {
		if(lose == false) {
			System.out.println("你输了");
			return false;
		}else if(win == false) {
			System.out.println("你赢了");
			return false;
		}else {
			return true;
		}
	}
	
	// 移动函数
	public static void move(int [][]map) {
		counter = 0;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String nextLine = scanner.nextLine();
		char key = nextLine.charAt(0);
		switch (key) {
		case 'w':
		case 'W':
			moveTop(map);
			break;
		case 's':
		case 'S':
			moveDown(map);
			break;
		case 'a':
		case 'A':
			moveLeft(map);
			break;
		case 'd':
		case 'D':
			moveRight(map);
			break;

		default:
			System.out.println("error");
			move(map);
			break;
		}
	}
	
	// 向左移动
	public static void moveLeft(int[][]map) {
		for(int i = 0;i<4;i++) {
			int newNumber = 10;
			for(int j = 1;j < 4;j++) {
				int k = j-1;
				while(k>=1 && map[i][k]==0) {
					--k;
				}
				if(map[i][j]!=0) {
					if(map[i][k] ==0) {
						map[i][k] = map[i][j];
						map[i][j] = 0;
						++counter;
					}else if(map[i][k] == map[i][j] && k!=newNumber) {
						map[i][k]*=2;
						newNumber = k;
						map[i][j] = 0;
						++counter;
					}else if((k+1)!=j){
						map[i][k+1] = map[i][j];
						map[i][j] = 0;
						++counter;
					}
				}
			}
		}
	}
	
	// 向右移动
	public static void moveRight(int[][]map) {
		for(int i=0;i<4;i++) {
			int newNumber = 10;
			for(int j=2;j>=0;j--) {
				int k = j+1;
				while(k<3 && map[i][k]==0) {
					k++;
				}
				if(map[i][j]!=0) {
					if(map[i][k] == 0) {
						map[i][k] = map[i][j];
						map[i][j] = 0;
						++counter;
					}else if(map[i][k] == map[i][j] && k!=newNumber) {
						map[i][k]*=2;
						newNumber = k;
						map[i][j] =0;
						++counter;
					}else if(k != (j+1)) {
						map[i][k-1] = map[i][j];
						map[i][j] = 0;
						++counter;
					}
				}
			}
		}
	}
	
	// 向上移动
	public static void moveTop(int[][]map) {
		for(int j = 0;j<4;j++) {
			int newNumber = 10;
			for(int i=1;i<4;i++) {
				int k = i-1;
				while(k>0 && map[k][j] == 0) {
					--k;
				}
				if(map[i][j] != 0) {
					if(map[k][j] == 0) {
						map[k][j] = map[i][j];
						map[i][j] = 0;
						++counter;
					}else if(map[k][j] == map[i][j] && k!=newNumber) {
						map[k][j]*=2;
						newNumber = k;
						map[i][j] =0;
						++counter;
					}else if(k != (i-1)) {
						map[k+1][j] = map[i][j];
						map[i][j] = 0;
						++counter;
					}
				}
			}
		}
	}
	
	// 向下移动
	public static void moveDown(int[][]map) {
		for(int j=0;j<4;j++) {
			int newNumber = 10;
			for(int i=2;i>=0;i--) {
				int k = i+1;
				while(k<3 && map[k][j]==0) {
					k++;
				}
				if(map[i][j] != 0) {
					if(map[k][j] == 0) {
						map[k][j] = map[i][j];
						map[i][j] = 0;
						++counter;
					}else if(map[k][j] == map[i][j] && k!=newNumber) {
						map[k][j]*=2;
						newNumber = k;
						map[i][j] = 0;
						++counter;
					}else if( k != (i+1)) {
						map[k-1][j] = map[i][j];
						map[i][j] = 0;
						++counter;
					}
				}
			}
		}
	}
	
	// 测试数组
	public static int[][] testMap() {
		int[][] array = {
				{8,8,16,32},
				{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0}
		};
		
		int[][] array2 = {
				{1024,1024,0,0},
				{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0}
		};
		
		int[][] array3 = {
				{4,8,16,32},
				{8,4,32,16},
				{4,8,16,32},
				{8,4,32,16},
		};
		return array2;
	}
}
