package com.lanou3g;

import java.util.Scanner;

/**
 * ��ҵ
 * 
 *
 */
public class Test {

	public static void main(String[] args) {
		//����һ���� ��Ϊ������� 
		//  ���[90 , 200]���� Ѱ�� ���е����ֵ
//		fun1();	
		
		// �ӿ���̨����һ��n ����ѭ������ �������7�ı��� ���Ҹ����ֲ�����7 ������� 
		// �������Χ��1 - 100��
//		fun2();
		
		// ����ͬ��35��ͷ94ֻ���� ���ж���ֻ ���ж���ֻ
//		fun3();
	}
	
	/* �ӿ���̨����һ�����ֵķ��� */
	public static int scanner() {
		System.out.println("������һ������,��Ϊ���������:");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		scanner.close();
		return a;
	}
	
	public static void fun1() {
		
		int a = scanner();
		max(a);
	}
	
	public static void fun2() {
		int a = scanner();
		printNum(a);
	}
	
	/* ����ͬ�� */
	public static void fun3() {
		//	����ͷ�ĸ���
		int head = 35;
		// ����ŵĸ���
		int foot = 94;
		// ���岢��ʼ�����ĸ���,Ĭ��ȫ�Ǽ�
		int chicken = head;
		// ���岢��ʼ���õĸ���,Ĭ����Ϊ0
		int rabbit = 0;
		// ���,(��*���Ľ�+��*�õĽ�) < �ܵĽ�,ִ��ѭ����
		while((chicken * 2 + rabbit * 4) < foot) {
			chicken--;	//������һֻ
			rabbit++;	//������һֻ
		}
		// ��������õĸ���
		System.out.println("��:" + chicken + " ��" + rabbit);
	}
	
	/**/
	public static void printNum(int a) {
		System.out.println("����:����7�ı��� ���Ҹ����ֲ�����7 ������� ");
		for(int i = 0 ; i < a ; ++i ) {
			// [1,100]�����
			int m = (int)(Math.random()*100+1);
			// ֻΪ���Կ���
			//System.out.println(m);
			if(m % 7 != 0 && m % 10 != 7 && m/10 != 7) {
				System.out.println("��������������:" + m);
			}
		}
	}
	
	/*���ֵ*/
	public static void max(int a)
	{
		int max = 0;	//����һ������,�����������ֵ
		for(int i = 0; i < a ; i++) {
			int m = (int)(Math.random()*111+90);	//���������
			// ֻΪ���Կ���
			//System.out.println(m);
			if(max < m)
				max = m;
		}
		System.out.println("�⴮�������,���ֵ��" + max);
			
	}
	
	
}
