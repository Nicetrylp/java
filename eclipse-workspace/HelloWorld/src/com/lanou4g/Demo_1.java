package com.lanou4g;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

/**
 * 
 * @author lanou
 * @version 1.0.1
 * ������
 *
 */
public class Demo_1 {

	public static void main(String[] args) {
		// ע�͵�������ʽ
		// 1.����			
		// 2.����			
		// 3.�ĵ�			
		/*
		 * ����ע��
		 */
		/**
		 * �ĵ�ע��
		 */
		// ����һ������ 	��������  ������  = ��ֵ;
		//����һ�����ͱ���
		int a = 10;
		System.out.println("a ="+a);
		int b = 15;
		//��ӡʱ  �ַ������κ�����һ��ƴ��  ��ӡ�����Ķ����ַ���
		System.out.println("a + b = "+(a+b));
		System.out.println(a + " " + b);
		String str = "Nice_try";
		System.out.println(str);
		// byte
		// ��ʽת��
		// ���ͽ�������,ֻ����С����������������
		// ǿ��ת�� ֵǰ�����Ҫǿ��ת��������
		byte c = 5;
		// �Զ�����Ϊ����int��ֵ���
		c = (byte)(c + 2);
		System.out.println(c);
		
		
		//�����
		//    + - * / %
		// ������: ���������� �»���  ��$��������������� ��ͷ
		// ����֪��
		// û�г�ʼֵ�ı����ǲ���ʹ�õ�
		int num1 = 10,num2;
		num2 = 5;
		System.out.println(num2);
		
		int num3 = 5;
		int num4 = 2;
		// ˫���ȸ�����
		double num5 = 5.0;
		double num6 = 2.0;
		int num7= 0;
		// �������ͽ�������,���ֻ��������
		int num8 = num3 / num4;
		System.out.println(num8);
		double num9 = (num5 / num6);
		System.out.println(num9);
		// ��0��Ϊ������ʱ,���벻�ᷢ������,�������е�ʱ��,�ᱨ�����쳣
//		int num10 = num3/num7;
//		System.out.println(num10);
		// �����ȸ�����(��Ҫĩβ���f����ʾ��������ǵ����ȸ�����)
		float f = 3.1f;
		// ������  true false
		boolean boo = true;
		
		//  ȡ������
		//	���и��������ȡ������ʱ  ,���źͳ�����ͬ
		System.out.println(-5 % 3);
		
		//	����  �Լ�
		int i = 5;
		int k = ++i;
		System.out.println("i = " + i +" k = " + k);
/*		
		// ����̨����
		// ��������  
		Scanner scanner = new Scanner(System.in);
		//ȡ���ӿ���̨�����ֵ
		int m = scanner.nextInt();
		System.out.println(m);
		//�ر�scanner
		scanner.close();
*/		
		
		//	�ַ����� 
		//	�ַ��ͺ����Ϳ����໥ת��	ASCII   A:65   a:97
		char ch = 'a';
		System.out.println(ch);
		System.out.println((char)(ch + 1));
		
		
		for(int l = 0;l < 26; ++l)
		{
			System.out.print((char)(97+l)+" ");
		}
	}

}
