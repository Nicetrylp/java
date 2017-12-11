package com.lanou3g.utils;

import java.util.Scanner;

public class TestBookStore {

	public static void main(String[] args) {
		BookStore bs = new BookStore();
		System.out.println("欢迎光临仓老师书店");
		while (true) {
			System.out.println("1-查询,2-添加,3-删除,4-修改");
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
			switch (input) {
			case "1":
				System.out.println("请输入书名:");
				Book book = bs.queryBookByName(sc.nextLine());
				if (book == null) {
					System.out.println("此书未找到");
				} else {
					System.out.println("书名:" + book.getBookName() + ",价格:" + book.getPrice());
				}
				break;
			case "2":
				Book newBook = new Book();
				System.out.println("请输入书的名字");
				newBook.setBookName(sc.nextLine());
				System.out.println("请输入书的价格");
				newBook.setPrice(sc.nextDouble());
				// 解决输出多行提示的问题
				sc.nextLine();
				System.out.println("请输入书的出版商");
				newBook.setPulishCompany(sc.nextLine());
				System.out.println("请输入书的编号");
				newBook.setBookSn(sc.nextLine());
				bs.addBook(newBook);
				break;
				default:
					System.out.println("输入有误,请重新输入");
			}
		}
	}
}