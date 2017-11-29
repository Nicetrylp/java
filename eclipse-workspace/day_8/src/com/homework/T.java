package com.homework;

public class T extends Tetromino  {
	
	public T() {
		super();
		array[1].x=1;
		array[2].x=2;
		array[3].x=1;
		array[3].y=1;
	}
	public T(int x) {
		super();
		array[0].x = x;
		array[1].x = x+1;
		array[2].x = x+2;
		array[3].x = x+1;
		array[3].y = 1;
	}
}
 