package com.lanou3g;


public class Test {

	public static void main(String[] args) {
		int [] array = { 5 , 6 , 2 , 3};
		bubbleSort(array);
		for (int i : array) {
			System.out.println(i);
		}

		cfb();
	}
	public static void cfb() {
		for(int i=1;i<=9;++i)
		{
			for(int j = 1;j<=i;j++)
			{
				System.out.print(i + "*" + j +"="+ i*j + " ");
			}
			System.out.println();
		}
		
	}
	
	public static void bubbleSort(int[] array) {
		for(int i = 1 ;i<array.length;i++ )
		{
			for(int j = 0 ;j <array.length - i;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	
	

}
