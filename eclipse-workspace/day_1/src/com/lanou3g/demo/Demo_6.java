package com.lanou3g.demo;

public class Demo_6 {

	public static void main(String[] args) {
		//foreachѭ��
		int a[] = {1,2,3,5,4,6,7,8,9};
		for (int i : a) {
			System.out.print(i + " ");
		}
		//ð������	forѭ��ʵ��
		
		for(int j = 0 ; j<a.length ; j++) {
			// k = j + 1,
			int k = j + 1;
			int m; 		// �������潻��ʱ��ֵ
			
			// ���forѭ��������,���һλ�������Сֵ
			for( ; k < a.length; k++) {
				// ��ǰһ��ֵ���һ��ֵ���,�����һ����,����λ��
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
