package com.lanou3g;

public class Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun();
	}
	public static void fun() {
		Gun gun = new Gun();
		People people1 = new People();
		People people2 = new People();
		people1.setName("张三");
		people2.setName("李四");
		for(int i = 1;i<=gun.getSpace();i++) {
			if(i % 2 !=0) {
				if(i == gun.getBullet()) {
					System.out.println(people1.getName()+"开枪,"+people1.getName()+"死亡");
					people1.setDie("死了");
					break;
				}
				System.out.println(people1.getName()+"开枪,没有子弹");
			}else {
				if(i == gun.getBullet()) {
					System.out.println(people2.getName()+"开枪,"+people2.getName()+"死亡");
					people2.setDie("死了");
					break;
				}
				System.out.println(people2.getName()+"开枪,没有子弹");
			}
		}
		System.out.println("游戏结束");
		die(people1);
		die(people2);
		
	}
	public static void die(People people) {
		if(people.getDie() =="活着")
			System.out.println("胜利者是"+people.getName());
	}

}
class Gun{
	private int space;
	private int bullet;
	public Gun() {
		space = 6;
		bullet = (int)(Math.random()*6+1);
	}
	public int getSpace() {
		return space;
	}
	public void setSpace(int space) {
		this.space = space;
	}
	public int getBullet() {
		return bullet;
	}
	public void setBullet(int bullet) {
		this.bullet = bullet;
	}
	
}

class People{
	private String name;
	private String die;
	public People() {
		die = "活着";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDie() {
		return die;
	}
	public void setDie(String die) {
		this.die = die;
	}
	
}