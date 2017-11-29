package com.lanou3g;

import java.util.Scanner;
/**
 * 库存管理系统
 * 
 *
 */
public class Inventory {
	static int over;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun();
	}
	// 测试函数
	public static void fun() {
		over = 0;
		Trade[] trades = new Trade[10];
		trades=init();
		password();
		while(true) {
			operate(trades);
			if (over ==1) {
				break;
			}
		}
	}
	// 密码验证
	public static void password() {
		int Password = 123;
		System.out.println("请输入密码:");
		Scanner scanner = new Scanner(System.in);
		int password = scanner.nextInt();
		if(password == Password) {
			System.out.println("登录成功");
			showMeun();
		}else {
			for(int i = 2;i>0;--i) {
				System.out.println("密码错误,还有"+ i +"次机会请输入密码");
				password = scanner.nextInt();
				if(password == Password) {
					System.out.println("登录成功");
					showMeun();
					break;
				}
				if(i==1) {
					System.out.println("密码错误次数超过3次,退出系统");
				}
			}
		}
	}
	
	// 操作函数
	public static void operate(Trade[]trades) {
		Scanner scanner = new Scanner(System.in);
		int key = scanner.nextInt();
		switch (key) {
		case 1:
		{
			lookTrade(trades);
			break;
		}
		case 2:
		{
			changeTrade(trades);
			break;
		}
		case 3:
		{
			addTrade(trades);
			break;
		}
		case 0:
		{
			exit();
			break;
		}
		default:
			System.out.println("error");
			break;
		}
	}
	
	// 显示功能菜单
	public static void showMeun() {
		System.out.println("---------欢迎进入库存管理菜单,请选择----------");
		System.out.println("1:查看库存");
		System.out.println("2:修改库存");
		System.out.println("3:添加库存");
		System.out.println("0:退出");
		System.out.println("---------------------------------------");
	}
	
	// 查看库存
	public static void lookTrade(Trade[]trades) {
		System.out.println("---------------欢迎查看库存---------------");
		System.out.println("名称\t\t价格\t\t版本\t\t库存");
		for (Trade trade : trades) {
			if(trade == null)
				break;
			System.out.println(trade.getName()+"\t\t"+trade.getPrice()+"\t\t"+trade.getVersions()
			+"\t\t"+trade.getQuantity());
		}
	}
	// 修改库存
	public static void changeTrade(Trade[]trades) {
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i<trades.length;++i) {
			if(trades[i] == null)
				break;
			System.out.println("请输入"+trades[i].getName() + "库存的数量");
			int quantity = scanner.nextInt();
			trades[i].setQuantity(quantity);
		}
		lookTrade(trades);
	}
	// 添加库存
	public static void addTrade(Trade[]trades) {
		System.out.println("-------------请添加商品-------------");
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i<trades.length;++i) {
			if (trades[i] == null) {
				trades[i] = new Trade();
				
				System.out.println("请输出书籍名称:");
				String name = scanner.nextLine();
				trades[i].setName(name);
				
				
				System.out.println("请输入书籍价格:");
				double price = scanner.nextDouble();
				// 加nextline保平安
				scanner.nextLine();
				trades[i].setPrice(price);
				
				System.out.println("请输入书籍版本:");
				String versions = scanner.nextLine();
				trades[i].setVersions(versions);
				
				System.out.println("请输入书籍库存:");
				int quantity = scanner.nextInt();
				trades[i].setQuantity(quantity);
				break;
			}
		}
		lookTrade(trades);
	}
	// 退出
	public static void exit() {
		System.out.println("已退出系统,谢谢使用");
		over = 1;
	}
	// 初始化
	public static Trade[] init() {
		// 建一个数组,很low的方法
		Trade[] trades = new Trade[10];
		trades[0] = new Trade();
		trades[0].setName("java");
		trades[0].setPrice(86.5);
		trades[0].setQuantity(0);
		trades[0].setVersions("第八版");
		
		trades[1] = new Trade();
		trades[1].setName("PHP");
		trades[1].setPrice(53.5);
		trades[1].setQuantity(0);
		trades[1].setVersions("第六版");
		
		return trades;
	}
}
 /**
  * 
  * 商品类
  *
  */
class Trade{

	private String name;	// 名称

	private double price;	// 价格

	private String versions;	// 版本

	private int quantity;	// 数量

	// get set方法开始
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getVersions() {
		return versions;
	}

	public void setVersions(String versions) {
		this.versions = versions;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	// get set 方法结束
	
}