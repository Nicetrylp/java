package com.lanou3g;
/**
 * ������˼��
 * @author lanou
 *
 */
public class Demo_3 {
	public static void main(String[] args) {
		// forѭ��
		int j=0;	//���������
		for(int i = 1; i < 101 ; ++i) {
			if(i % 7 ==0) {
				j++;	//������
//				System.out.println(i);		//ֻΪ����
			}
		}
		System.out.println("1-100��,7�ı�����" + j + "��");
	}

}
