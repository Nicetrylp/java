package com.lanou3g;
/**
 * ��ά����
 * @author lanou
 *
 */
public class Dome_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ����һ����ά����
		// ����һ���������е�����,�ö�ά������,������һά����,����ÿ��������,���ĸ�Ԫ��
		int [] [] array = new int[3][4];
		// ���岢��ֵ
		int [] [] arr = new int [][] {{1,2,3},{4,5,6},{7,8,9}};
		
		// ��������
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
//		// ��λ�ȡ��ά����
//		array[1][2] = 17;
//		System.out.println("\n" + array[1][2]);
		
		// ����  �����ά����������Ԫ�صĺ�
		int sum = 0;
		for (int[] is : arr) {
			for (int i : is) {
				sum += i;
			}
			
		}
		System.out.println(sum);
	}

}
