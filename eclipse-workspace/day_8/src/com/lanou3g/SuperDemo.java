package com.lanou3g;
/*
 * super:代表父类
 * 1.super可以修饰属性, 代表父类的属性		super.xxx
 * 2.super可以修饰构造方法		super()		代表父类的构造方法
 * 或者super(...)
 * 
 * 3.super修饰成员方法
 * 		super修饰的方法代表父类的方法
 * 
 * 
 * 方法的调用
 * 	1. 成员方法的调用	对象的引用.方法();
 * 	2. 静态方法的调用 	类名.方法();
 * 	3. 构造方法的调用	new 方法();
 */

public class SuperDemo {
	public static void main(String[] args) {
		// static修饰的方法/代码块里面不能使用this和super
		// this和super都是指代对象的
		// static修饰的资源是属于类的,不属于对象
		
		Son son = new Son();
		
		// 相当于小类型赋值给大类型
		// 父类指向子类
		Father father = new Son();
		System.out.println(father.money);
		
		// 子类重写后的方法
		/*
		 * 当父类的引用指向子类的对象,并且子类重写了父类的方法
		 */
		father.sleep();
	}
}
/*
 * java类型的默认父类是object
 * 
 */
class Father{
	public String name;
	public double money;
	public String wife;
	public static String sex;
	public Father() {
		super();
		System.out.println("这里是爹方法");
	}
	public Father(double money, String wife) {
		super();
		this.money = money;
		this.wife = wife;
	}
	public void sleep() {
		System.out.println("爹在睡觉");
	}
}

class Son extends Father{
	public String wife;
	public static String sex;
	
	// 当有super方法时,必须将super()方法写在第一行
	// super()可以不写,系统会默认在第一行加上
	public Son() {
	//	super();	// 执行父类的构造方法
		super(100,"name");	// 有参的父类构造方法
		System.out.println("构造子方法");
	}
	

	public Son(double money, String wife) {
		super(money, wife);
		// TODO Auto-generated constructor stub
	}
	
	public void sleep() {
		// 调用父类的sleep()方法
		super.sleep();
		
		System.out.println("儿子在睡觉");
	}

	public void showWife(){
		
		System.out.println(this.wife);
		
		System.out.println(super.wife);
		
		// 静态属性也可以使用super   但是建议用类名来点
		System.out.println(super.sex);
		
		System.out.println(this.sex);
	}
}