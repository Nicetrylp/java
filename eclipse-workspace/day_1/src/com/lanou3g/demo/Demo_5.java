package com.lanou3g.demo;

import java.util.Scanner;

/**
 * 
 * @author lanou
 *
 */
public class Demo_5 {

	public static void main(String[] args) {
		//�����������ֵ
	/*	
	   		// ����̨����������
		System.out.println("������a��ֵ:");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println("������b��ֵ:");
		int b = scanner.nextInt();
		System.out.println("������c��ֵ:");
		int c = scanner.nextInt();
	*/	
		int a = 10;
		int b = 12;
		int c = 8;
		//����1	��Ŀ�����
		int d = a > b ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println(d);
		//����2	if
		if(a > b) {
			if(a > c) {
				System.out.println("���ֵ��" + a);
			}else {
				System.out.println("���ֵ��" + c);
			}
		}else if (b>c) {
			System.out.println("���ֵ��" + b);
		}else {
			System.out.println("���ֵ��" + c);
		}

	}

}
