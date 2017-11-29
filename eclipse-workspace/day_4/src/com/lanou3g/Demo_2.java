package com.lanou3g;
/**
 * 多维数组
 * 数据类型[][][]数组名 = 初值;
 *
 */
public class Demo_2 {

	public static void main(String[] args) {
		// 定义一个三维数组
		// 两层 三行 四列
		// 这是一个含两个二维数组
		// 二维数组里面是3个一维数组
		// 一位数组里有四个元素
		int [][][] array = new int[2][3][4];
		
		int [][][] array2 = {
				{
					{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12}
					},
				
				{
						{13,14,15,16},
						{17,18,19,20},
						{21,22,23,24}
						}
		};
		int sum = 0;
		for (int[][] is : array2) {
			for (int[] is2 : is) {
				for (int i : is2) {
					sum += i;
				}
			}
		}
		
		for(int i = 0; i < array2.length;++i) {
			for(int j = 0;j < array2[i].length;++j) {
				for(int k = 0; k<array2[i][j].length;++k) {
					System.out.print(array2[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println(sum);
	}
	
}
