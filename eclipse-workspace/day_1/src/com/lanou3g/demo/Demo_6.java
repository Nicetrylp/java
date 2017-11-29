package com.lanou3g.demo;

public class Demo_6 {

	public static void main(String[] args) {
		//foreach循环
		int a[] = {1,2,3,5,4,6,7,8,9};
		for (int i : a) {
			System.out.print(i + " ");
		}
		//冒泡排序	for循环实现
		
		for(int j = 0 ; j<a.length ; j++) {
			// k = j + 1,
			int k = j + 1;
			int m; 		// 用来保存交换时的值
			
			// 这个for循环结束后,最后一位将变成最小值
			for( ; k < a.length; k++) {
				// 将前一个值与后一个值相比,如果后一个大,交换位置
				if(a[j]<a[k]) {
					m = a[j];
					a[j] = a[k];
					a[k] = m;
				}
			}
		}
		
		System.out.println("");
		for (int i : a) {
			System.out.print( i + " ");
		}
	}

}
