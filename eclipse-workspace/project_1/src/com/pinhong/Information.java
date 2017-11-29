package com.pinhong;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * 消息类
 * 属性:
		invitation
		时间 time	内容:content	作者:author	标题:title	回复次数:replyN0	唯一标识:id
		回复作者 replyName		回复内容replyContent
	方法:
		发表	回复	查询
 *
 */
public class Information {
	private String time;
	private String content;
	private String author;
	private String title;
	private int id;
	private int replyN0;
	Reply[]replys = new Reply[10];
	public Information() {
		super();
		// TODO Auto-generated constructor stub
		replyN0 = 0;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getReplyN0() {
		return replyN0;
	}
	public void setReplyN0(int replyN0) {
		this.replyN0 = replyN0;
	}

	
	public static void publish(Information information) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入帖子标题:");
		information.setTitle(scanner.nextLine());
		System.out.println("请输入帖子内容");
		information.setContent(scanner.nextLine());
		System.out.println("请输入帖子作者");
		information.setAuthor(scanner.nextLine());
		System.out.println("请输入帖子编号");
		information.setId(scanner.nextInt());
	}
	
	public void addReply(Reply reply) {
		for(int i = 0;i < replys.length;++i) {
			if(replys[i] == null) {
				replys[i] = reply;
				setReplyN0(getReplyN0()+1);
				return;
			}
		}
		replys = Arrays.copyOf(replys, replys.length+5);
		replys[replys.length-5] = reply;
	}
	
	public  void look() {
		System.out.println("编号:"+getId());
		System.out.println("标题:"+getTitle());
		System.out.println("内容:"+getContent());
		System.out.println("作者:"+getAuthor());
		System.out.println("回复量:"+getReplyN0());
		for(int i=0;i<getReplyN0();++i) {
			replys[i].look();
		}
	}
}
class Reply extends Information{
	private String replyName;
	private String replyContent;
	public String getReplyName() {
		return replyName;
	}
	public void setReplyName(String replyName) {
		this.replyName = replyName;
	}
	public String getReplyContent() {
		return replyContent;
	}
	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}
	public static void reply(Reply information) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要回复的内容");
		information.setReplyContent(scanner.nextLine());
		System.out.println("请输入您的名字");
		information.setReplyName(scanner.nextLine());
		// information.setReplyN0(information.getReplyN0()+1);
	}
	public void look() {
		System.out.println("回复内容:"+getReplyContent());
		System.out.println("回复者:"+getReplyName());
	}
}