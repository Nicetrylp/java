package com.game2;

import java.util.Random;

public class Gun {
	private int space;
	private int bullen;
	public Gun() {
		super();
		space = 6;
		bullen = new Random().nextInt(6)+1;
	}
	public int getSpace() {
		return space;
	}
	public void setSpace(int space) {
		this.space = space;
	}
	public int getBullen() {
		return bullen;
	}
	public void setBullen(int bullen) {
		this.bullen = bullen;
	}
	
	
}
