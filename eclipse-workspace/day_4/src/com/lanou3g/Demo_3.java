package com.lanou3g;
/**
 * �ݹ麯��
 * ���ϵ��ظ�����һ�����Լ�����ͬ���ĺ���
 * ע��,�ݹ麯����Ҫһ��������ֹͣ�ݹ�
 * ������������ݹ����
 * ע��,������,������Ҫʹ�õݹ�	�ݹ�޺��ڴ�
 */
public class Demo_3 {

	public static void main(String[] args) {
		int a = 5;
		System.out.println(factorial(a));
		System.out.println(circulation(a));
	}
	
	/*�ݹ��㷨*/
	public static int factorial(int a) {
		if( a == 1)
			return a; //�ݹ麯������
		else		
			return a*factorial(--a);		
	}

	/*ѭ��ʵ��*/
	public static int circulation(int a) {
		int sum = 1;
		for(int i = 1;i <= a; i++) {
			sum *= i;
		}
		return sum;
	}
}
