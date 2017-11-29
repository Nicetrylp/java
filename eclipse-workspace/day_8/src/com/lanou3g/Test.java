package com.lanou3g;

public class Test {
	
	// 需要引入Junit的jar包
	//@Test
//	public void test() {
		
//	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GirlFriend girlFriend = new GirlFriend();
		girlFriend.setName("Nice_try");
		girlFriend.showName();
		girlFriend.name = "123";
		System.out.println(girlFriend.name);
		
		WhitePrint whitePrint = new WhitePrint();
		whitePrint.test();
		whitePrint.test2();
	}

}
