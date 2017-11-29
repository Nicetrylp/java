package com.pinhong;

import java.util.Scanner;

public class Process {
	
	static boolean boo1 = false;
	static boolean boo2 = false;
	static boolean boo3 = false;
	static boolean boo4 = false;
	static boolean boo5 = false;
	
	public static void start() {
		System.out.println("欢迎使用企业宣传专栏");
		
		while(true)
		{
		menuLogin();
		if(boo1)
			break;
		}
		
		System.out.println("欢迎进入功能板块");
		while(true) {
			menuMain();
			if(boo2)
				break;
		}
		
		System.out.println("已成功退出,谢谢使用");
	}
	
	public static void menuLogin() {
		Userdao userdao  = new Userdao();
		System.out.println("1.注册\t2.登录");
		System.out.println("请选择...");
		Scanner scanner = new Scanner(System.in);
		int key = scanner.nextInt();
		switch (key) {
		case 1:
			Userdao.register();
			break;
		case 2:
		{
			if(Userdao.login())
			boo1 = true;
			break;
		}
		default:
			{
				System.err.println("error");
				menuLogin();
				break;
			}
		}
	}
	public static void menuMain() {
		System.out.println("1.新闻信息管理");
		System.out.println("2.产品信息管理");
		System.out.println("3.消息评论信息管理");
		System.out.println("0.退出");
		System.out.println("请选择...");
		Scanner scanner = new Scanner(System.in);
		int key = scanner.nextInt();
		switch (key) {
		case 1:{
			System.out.println("欢迎进入新闻菜单");
			boo3 = false;
			while(true) {
			menuNews();
			if(boo3)
				break;
			}
			 break;
		}
		case 2:{
			System.out.println("欢迎进入产品菜单");
			boo4 = false;
			while(true) {
				menuProcess();
				if(boo4)
					break;
			}
			 break;
		}
		case 3:{
			System.out.println("欢迎进入评论菜单");
			boo5 = false;
			while(true) {
				menuInformation();
				if(boo5)
					break;
			}
			break;
		}
		case 0:{
			boo2 = true;
			break;
		}
		default:{
			System.out.println("error");
			menuMain();
			break;
		}
		}
	}
	public static void menuNews() {
		System.out.println("1.添加新闻");
		System.out.println("2.修改新闻");
		System.out.println("3.删除新闻");
		System.out.println("4.查询新闻");
		System.out.println("0.返回上级菜单");
		System.out.println("请选择...");
		Scanner scanner = new Scanner(System.in);
		int key = scanner.nextInt();
		scanner.nextLine();
		switch (key) {
		case 1:
			NewOperation.addNews();
			break;
		case 2:{
			System.out.println("请输入要修改的的新闻的标题");
			String title = scanner.nextLine();
			NewOperation.amendNews(title);
			break;
		}
		case 3:{
			System.out.println("请输入要删除的的新闻的标题");
			String title = scanner.nextLine();
			NewOperation.deleteNews(title);
			break;
		}
		case 4:{
			NewOperation.inquireNews();
			break;
		}
		case 0:{
			boo3 = true;
			break;
		}
		default:{
			System.out.println("error");
			menuNews();
			break;
		}
		}
	}
	public static void menuProcess() {
		System.out.println("1.添加产品");
		System.out.println("2.修改产品");
		System.out.println("3.删除产品");
		System.out.println("4.查询产品");
		System.out.println("0.返回上级菜单");
		System.out.println("请选择...");
		Scanner scanner = new Scanner(System.in);
		int key = scanner.nextInt();
		switch (key) {
		case 1:{
			ProductOperation.addProduct();
			break;
		}
		case 2:{
			System.out.println("请输入要修改的产品编号");
			int number = scanner.nextInt();
			ProductOperation.amendProduct(number);
			break;
		}
		case 3:{
			System.out.println("请输入要删除的产品id");
			int number = scanner.nextInt();
			ProductOperation.deleteProduct(number);
			break;
		}
		case 4:{
			ProductOperation.inquireProduct();
			break;
		}
		case 0:{
			boo4 = true;
			break;
		}
		default:{
			System.out.println("error");
			menuProcess();
			break;
		}
		}
	}
	public static void menuInformation() {
		System.out.println("1.发表帖子");
		System.out.println("2.评论帖子");
		System.out.println("3.查询帖子及回复");
		System.out.println("0.返回上级菜单");
		Scanner scanner = new Scanner(System.in);
		int key = scanner.nextInt();
		scanner.nextLine();
		switch (key) {
		case 1:{
			InformationOperation.publishInformation();
			break;
		}
		case 2:{
			System.out.println("您要回复的帖子编号是:");
			int NO = scanner.nextInt();
			scanner.nextLine();
			InformationOperation.publishReply(NO);
			break;
		}
		case 3:{
			System.out.println("您要查看的帖子编号是:");
			int NO = scanner.nextInt();
			scanner.nextLine();
			InformationOperation.lookInformation(NO);
			break;
		}
		case 0:{
			boo5 = true;
			break;
		}
		default:{
			System.out.println("error");
			menuInformation();
			break;
		}
		}
	}
}
