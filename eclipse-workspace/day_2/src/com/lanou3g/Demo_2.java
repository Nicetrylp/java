package com.lanou3g;
/**
 * �ۼ�˼��
 * @author lanou
 *
 */
public class Demo_2 {
	public static void main(String[] args) {
		//��ӡ1-10�ĺ�
		int sum = 0;//���岢��ʼ��
		int i = 1;
		while(i < 11) {
			sum = sum + i;
			++i;
		}
		System.out.println(sum);
		
		//���д��
		int year = 10;	//����������
		double money = 10000;	//���屾��
		int j = 0;	//����ѭ������
		while ( j < year) {
			money = money + money * 0.075;
			++j;
//			System.out.println(money);		//ֻΪ��������
		}
		System.out.println(money);
		
		// 1-10�ĺ�
		sum = 0;	// ��ʼ��
		for(i = 0; i < 11; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
