package com.lanou;
/*
 * static 静态修饰符
 * 
 * static修饰的属性属于类,被所有对象共享,只有一份,存放在方法区,能被所有对象 访问\
 * 
 * 可以使用对象.来引用(不推荐)
 * 推荐使用类.引用
 * 
 * 静态方法类部只能直接访问外部静态资源
 * 
 * 
 */
public class Demo {
	public static void main(String[] args) {
		Math.random();
	}
}
