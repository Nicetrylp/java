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
 * ��ӡԱ����Ϣ
 */
 class Emp{
	 private String name;
	 private int age;
	 private String sex;
	 private double salary;
	 
	 // ���캯��
	 public Emp() {
		 name = "�׷�ħŮ";
		 age = 24;
		 sex = "Ů";
		 salary = 6000;
	 }
	 
	 public void print() {
		 System.out.println("����:"+this.name);
		 System.out.println("����:"+this.age);
		 System.out.println("�Ա�:"+this.sex);
		 System.out.println("нˮ:"+this.salary);
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
