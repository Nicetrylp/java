package com.lanou3g;

import java.util.Scanner;

/***
 * ѭ������
 * @author lanou
 *
 */
public class Demo_6 {

	public static void main(String[] args) {
		// break ������ǰѭ��  ���� switch���
		// continue ����
		/*
		int max = 0;
		for(int i = 0;i<101;++i) {
			if(i % 7 == 0) {
				max = i;
			}
		}
		System.out.println(max);   
		for( int i = 100; i >= 0; i--)
		{
			if(i % 7 == 0)
			{
				System.out.println(i);
				break;
			}
		}
		*/
		
		/*
		System.out.println("˵���㼵�ʵ����Ǽ��Ű�,ɧ��");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		for(int i = 1; i < 11 ; ++i) {
			if( i == a) {
				continue;
			}
			System.out.println( i + "��,���");
//			if( i != a)
//				System.out.println( i + "��,���");
//			
		}
		scanner.close();
		*/
		//Ƕ��ѭ����,break��continue ������
		
		// break��Ƕ��ѭ���� ֻ������ǰ��ѭ��
		
		for(int i = 0 ; i < 5 ; ++i) {
			for(int j = 0 ; j < 5; ++j) {
				if(j == 0)
					break;
				System.out.println("11111");
			}
			System.out.println("-----");
		}
		
	}

}
