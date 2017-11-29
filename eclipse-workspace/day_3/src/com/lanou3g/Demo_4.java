package com.lanou3g;

public class Demo_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun();
	}
	
	/*√∞≈›≈≈–Ú*/
	public static void bubbleSort( int[] array) {
		for(int i = 1;i < array.length;++i) {
			for(int j = 0;j < array.length - i;++j) {
				if(array[j]>array[j+1]) {
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	
	/*—°‘Ò≈≈–Ú*/
	public static void selectSort(int[] array) {
		for(int i=0;i<array.length-1;++i)
		{
			for(int j=i+1;j<array.length;++j)
			{
				if(array[i]>array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	
	/*≤Â»Î≈≈–Ú*/
	public static void insertSort(int[] array) {
		for(int i = 1;i<array.length;++i) {
			if(array[i]<array[i-1]) {
				int temp = array[i];
				int k = i-1;
				for(int j = k; j >= 0 && temp < array[j]; --j) {
					array[j+1] = array[j];
					k--;
				}
				array[k+1] = temp;
			}
		}	
	}
	
	/*¥Ú”° ‰≥ˆ ˝◊È∫Ø ˝*/
	public static void printArray(int[] array) {
		for(int i=0;i<array.length;++i) {
			if(i == array.length-1) {
				System.out.println(array[i]);
				break;
			}
			System.out.print(array[i] + ",");
		}
	}
	
	/*≤‚ ‘∫Ø ˝*/
	public static void fun() {
		int[] array = {9,5,7,6,1,8,4,3,2};
		System.out.println("≈≈–Ú÷Æ«∞");
		printArray(array);
//		bubbleSort(array);
//		selectSort(array);
		insertSort(array);
		System.out.println("≈≈–Ú÷Æ∫Û");
		printArray(array);
	}
}
