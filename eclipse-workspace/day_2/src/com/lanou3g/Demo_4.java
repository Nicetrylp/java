package com.lanou3g;
/**
 * forѭ����Ƕ��
 * @author lanou
 *
 */
public class Demo_4 {

	public static void main(String[] args) {
		// forѭ����Ƕ��
		/* ������
		for(int i = 5; i > 0; --i) {
			for(int j = i; j > 0; --j) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		/*	������
		for(int i = 1; i < 6; ++i) {
			for(int j = 0; j < i; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		/*
		for(int i = 0; i < 5; ++i) {
			for(int j = 0; j < i+1; ++j) {
				System.out.print(j+1);
			}
			System.out.println();
		}*/
		
		//�˷���
		for(int i = 1; i <= 9; ++i) {
			for(int j = 1; j < i+1; ++j) {
				// \t �Ʊ��(ǰ�����)
				System.out.print(j + "*" + i + "=" + i*j + "\t");
			}
			System.out.println();
		}
	}

}
