package com.lanou3g;
/**
 * ��ά����
 * ��������[][][]������ = ��ֵ;
 *
 */
public class Demo_2 {

	public static void main(String[] args) {
		// ����һ����ά����
		// ���� ���� ����
		// ����һ����������ά����
		// ��ά����������3��һά����
		// һλ���������ĸ�Ԫ��
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
