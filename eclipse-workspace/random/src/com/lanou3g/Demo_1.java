package com.lanou3g;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * 随机选人
 * 
 * 循环
 * 从10个里面选出一个,加入队伍
 * 选过的不在选择
 * 输出每个数组里的元素
 *
 */
public class Demo_1 {

	public static void main(String[] args) {
		String[] allPeople = new String[]{
			"刘鹏","蔡林","李晓楠","鲜于春来","陈朝雄",
			"陈宏港","董加丰","冯文","赖瑞","刘鑫",
			"沈世伟","王森浩","熊志翔","许寒","鄢秋实",
			"杨潇","叶沛颖","曾繁昌","郑奎","周吴凡",
			"王韬","22","23","24","25",
			"26","27","28",
		};
		
		int j=0,k=0,l=0;
		int[] counter = new int[10];
		String [] red = new String[5];
		String [] blue = new String[5];
		System.out.println("---随机选人---");
		loop: while(true) {
			System.out.println("按下回车开始选人");
			Scanner scanner = new Scanner(System.in);
			scanner.nextLine();
			int a = new Random().nextInt(28);
			// 避免重复选人
			for(int i=0;i<10;i++) {
				if(counter[i] == a)
					continue loop;
			}
			System.out.println("选出的选手是: "+allPeople[a]);
			counter[j++] = a;
			// 如果队伍没满,那么随机添加,满了,直接添加
			if(k<5) {
				if(l<5) {
					int b= new Random().nextInt(2);
					if(b==0) {
						System.out.println(allPeople[a] + "被分到了红队");
						red[k++] = allPeople[a];
						}
					else {
						blue[l++] = allPeople[a];
						System.out.println(allPeople[a] + "被分到了蓝队");
					}
				}
				else {
					red[k++] =allPeople[a];
					System.out.println(allPeople[a] + "被分到了红队");
				}
			}else {
				blue[l++]=allPeople[a];	
				System.out.println(allPeople[a] + "被分到了蓝队");
			}
			print(red, blue);
			// 当两只队伍都满员,循环结束
			if(k==5&&l==5)
				break;
		}
		
	}

	public static void print(String []red,String[]blue) {
		System.out.println("红队------------");
		for (String i : red) {
			if(i!=null)
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("蓝队------------");
		for (String i : blue) {
			if(i!=null)
			System.out.print(i+" ");
		}
		System.out.println();
		
	}
}