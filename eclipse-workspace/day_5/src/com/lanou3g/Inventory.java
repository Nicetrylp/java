package com.lanou3g;

import java.util.Scanner;
/**
 * ������ϵͳ
 * 
 *
 */
public class Inventory {
	static int over;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun();
	}
	// ���Ժ���
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
	// ������֤
	public static void password() {
		int Password = 123;
		System.out.println("����������:");
		Scanner scanner = new Scanner(System.in);
		int password = scanner.nextInt();
		if(password == Password) {
			System.out.println("��¼�ɹ�");
			showMeun();
		}else {
			for(int i = 2;i>0;--i) {
				System.out.println("�������,����"+ i +"�λ�������������");
				password = scanner.nextInt();
				if(password == Password) {
					System.out.println("��¼�ɹ�");
					showMeun();
					break;
				}
				if(i==1) {
					System.out.println("��������������3��,�˳�ϵͳ");
				}
			}
		}
	}
	
	// ��������
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
	
	// ��ʾ���ܲ˵�
	public static void showMeun() {
		System.out.println("---------��ӭ���������˵�,��ѡ��----------");
		System.out.println("1:�鿴���");
		System.out.println("2:�޸Ŀ��");
		System.out.println("3:��ӿ��");
		System.out.println("0:�˳�");
		System.out.println("---------------------------------------");
	}
	
	// �鿴���
	public static void lookTrade(Trade[]trades) {
		System.out.println("---------------��ӭ�鿴���---------------");
		System.out.println("����\t\t�۸�\t\t�汾\t\t���");
		for (Trade trade : trades) {
			if(trade == null)
				break;
			System.out.println(trade.getName()+"\t\t"+trade.getPrice()+"\t\t"+trade.getVersions()
			+"\t\t"+trade.getQuantity());
		}
	}
	// �޸Ŀ��
	public static void changeTrade(Trade[]trades) {
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i<trades.length;++i) {
			if(trades[i] == null)
				break;
			System.out.println("������"+trades[i].getName() + "��������");
			int quantity = scanner.nextInt();
			trades[i].setQuantity(quantity);
		}
		lookTrade(trades);
	}
	// ��ӿ��
	public static void addTrade(Trade[]trades) {
		System.out.println("-------------�������Ʒ-------------");
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i<trades.length;++i) {
			if (trades[i] == null) {
				trades[i] = new Trade();
				
				System.out.println("������鼮����:");
				String name = scanner.nextLine();
				trades[i].setName(name);
				
				
				System.out.println("�������鼮�۸�:");
				double price = scanner.nextDouble();
				// ��nextline��ƽ��
				scanner.nextLine();
				trades[i].setPrice(price);
				
				System.out.println("�������鼮�汾:");
				String versions = scanner.nextLine();
				trades[i].setVersions(versions);
				
				System.out.println("�������鼮���:");
				int quantity = scanner.nextInt();
				trades[i].setQuantity(quantity);
				break;
			}
		}
		lookTrade(trades);
	}
	// �˳�
	public static void exit() {
		System.out.println("���˳�ϵͳ,ллʹ��");
		over = 1;
	}
	// ��ʼ��
	public static Trade[] init() {
		// ��һ������,��low�ķ���
		Trade[] trades = new Trade[10];
		trades[0] = new Trade();
		trades[0].setName("java");
		trades[0].setPrice(86.5);
		trades[0].setQuantity(0);
		trades[0].setVersions("�ڰ˰�");
		
		trades[1] = new Trade();
		trades[1].setName("PHP");
		trades[1].setPrice(53.5);
		trades[1].setQuantity(0);
		trades[1].setVersions("������");
		
		return trades;
	}
}
 /**
  * 
  * ��Ʒ��
  *
  */
class Trade{

	private String name;	// ����

	private double price;	// �۸�

	private String versions;	// �汾

	private int quantity;	// ����

	// get set������ʼ
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
	// get set ��������
	
}