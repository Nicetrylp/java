package com.lanou3g;

public class Demo_3 {

	public static void main(String[] args) {
		fun();
	}

	// 选择排序
	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int m = array[i];
					array[i] = array[j];
					array[j] = m;
				}
			}
		}
	}

	// 冒泡排序
	public static void bubbleSort(int[] array) {
		for (int i = 1; i < array.length; ++i) {
			for (int j = 0; j < array.length - i; ++j) {
				if (array[j] > array[j + 1]) {
					int m = array[j];
					array[j] = array[j + 1];
					array[j + 1] = m;
				}
			}
		}
	}

	// 插入排序
	
	public static void insertion(int[]array) {
		for(int i = 1; i < array.length ; ++i) {
			if(array[i] < array[i-1]) {
				int m = array[i];
				int k = i-1;
				for(int j = k; j>=0 && m<array[j];--j) {
					array[j+1] = array[j];
					k--;
				}
				array[k+1] = m;
			}
		}
			
	}

	// 输出数组
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; ++i) {
			if (i == array.length - 1) {
				System.out.println(array[i]);
				break;
			}
			System.out.print(array[i] + ",");
		}

	}

	// 测试函数

	public static void fun() {
		int[] array = { 1, 5, 7, 9, 8, 6, 3, 4, 2 };
		System.out.println("排序之前数组为:");
		printArray(array);
		// selectionSort(array);
		// bubbleSort(array);
		insertion(array);
		System.out.println("排序之后数组为:");
		printArray(array);

	}

}
