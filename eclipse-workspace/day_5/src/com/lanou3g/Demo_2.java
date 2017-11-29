package com.lanou3g;
/**
 * 面向对象
 * 
 *
 */
public class Demo_2 {

	public static void main(String[] args) {
		// 新建一个对象
		Teacher liling = new Teacher();
		// 给对象的属性赋值
		liling.empNo = 00001;
		liling.name = "李凌";
		liling.salary = 30000;
		// 读取信息
		System.out.println(liling.name);
		liling.teach();
		
		// 新建一个学生对象
		Student Nice_try = new Student();
		// 给对象的属性赋值
		Nice_try.age = 18;
		Nice_try.gender = "男神";
		Nice_try.name = "Nice_try";
		Nice_try.number = 123;
		Nice_try.score = 100;
		// 读取
		System.out.println( Nice_try.name);
		Nice_try.study();
		
		// 匿名对象
		new Student().study();
		
		// 新建一个汽车对象
		Car wl = new Car();
		wl.bige = "终极逼格";
		wl.brand = "五菱宏光";
		wl.price = 100;
		wl.run();
	}

}
/*
 * 创建一个老师类
 * 包括
 * 员工号 empNo
 * 姓名   name;
 * 工资 salary
 * 注意  类创建在类外边
 */
class  Teacher{
	// 属性
	int empNo;
	String name;
	double salary;
	// 行为: 用成员方法表示  --- 不要static
	// 方法在类里面
	public void teach() {
		System.out.println("come here");
	}
}
/*
 * 创建一个学生类
 * 包括
 * 学号  number
 * 姓名  name
 * 性别  gender
 * 分数  score
 * 年龄  age
 * 
 * 方法  学习
 */
class Student{
	// 成员属性
	int number; 		// 学号
	String name;		// 姓名
	String gender;		// 性别
	int score;			// 分数
	int age;			// 年龄
	
	// 成员方法
	public void study() {
		System.out.println("不要打扰我学习");
	}
}

/*
 * 卧槽,这个注释牛逼啊,非要下面有东西才出来
 * 创建一个 汽车类
 * 成员属性
 * 品牌 brand
 * 价格 price
 * 逼格  bige
 * 
 * 成员方法
 * 跑
 */
class Car{
	// 成员属性
	String brand;
	int price;
	/**
	 * 这里是逼格
	 */
	String bige;
	// 成员方法
	public void run() {
		System.out.println("come here,骚年,我带你飞");
	}
}
