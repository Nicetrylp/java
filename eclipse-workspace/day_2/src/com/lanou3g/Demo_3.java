package com.lanou3g;
/**
 * 计数器思想
 * @author lanou
 *
 */
public class Demo_3 {
	public static void main(String[] args) {
		// for循环
		int j=0;	//定义计数器
		for(int i = 1; i < 101 ; ++i) {
			if(i % 7 ==0) {
				j++;	//计数器
//				System.out.println(i);		//只为测试
			}
		}
		System.out.println("1-100中,7的倍数有" + j + "个");
	}

}
