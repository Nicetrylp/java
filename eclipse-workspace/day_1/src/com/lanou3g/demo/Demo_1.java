package com.lanou3g.demo;

import java.util.Scanner;

/**
 * �����
 * ���������	+ - / * %
 * ��ֵ�����	=	+=	/=	*=	-=	%=	++	--
 * �Ƚ������	>	<	>=	<=	!=	==
 * �߼������	&& || !
 * 	&&��·���: ������һȷ��������ʱ,����������ִ��
 * 	||��·���: ������һȷ������ʱ,����������ִ��
 * �������ʽ(��Ԫ���ʽ) 		//  (����) ? ����1 : ����2
 * ����������ʱ,���ط���1  ��������������ʱ��,���ط�����
 * (a > b) ? a : b;		
 * 
 * ��֧�ṹ
 * ִ�нṹ
 * 1.˳��ִ��
 * 2.��ִ֧��
 * 3.ѭ��ִ��
 * 
 * @author lanou
 *
 */
public class Demo_1 {
	
	// ö��
	// ��ߴ�����Ķ�
	enum Season{
		spring,
		summer,
		autnum,
		winter,
	}

	public static void main(String[] args) {
/*
		// �ж������������

		// ʹ�ñȽ�������ȽϺ�,ֻ�᷵��һ��ֵ,����true,����false
		boolean result1 = (10 == 5);
		System.out.println(result1);
		
		// �ж������ַ������
		// ��Ҫʹ���ַ����и����ķ���
		String str1 = "Nice_try";
		String str2 = "Nice_try";
		boolean result2 = str1.equals(str2);
		System.out.println(result2);
*/
		/*
		// �߼��� ��·
		int a = 5;
		int b = 6;
		boolean rel = (a > b) && (a > ++b);
		System.out.println("rel = " + rel + " a = " + a + " b = " + b );
		// �߼����·
		rel = !((a < b ) || (a < ++b));
		System.out.println(rel);
		System.out.println(a);
		System.out.println(b);
		*/
		
		// �������ʽ
		// ����,������������ ���ֵ
		/*
		int a = 5;
		int b = 6;
		System.out.println("������a��ֵ:");
		Scanner scanner1  =  new Scanner(System.in);
		a = scanner1.nextInt();
		System.out.println("������b��ֵ:");
		Scanner scanner2 = new Scanner(System.in);
		b = scanner2.nextInt();
		System.out.println(a + "��" + b + "�����ֵ��:");
		System.out.println( a > b ? ("a = " + a) : ("b = " +b));
			*/
		/*
		// ��ҵ; ʹ����Ŀ�����,�ж������������ֵ
		int a = 5;
		int b = 6;
		int c = 7;
		int d = a > b ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println(d);
		*/
		
		// ��֧��ʽ
		// condition����ʱ,ִ��ִ�����,����,��ִ��
		// if��ʽ1
		/*
		if (condition) {
			ִ�����
		}
		*/
		
		// condition ����ʱ,ִ��ִ�����1,����,ִ�����2
		// if��ʽ2
		/*
		if (condition) {
			ִ�����1
		} else {
			ִ�����2
		}
		*/
		
		// condition1 ����ʱ,ִ�����1,����,�ж�condition2,����ʱ,ִ�����2,����....
		// if���3
		// һ��if�����,else���ֻ����һ��,����ֻ����if�������.
		/*
		if (condition1) {
			���1
		}else if (condition2) {
			���2
		}
		*/
		
		// switch��֧
		// ���,case��ִ�е���䳬��һ��,��Ҫ���ϴ�����
		// break  ��������switch�����
		
		/*
		switch (key) {
		// ��������ִ�����
		case value:
			���
			break;	// ��������switch���
		// ��������,default
		default:
			break;
		}
		*/
		/*
		// ��ȡö���е�����һ��ֵ
		Season spring = Season.spring;
		System.out.println(spring);
		*/
		
		// ʲôʱ��ʹ�� if     ʲôʱ��ʹ��switch
		// ���ֵ������,ʹ��if,����һ��
		// ����жϵ�ֵ,�������ļ������ֻ����ַ������ַ���,����ʹ��switch,Ч�ʻ��Ը�
		// if��ʹ���ʻ��һ��
	}
	
}











