package com.lanou3g.demo;

public class Demo_7 {

	public static void main(String[] args) {
		// 选择排序
		int a[]= {1,5,3,4,2,7,9,6,8};
		System.out.println("排序之前:");
		for (int i : a) {
			System.out.print(i + " ");
		}
		for(int i = 0;i<a.length;++i) {
			int k = a[i];
			for(int j = i+1; j < a.length ; ++j) {
				if( k > a[j]) {
					int m = k;
					k = a[j];
					a[j] = m;
				}
			}
			a[i] = k;
		}
		System.out.println("\n排序之后:");
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

}
