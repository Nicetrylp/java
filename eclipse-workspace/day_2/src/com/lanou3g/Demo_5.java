package com.lanou3g;
/**
 * ¡‚–Œ
 * @author lanou
 *
 */
public class Demo_5 {

	public static void main(String[] args) {
//				 ¥Ú”°¡‚–Œ
//		*    0
//	   ***   1
//	  *****  2
//	   ***   3
//	    *    4
//	  01234
	
	int row = 5;
	int middle = row/2+1;
	int left = middle - 1;
	for(int i = 0; i < middle; ++i) {
		for(int j = 0; j < row; j++) {
			if( j < left - i || j > left + i) {System.out.print(" ");}
			else {
				System.out.print("*");}
			
		}
		
		System.out.println();
	}
	for(int i = middle; i < row; i++) {
		for(int j = 0;j < row;j++)
		{
			if( j < i - left ) {
				System.out.print(" ");
			}
			else {
				System.out.print("*");
			}
		}
		System.out.println();
	}

	}

}
