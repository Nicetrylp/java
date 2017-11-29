package com.homework;

public class J extends Tetromino{
	
	public J() {
		super();
		array[0].x=1;
		array[1].x=1;
		array[1].y=1;
		array[2].x=1;
		array[2].y=2;
		array[3].y=2;
	}
	public J(int x) {
		super();
		array[0].x = x;
		array[1].y = 1;
		array[2].y = 2;
		array[3].x = x-1;
		array[3].y = 2;
	}
	
}
