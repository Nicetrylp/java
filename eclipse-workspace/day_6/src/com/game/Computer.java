package com.game;

import java.util.Random;

/**
 * 电脑类
 * 
 *
 */
public class Computer {
	private String name;
	private int score;
	// 无参构造函数
	public Computer(){
		
	}
	// 有参构造函数
	public Computer(String name) {
		super();
		this.name = name;
	}

	// get/set方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	// 电脑出拳方法1
	public int showFist() {
//		int key =(int)( Math.random()*3+1);
		int key = new Random().nextInt(3)+1;//产生1-3的随机整数
		String fist  = "石头";
		switch (key) {
		case 1:
			break;
		case 2:
			fist = "剪刀";
			break;
		case 3:
			fist = "布";
			break;
		}
		System.out.println(name+"出的是:"+fist);
		return key;
		
	}
	// 电脑出拳方法2(玩家必胜)
	public int showFist(int P) {
		int key = P+1;
		String fist  = "石头";
		switch (key) {
		case 1:
			break;
		case 2:
			fist = "剪刀";
			break;
		case 3:
			fist = "布";
			break;
		}
		System.out.println(name+"出的是:"+fist);
		return key;
		
	}
	
	// 电脑出拳方法3(玩家必输)
	public int showFist1(int P) {
		int key = P+1;
		String fist  = "石头";
		switch (key) {
		case 1:
			break;
		case 2:
			fist = "剪刀";
			break;
		case 3:
			fist = "布";
			break;
		}
		System.out.println(name+"出的是:"+fist);
		return key;
		
	}
}
