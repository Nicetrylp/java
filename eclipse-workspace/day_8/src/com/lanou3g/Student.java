package com.lanou3g;

/*
 * 老师和学生类存在的问题:
 * 1. 代码重复,包括属性和方法
 *  	继承可以解决这个问题
 */
public class Student {
	private String name;
	private int age;
	public Student(String name) {
		super();
		this.name = name;
	}
	public Student() {
		super();
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
	
}

class Teacher{
	private String name;
	private int age;
	public Teacher(String name) {
		super();
		this.name = name;
	}
	public Teacher() {
		super();
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
}