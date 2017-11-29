package com.game2;

public class Player {
	
	private String name;
	private boolean isDie;
	// 构造函数
	public Player() {
		super();
	}
	public Player(String name) {
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
	public boolean isDie() {
		return isDie;
	}
	public void setDie(boolean isDie) {
		this.isDie = isDie;
	}
	// 开枪
	public void Openfire(Gun gun,int i) {
		System.out.println("枪交给"+this.name);
		if (i == gun.getBullen()) {
			System.out.println(this.name+"开枪,"+this.name+"死了");
			this.isDie = true;
		}else
		System.out.println(this.name+"开枪,没有子弹打出");
	}

}
