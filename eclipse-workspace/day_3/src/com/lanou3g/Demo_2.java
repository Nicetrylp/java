package com.lanou3g;
/**
 * ����
 * ʲô������?		����	����ʢ�� һ�� ����(��ͬ���͵�)
 * �����ʢ��?		�����±����������
 *
 */
public class Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����һ������,����Ϊ3,���� array
		// ������ֻ�ܴ洢int������
		// new ����ؼ��ִ����� ���ڴ� �п���һ��ռ�
		// ʹ�� new Ϊ�ؼ��ַ����ڴ�ʱ,���������и�Ԫ�ض���ʼ��Ϊ0
		// int [] array = new int [3];
		// for (int i : array) {
		//	System.out.println(i);
		// }
		
		// ArrayIndexOutOfBoundsException
		// ����Խ���쳣`
		// array[5] =10;
		
		
		// NullPointerException
		// ��ָ���쳣:������һ�鲻���ڵĿռ�
		// array = null;
		// System.out.println(array[1]);
		// ���������������ʽ
		// ��ʽ1
		int[] array = new int[3];
		//��ʽ2
		int[] array1 = new int [] {1,3,5,7,9};
		
		// ��������
		for (int i = 0; i < array1.length; ++i) {
			System.out.println(array1[i]);
		}
		// ���������е�Ԫ��,ʹ��foreach
		for (int i : array1) {
			System.out.println(i);
		}
		
		//
		fun1(10);
		
	}
	public static void printArray(int [] array) {
		for(int i=0;i<array.length;++i) {
			if(i == array.length-1) {
				System.out.println(array[i]);
				break;
			}
			System.out.print(array[i] + ",");
		}
		
	}
	
	public static void fun1(int a) {
		int [] array = new int [a];
		for(int i = 0; i < array.length; ++i) {
			array[i] = (int)(Math.random()*91+10);
		}
		printArray(array);
	}
	
}
