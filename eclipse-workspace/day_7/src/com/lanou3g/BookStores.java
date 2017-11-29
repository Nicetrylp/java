package com.lanou3g;

import java.util.Arrays;
import java.util.Scanner;

public class BookStores {
	public static Book[]books = new Book[10];
	
	// 通过书名查询书籍
	public Book queryBookByName(String bookName) {
		for (Book book : books) {
			// 区分大小写
			if(book!=null&&bookName.equals(book.getName())) {
				return book;}
		// equalsIgnoreCase  不区分大小写
		}
		return null;
	}
	// 查询全部书籍
	public static void lookTrade() {
		System.out.println("书名\t价格\t出版社\t编号");
		for (Book book : books) {
			if(book!=null)
			{				
				System.out.println(book.getName()+"\t"+book.getPrice()+"\t"+book.getBookMan()+"\t"+book.getBookSN());
			}
			//System.out.println(book);
		}
	}
	
	// 添加书籍
	public void addBook(Book book) {
		for(int i=0;i<books.length;++i) {
			if(books[i]==null)
			{
				books[i] = new Book();
				books[i] = book;
				return;
			}			
		}
		// 数组扩容
		// 第一个参数:被扩容的长度	第二个参数,扩容后的长度
		books = Arrays.copyOf(books, books.length+1);
		// 递归
		addBook(book);
	}
	
	// 修改库存
	public void changeTrade( int num) {
		for(int i=0;i<books.length;++i) {
			if(books[i]!=null&&books[i].getBookSN()==num) {
				System.out.println("请输入新的价格:");
				Scanner scanner = new Scanner(System.in);
				double price = scanner.nextDouble();
				books[i].setPrice(price);
				//scanner.close();
			}
		}
	}
	
	// 删除
	public void deleteBook(int num) {
		for(int i=0;i<books.length;++i) {
			if(books[i]!=null&&books[i].getBookSN()==num) {
				books[i]=null;
			}
		}
	}
}
