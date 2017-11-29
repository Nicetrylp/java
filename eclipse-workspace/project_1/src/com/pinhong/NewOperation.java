package com.pinhong;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * 属性:
 * 		news[] 相当于数据库	静态
 * 
 * 方法:
		添加,修改,删除,查询(增删改查)
 *
 */
public class NewOperation {
	public static News[]news = new News[2];	
	
	
	public NewOperation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static void addNews() {	// 增
		News New = new News();
		News.add(New);
		for(int i = 0;i < news.length;++i) {
			if(news[i] == null) {
				news[i] = New;
				System.out.println("添加成功");
				return;
			}	
		}
		news = Arrays.copyOf(news, news.length + 5);
		news[news.length-5] = New;		
		System.out.println("添加成功");
	}
	
	public static void amendNews(String title) {	// 改
		// 按标题改	
		int counter = 0;
		for(int i=0;i<news.length;++i)
			if(news[i]!=null && title.equalsIgnoreCase(news[i].getTitle())) {
				News New = new News();
				News.add(New);
				news[i] = New;
				System.out.println("修改成功");
				++counter;
			}
		if(counter == 0)
			System.out.println("未找到该新闻");
	}
	
	public static void deleteNews(String title) {	// 删
		// 按标题删除
		int counter = 0;
		for(int i=0;i<news.length;++i)
		{
			if(news[i]!=null && title.equalsIgnoreCase(news[i].getTitle()))
				{
				news[i] = null;
				System.out.println("删除成功");
				++counter;
				}
		}
		if(counter == 0)
			System.out.println("未找到该新闻");
	}
	
	public static void inquireNews() {	// 查
		for(int i=0;i<news.length;++i)
		{
			if(news[i]!=null)
			news[i].look();
		}
		System.out.println("查询结束");
	}
}
