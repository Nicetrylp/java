package com.lanou3g;
/**
 * �������
 * 
 *
 */
public class Demo_2 {

	public static void main(String[] args) {
		// �½�һ������
		Teacher liling = new Teacher();
		// ����������Ը�ֵ
		liling.empNo = 00001;
		liling.name = "����";
		liling.salary = 30000;
		// ��ȡ��Ϣ
		System.out.println(liling.name);
		liling.teach();
		
		// �½�һ��ѧ������
		Student Nice_try = new Student();
		// ����������Ը�ֵ
		Nice_try.age = 18;
		Nice_try.gender = "����";
		Nice_try.name = "Nice_try";
		Nice_try.number = 123;
		Nice_try.score = 100;
		// ��ȡ
		System.out.println( Nice_try.name);
		Nice_try.study();
		
		// ��������
		new Student().study();
		
		// �½�һ����������
		Car wl = new Car();
		wl.bige = "�ռ��Ƹ�";
		wl.brand = "������";
		wl.price = 100;
		wl.run();
	}

}
/*
 * ����һ����ʦ��
 * ����
 * Ա���� empNo
 * ����   name;
 * ���� salary
 * ע��  �ഴ���������
 */
class  Teacher{
	// ����
	int empNo;
	String name;
	double salary;
	// ��Ϊ: �ó�Ա������ʾ  --- ��Ҫstatic
	// ������������
	public void teach() {
		System.out.println("come here");
	}
}
/*
 * ����һ��ѧ����
 * ����
 * ѧ��  number
 * ����  name
 * �Ա�  gender
 * ����  score
 * ����  age
 * 
 * ����  ѧϰ
 */
class Student{
	// ��Ա����
	int number; 		// ѧ��
	String name;		// ����
	String gender;		// �Ա�
	int score;			// ����
	int age;			// ����
	
	// ��Ա����
	public void study() {
		System.out.println("��Ҫ������ѧϰ");
	}
}

/*
 * �Բ�,���ע��ţ�ư�,��Ҫ�����ж����ų���
 * ����һ�� ������
 * ��Ա����
 * Ʒ�� brand
 * �۸� price
 * �Ƹ�  bige
 * 
 * ��Ա����
 * ��
 */
class Car{
	// ��Ա����
	String brand;
	int price;
	/**
	 * �����ǱƸ�
	 */
	String bige;
	// ��Ա����
	public void run() {
		System.out.println("come here,ɧ��,�Ҵ����");
	}
}
