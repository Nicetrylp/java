package com.lanou;

public class InsertSort {
	public static void main(String[] args) {
		// 初始化无序数组
		int array[] = {7 ,5, 1, 2, 6, 4 , 3, 9, 8, 0};
		
		// 由于取第0个元素时,有序数组是空状态,所以可以直接从第1个元素开始取
		for(int i = 1; i < array.length; ++i) {
			// 如果选择的元素小于数组中的元素
			// 从后往前寻找有序数组中的元素,直到选择的元素>有序数组中的元,或者到了有序数组的第一个位置
			if(array[i]<array[i-1]) {
				int k = array[i];	//	保存选择出的元素
				int m = i-1;		//	保存满足条件时,有序数组中元素的位置
				for(int j = m; j >= 0 && array[j]>k;--j) {
					// 当选择出的K<有序数组中的元素时执行
					//	将有序数组中的元素后移一位
					array[j+1] = array[j];
					// 每次前移一位,将位置前移一位
					m--;
				}
				// 当不满足if条件时,说明已经找到元素K的插入位置,将K插入
				array[m+1] = k;
			}
		}
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
}
