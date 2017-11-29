package com.lanou3g;

/**
 * 随机数
 * @author lanou
 *
 */
public class Demo_7 {

	public static void main(String[] args) {
		for( int  i = 0 ; i < 10; ++i)
		{
			//math.random()的随机范围[0,1)
			// 需求,随机一个 [5,10]的数
			// 计算随机数公式 	*(最大值 - 最小值 + 1) + 最小值
		//double random =  Math.random();
		int a = (int )(Math.random()*183)+18;
		System.out.println(a);
		}

	}
	

}
