package com.homework;


public class Tetromino {
	
	public Cell[]array = new Cell[4];
	
	public Tetromino() {
		super();
		for(int i=0;i<array.length;i++)
			array[i] = new Cell();
	}
	
	public void print() {
		for(int i = 0;i<20;i++) {
			loop:for(int j = 0;j<10;j++) {
				
				for(int k=0;k<array.length;k++) {
					if(i == array[k].y && j == array[k].x)
						{System.out.print("* ");
						//break;
						continue loop;
						}
					
				}
				System.out.print("- ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public void drop() {
		for(int i = 0 ;i < array.length;i++)
			++array[i].y;
	}
	public void moveLeft() {
		for(int i = 0 ;i < array.length;i++)
			--array[i].x;
	}
	public void moveRight() {
		for(int i = 0 ;i < array.length;i++)
			++array[i].x;
	}
}
