package com.game;

import java.util.Scanner;


/**
 * 游戏类
 * 
 *
 */
public class Game {
	private Player player;
	private Computer computer;
	// 无参构造方法
	public Game() {
		
	}
	
	// get/set方法
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public Computer getComputer() {
		return computer;
	}
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
	// 游戏开始
	public void gameStart() {
		System.out.println("欢迎来到low到爆炸的控制台人机对战剪刀石头布游戏");
		System.out.println("请输入您的马甲:");
		Scanner scanner  = new Scanner(System.in);
		String name = scanner.nextLine();
		// 初始化玩家对象
		player = new Player(name);
		
		System.out.println("玩家"+ player.getName()+",祝你游戏愉快");
		computer = selectComputer();
		System.out.println("您的对手是"+computer.getName());
		while(true)
		{
			juder(player, computer);
		}
	}
	// 选择对战的电脑
	public Computer selectComputer() {
		System.out.println("请选择您的对手:");
		System.out.println("1.气质型男");
		System.out.println("2.高冷帅哥");
		System.out.println("3.大屌萌妹");
		Scanner scanner = new Scanner(System.in);
		int key = scanner.nextInt();
		switch (key) {
		case 1:	
			computer = new Computer("气质型男");
			break;
		case 2:
			computer = new Computer("高冷帅哥");
			break;
		case 3:
			computer = new Computer("大屌萌妹");
			break;
		default:
		{
			System.out.println("error,请重新选择您的对手");
			selectComputer();
			break;
		}
		}		
		return computer;
	}
	// 判断输赢
	public void juder(Player p,Computer c) {
		p.showFist();
		int P = p.getFist();
		if(P==0) {
			over();
		}
//		int key = P-c.showFist();			// 普通模式
		int key = P-c.showFist(P);			// 简单模式
//		int key = P-c.showFist1(P);			// 地狱模式
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
			 c.setScore(c.getScore()+1);
			 break;
		}
		case -1:
		case 2:
		{
			System.out.println("你赢了");
			p.setScore(p.getScore()+1);
			break;
		}
		default:
			break;
		}
		
	}
	// 游戏结束
	public void over() {
		System.out.println(player.getName()+"的得分为:"+player.getScore());
		System.out.println(computer.getName()+"的得分为:"+computer.getScore());
		if(player.getScore()==computer.getScore())System.out.println("平局");
		else
		System.out.println("最后的胜利者为"+(player.getScore()>computer.getScore()?player.getName():computer.getName()));
		System.exit(0);
	}
}
