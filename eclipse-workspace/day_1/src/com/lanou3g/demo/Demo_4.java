package com.lanou3g.demo;

import java.util.Scanner;

public class Demo_4 {

	public static void main(String[] args) {
		
	/*
		// ���ж��ڴ�� 5�꼰��������7.5% �������� 4.5%
		// ����һ���������  ����Ϊ10000 ���㱾�����Ϣ
		System.out.println("������������");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		double money;
		if(year >= 5) {
			money = 10000 * (0.075) * year + 10000;
		}else {
			money = 10000 * 0.045 * year + 10000;
		}
		System.out.println(year + "��,���10000������:" + money + "��");
		scanner.close();
		
	*/
		
		/*
		 * ��ϰ��3.�ӿ���̨����һ���� �����ż�� ���ǲ���7�ı��� ���������������
		 */
		
		/*
		System.out.println("������һ������");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		// ��2ȡ��==0��Ϊż��
		if( a % 2 == 0) {
			
			if( a % 7 == 0) {
				System.out.println(a + "��ż��,����" + a + "��7�ı���");
			}else {
				System.out.println(a + "��ż��,����" + a + "����7�ı���");
			}
			
		}else {
			System.out.println(a + "����ż��");
		}
		scanner.close();
		
		*/
		
		// ����һ�����,�ж��ǲ�������
		
		/*
		System.out.println("������һ�����");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		if((year % 4 == 0 && (year % 100 !=0) ) || year % 400 == 0) {
			System.out.println( year + "������");
		
		}else {
			System.out.println( year + "��������");
		}
		scanner.close();
		*/
		
		/*
		 * ��ϰ��5.�ӿ���̨����һ���ַ� �������ĸa-z ���Сд��ĸ �����A-Z
		 */
		System.out.println("������һ����ĸ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		// ���ַ���ת���ַ�
		char ch = str.charAt(0);
		// ASCII ����  A:65		Z:90		a:97		z:122
		
		//ʹ�������,����ʹ�ַ�װ��Ϊ����
		if( ch >= 'A' && ch <='Z') {
			System.out.println("��д��ĸ");
		}else if (ch >= 'a' && ch <= 'z') {
			System.out.println("Сд��ĸ");
		}
		else {
			System.out.println("��tm������������ĸ???");
		}
		scanner.close();
		
	}

}
