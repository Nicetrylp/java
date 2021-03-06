package com.game2;

import java.util.Scanner;

public class Game {
	private Player[]players=new Player[2];
	private Gun gun = new Gun();
	public Game() {
		super();
	}
	public Player[] getPlayers() {
		return players;
	}
	public void setPlayers(Player[] players) {
		this.players = players;
	}
	public Gun getGun() {
		return gun;
	}
	public void setGun(Gun gun) {
		this.gun = gun;
	}
	// 游戏开始
	public void gameStart() {
		System.out.println("欢迎来到low到爆的控制台俄罗斯轮盘赌游戏");
		System.out.println("第一位勇士, 请输入您的名字:");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		players[0] = new Player();
		players[0].setName(name);
		System.out.println("第二位勇士,您的名字是?");
		name = scanner.nextLine();
		players[1] = new Player();
		players[1].setName(name);
		Openfire(players[0], players[1]);
	}
	// 轮流开枪方法
	public void Openfire(Player player1,Player player2) {
		System.out.println("参加对战的两位勇士分别是\t"+player1.getName()+"\t"+player2.getName());
		int i=0,j=1;
		do {
			++i;
			System.out.println("第"+i+"轮游戏开始");
			player1.Openfire(gun,j);
			if (player1.isDie()) {
				break;
			}
			j++;
			player2.Openfire(gun,j);
			j++;			
		} while (!player2.isDie());
		gameOver(i);
	}
	// 结束
	public void gameOver(int i) {
		System.out.println("\n游戏结束");
		System.out.print("经过"+i+"轮的激烈角逐后");
		System.out.println("最后的胜利者是:"+(players[1].isDie()?players[0].getName():players[1].getName()));
	}
}
