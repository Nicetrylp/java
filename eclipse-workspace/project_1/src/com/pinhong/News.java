package com.pinhong;

import java.util.Scanner;

/**
 * 
 * 新闻类
 * 属性;	
		时间 time	内容:content	作者:author	标题:title
	方法:
		增删改查
 *
 */
public class News {
	private String time;			//时间
	private String content;		//内容
	private String author;		//作者
	private String title;		//标题
	
	public News() {
		super();

	}
	
	

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public static void add(News news) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入新闻的标题:");
		news.setTitle(scanner.nextLine());
		System.out.println("请输入新闻的作者:");
		news.setAuthor(scanner.nextLine());
		System.out.println("请输入新闻的内容:");
		news.setContent(scanner.nextLine());
		System.out.println("请输入新闻的时间:");
		news.setTime(scanner.nextLine());
	}
	public void look() {
		System.out.println("标题:"+getTitle());
		System.out.println("内容:"+getContent());
		System.out.println("作者:"+getAuthor());
		System.out.println("时间:"+getTime());
	}
}
