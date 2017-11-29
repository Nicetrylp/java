package com.lanou3g;

public class Text_2 {
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.print();
		System.out.println("-------------------");
		emp.setSalary(7500);
		emp.print();
	}
}
/*
 * 打印员工信息
 */
 class Emp{
	 private String name;
	 private int age;
	 private String sex;
	 private double salary;
	 
	 // 构造函数
	 public Emp() {
		 name = "白发魔女";
		 age = 24;
		 sex = "女";
		 salary = 6000;
	 }
	 
	 public void print() {
		 System.out.println("姓名:"+this.name);
		 System.out.println("年龄:"+this.age);
		 System.out.println("性别:"+this.sex);
		 System.out.println("薪水:"+this.salary);
	 }
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	 
 }
