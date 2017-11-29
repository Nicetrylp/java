package com.lanou3g;
/**
 * 二维数组
 * @author lanou
 *
 */
public class Dome_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 定义一个二维数组
		// 这是一个三行四列的数组,该二维数组中,有三个一维数组,并且每个数组中,有四个元素
		int [] [] array = new int[3][4];
		// 定义并赋值
		int [] [] arr = new int [][] {{1,2,3},{4,5,6},{7,8,9}};
		
		// 遍历数组
//		for (int[] is : arr) {
//			for (int i : is) {
//				System.out.print(i + " ");
//			}
//			System.out.println();
//		}
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=0;j<arr[i].length;j++)
//			{
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
//		// 如何获取二维数组
//		array[1][2] = 17;
//		System.out.println("\n" + array[1][2]);
		
		// 需求  计算二维数组中所有元素的和
		int sum = 0;
		for (int[] is : arr) {
			for (int i : is) {
				sum += i;
			}
			
		}
		System.out.println(sum);
	}

}
