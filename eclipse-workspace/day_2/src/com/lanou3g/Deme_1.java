package com.lanou3g;
/**
 * ѭ��: ���̿���֮һ
 * do-while
 * while
 * for(�Ժ󿪷��õ����)
 * @author lanou
 *
 */
public class Deme_1 {

	public static void main(String[] args) {
		// ��ʼ��һ������,��Ϊѭ�����ж�����
		int i = 0;
		// whileѭ��
		while(i < 10) {
			System.out.println("����������");
			++i;	// ѭ������
		}
		i = 0;
		// do-while ѭ��
		do {
			System.out.println("jtxqs" + i);
			++i;
		} while (i<10);
		// forѭ��
		for( int k = 0;k < 10 ; ++k) {
			System.out.println("������" + k);
		}
	}

}
