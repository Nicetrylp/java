package com.lanou3g;
/**
 * ����:
 * ��װ�� �ض����ܵ� һ�������
 * �����˴���ĸ�����
 * 
 * �����Ľṹ: 
 * �ؼ��� ����ֵ���� ������ (�������� ����1,�������� ����2,...){
 * 		������;
 * 		return ����ֵ;
 * }
 */
public class Demo_8 {
// ������Ҫ��������
	
	// һ����˵ main����ֻ�������ĵ���
	public static void main(String[] args) {
//		fun();
//		int sum;
//		sum = sum(2,3,4);
//		System.out.println(sum);
		// ���ú���
		fun2(3, 4);
	}
	
	//����һ������
		public static void fun() {
			System.out.println("���");
		}
		
	//��ͺ���
		public static int sum(int a, int b) {
			return a + b;
		}
		
		//��дһ������,ʵ��,��ӡn��m�е�����
		public static void fun2( int n, int m) {
			for(int i = 0; i < n ; ++i) {
				for(int j = 0; j < m ; ++j) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		// ��д����,���㲢�����������ĺ�
		public static int sum(int a,int b,int c) {
			return a+b+c;
		}

}
