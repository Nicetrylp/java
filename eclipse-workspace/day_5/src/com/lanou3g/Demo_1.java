package com.lanou3g;

public class Demo_1 {

	public static void main(String[] args) {
		//面向过程
				//学生张三：
				String name1 = "张三";
				int age1 = 22;
				String gender1 = "男";
				double score1 = 100;
				
				//学生李四：
				String name2 = "李四";
				int age2 = 22;
				String gender2 = "女";
				double score2 = 100;
				
				System.out.println(name1);
				System.out.println(age1);
				System.out.println(gender1);
				System.out.println(score1);
				
				//实例化类的对象
				//规则：类型   变量名 = new 类型();
				//创建第一个学生对象
				Student zs = new Student();
				//给对象的属性赋值
				zs.name = "张三";	
				zs.age = 22;
				zs.gender = "男";
				zs.score = 100;
				//创建第二个学生对象
				Student ls = new Student();
				ls.name = "李四";	
				ls.age = 21;
				ls.gender = "女";
				ls.score = 100;
				//输出对象的相关属性值
				 System.out.println(zs.name);
				 System.out.println(zs.age);
				 System.out.println(zs.gender);
				 System.out.println(zs.score);
			}
			
		}

//类：引用类型(String，Scanner，Random，)，自定义的类型
//定义类的关键字：class
/*
 * 定义的规则:class  类名{ 
 *  //1.成员变量(属性):此类事物共有的特征,写在类的里面，方法的外面 
 *  //2.成员方法
 *  //3.构造方法
 *   }
 */
class Student1{
	//学生的姓名
	String name;
	//学生的年龄
	int age;
	//学生的性别
	String gender;
	//学生的分数
	double score;//double类型不能做精确的计算，BigDecimal
			
}