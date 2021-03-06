package com.lanou3g;

import java.util.Scanner;

public class Demo_1 {

	public static void main(String[] args) {
		fun();
	}
	// 测试函数
	public static void fun() {
		System.out.println("欢迎进入石头剪刀布游戏");
		Player player1 = new Player();	// 玩家类
		Player player2 = new Player();	// 电脑类
		player1 =  inputName();
		player2 =  selectComputer();
		// 死循环一枚
		while(true) {
			print();
//			game(player1);
//			computer(player2);
			gameNice(player1, player2);
			judge(player1, player2);
			System.out.println("是否继续?0:退出\t任意键: 继续 ");
			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			if(a == 0)
				break;
		}
		System.out.println("游戏结束");
		System.out.println("你当前的积分为"+player1.getScore());
		System.out.println(player2.getName()+"当前的积分为"+player2.getScore());
		over(player1.getScore(), player2.getScore());
	}
	// 输入玩家姓名
	public static Player inputName() {
		Player player1 = new Player();
		System.out.println("请输入您的姓名");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		player1.setName(name);
		System.out.println("你的ID为"+player1.getName() +"祝你游戏愉快");
		return player1;
	}
	// 选择对战的电脑
	public static Player selectComputer() {
		Player player = new Player();
		System.out.println("请选择您的对手:");
		System.out.println("1.美女");
		System.out.println("2.帅哥");
		System.out.println("3.大屌萌妹");
		Scanner scanner = new Scanner(System.in);
		// 选择什么就给电脑取什么名
		int key = scanner.nextInt();
		switch (key) {
		case 1:
			player.setName("美女");
			break;
		case 2:
			player.setName("帅哥");
			break;
		case 3:
			player.setName("大屌萌妹");
			break;

		default:System.out.println("error");
			break;
		}
		return player;
	}
	// 出拳提示
	public static void print() {
		System.out.println("请选择你要出的拳:");
		System.out.println("1: 石头\t2:剪刀\t3:布");
	}
	
	// 玩家出拳
	public static void game(Player player) {
		// 键盘键入123分别代表石头剪刀布
		Scanner scanner = new Scanner(System.in);
		int key = scanner.nextInt();
		switch (key) {
		case 1:
		case 2:
		case 3:
			player.setPunch(key);
			break;

		default:
		{
			System.out.println("error");
			print();
			game(player);
			break;
		}
		}
	}
	// 电脑出拳
	public static void computer(Player player) {
		// 使用随机数来判断电脑的出拳
		int punch = (int)( Math.random()*3+1);
		player.setPunch(punch);
	}
	
	// 玩家全胜玩法
	public static void gameNice(Player player1,Player player2) {
		// 键盘键入123分别代表石头剪刀布
				Scanner scanner = new Scanner(System.in);
				int key = scanner.nextInt();
				switch (key) {
				case 1:
				case 2:
				case 3:
					player1.setPunch(key);
					break;

				default:
				{
					System.out.println("error");
					print();
					game(player1);
					break;
				}
				}
				int a = player1.getPunch()+1;
				if(a > 3)
					a-=3;
				player2.setPunch(a);
	}
	
	// 判断输赢
	public static void judge(Player player1,Player player2) {
		// 输赢就这么几种,用case很好判断
//		0 -1 -2    1 0 -1   2 1 0
//		平 赢 输	      输  平  赢        赢  输  平
		System.out.println("你出的是"+bunch(player1));
		System.out.println(player2.getName()+"出的是"+bunch(player2));
		int key = player1.getPunch()-player2.getPunch();
		switch (key) {
		case 0:
		{
			System.out.println("平局");
			break;
		}
		case 1:
		case -2:
		{
			System.out.println("你输了");
			 addScore(player2);
			 break;
		}
		case -1:
		case 2:
		{
			System.out.println("你赢了");
			addScore(player1);
			break;
		}
		default:
			break;
		}
//		System.out.println("你当前的积分为"+player1.getScore());
//		System.out.println(player2.getName()+"当前的积分为"+player2.getScore());
	}
	
	
	// 加分
	public static void addScore(Player player) {
		int k = player.getScore();
		k++;
		player.setScore(k);
	}
	
	// 输出石头剪刀布
	public static String bunch(Player player) {
		if (player.getPunch() ==1) {
			return "石头";
		} else if (player.getPunch() ==2) {
			return "剪刀";
		} else {
			return "布";
		}
	}
	
	// 游戏结束后的判断输赢
	public static void over(int a,int b) {
		if(a > b) {
			System.out.println("你赢了");
		}else if (a < b) {
			System.out.println("你输了");
		}else {
			System.out.println("平局");
		}
	}

}


/**
 * 
 * 玩家类
 *
 */
class Player{
	private String name;// 名字
	private int punch;	// 出拳
	private int score;	// 积分
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPunch() {
		return punch;
	}
	public void setPunch(int punch) {
		this.punch = punch;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}