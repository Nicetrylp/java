package com.lanou3g;


public class Friend {
	public String name;
	public int age;
	public String interest;
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
	public String getInterest() {
		return interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}
	
}

class GirlFriend extends Friend{
	public void showName() {
		System.out.println(name);
	}
}

class BoyFriend extends Friend{
	public void showAge() {
		System.out.println(age);
	}
}