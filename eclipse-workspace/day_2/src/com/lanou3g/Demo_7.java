package com.lanou3g;

/**
 * �����
 * @author lanou
 *
 */
public class Demo_7 {

	public static void main(String[] args) {
		for( int  i = 0 ; i < 10; ++i)
		{
			//math.random()�������Χ[0,1)
			// ����,���һ�� [5,10]����
			// �����������ʽ 	*(���ֵ - ��Сֵ + 1) + ��Сֵ
		//double random =  Math.random();
		int a = (int )(Math.random()*183)+18;
		System.out.println(a);
		}

	}
	

}
