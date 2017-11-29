package com.lanou3g;
/**
 * 累加思想
 * @author lanou
 *
 */
public class Demo_2 {
	public static void main(String[] args) {
		//打印1-10的和
		int sum = 0;//定义并初始化
		int i = 1;
		while(i < 11) {
			sum = sum + i;
			++i;
		}
		System.out.println(sum);
		
		//银行存款
		int year = 10;	//定义存款年限
		double money = 10000;	//定义本金
		int j = 0;	//定义循环增量
		while ( j < year) {
			money = money + money * 0.075;
			++j;
//			System.out.println(money);		//只为测试数据
		}
		System.out.println(money);
		
		// 1-10的和
		sum = 0;	// 初始化
		for(i = 0; i < 11; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
