package com.lanou;

public class InsertSort {
	public static void main(String[] args) {
		// ��ʼ����������
		int array[] = {7 ,5, 1, 2, 6, 4 , 3, 9, 8, 0};
		
		// ����ȡ��0��Ԫ��ʱ,���������ǿ�״̬,���Կ���ֱ�Ӵӵ�1��Ԫ�ؿ�ʼȡ
		for(int i = 1; i < array.length; ++i) {
			// ���ѡ���Ԫ��С�������е�Ԫ��
			// �Ӻ���ǰѰ�����������е�Ԫ��,ֱ��ѡ���Ԫ��>���������е�Ԫ,���ߵ�����������ĵ�һ��λ��
			if(array[i]<array[i-1]) {
				int k = array[i];	//	����ѡ�����Ԫ��
				int m = i-1;		//	������������ʱ,����������Ԫ�ص�λ��
				for(int j = m; j >= 0 && array[j]>k;--j) {
					// ��ѡ�����K<���������е�Ԫ��ʱִ��
					//	�����������е�Ԫ�غ���һλ
					array[j+1] = array[j];
					// ÿ��ǰ��һλ,��λ��ǰ��һλ
					m--;
				}
				// ��������if����ʱ,˵���Ѿ��ҵ�Ԫ��K�Ĳ���λ��,��K����
				array[m+1] = k;
			}
		}
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
}
