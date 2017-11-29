package com.pinhong;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * 登录,注册类
 *
 */
public class Userdao {
	
	static User[]users = new User[10];
	
	public Userdao() {
		super();
		users[0] = new User();
		users[0].setPassword("password");
		users[0].setUserName("userName");
	}
	public static void register() {
		User user = new User();
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用户名:");
		String userName = scanner.nextLine();
		user.setUserName(userName);
		System.out.println("请输入密码:");
		String password = scanner.nextLine();
		user.setPassword(password);
		for(int i=0;i<users.length;++i) {
			if(users[i] == null)
			{
				users[i] = user;
				return;
			}
		}
		users = Arrays.copyOf(users, users.length+5);
		users[users.length-5] = user;
	}
	public static boolean login() {
		User user = new User();
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用户名:");
		String userName = scanner.nextLine();
		user.setUserName(userName);
		System.out.println("请输入密码:");
		String password = scanner.nextLine();
		user.setPassword(password);
		for(int i=0;i<users.length;++i) {		
			if(users[i]!=null)
			if(user.getUserName().equalsIgnoreCase(users[i].getUserName()) && user.getPassword().equalsIgnoreCase( users[i].getPassword()))
			{
				System.out.println("登录成功");
				return true;
			}
		}
		System.out.println("用户名或密码错误");
		return false;
	}
	
}
