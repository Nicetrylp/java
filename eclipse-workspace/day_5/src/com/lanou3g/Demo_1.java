package com.lanou3g;

public class Demo_1 {

	public static void main(String[] args) {
		//�������
				//ѧ��������
				String name1 = "����";
				int age1 = 22;
				String gender1 = "��";
				double score1 = 100;
				
				//ѧ�����ģ�
				String name2 = "����";
				int age2 = 22;
				String gender2 = "Ů";
				double score2 = 100;
				
				System.out.println(name1);
				System.out.println(age1);
				System.out.println(gender1);
				System.out.println(score1);
				
				//ʵ������Ķ���
				//��������   ������ = new ����();
				//������һ��ѧ������
				Student zs = new Student();
				//����������Ը�ֵ
				zs.name = "����";	
				zs.age = 22;
				zs.gender = "��";
				zs.score = 100;
				//�����ڶ���ѧ������
				Student ls = new Student();
				ls.name = "����";	
				ls.age = 21;
				ls.gender = "Ů";
				ls.score = 100;
				//���������������ֵ
				 System.out.println(zs.name);
				 System.out.println(zs.age);
				 System.out.println(zs.gender);
				 System.out.println(zs.score);
			}
			
		}

//�ࣺ��������(String��Scanner��Random��)���Զ��������
//������Ĺؼ��֣�class
/*
 * ����Ĺ���:class  ����{ 
 *  //1.��Ա����(����):�������ﹲ�е�����,д��������棬���������� 
 *  //2.��Ա����
 *  //3.���췽��
 *   }
 */
class Student1{
	//ѧ��������
	String name;
	//ѧ��������
	int age;
	//ѧ�����Ա�
	String gender;
	//ѧ���ķ���
	double score;//double���Ͳ�������ȷ�ļ��㣬BigDecimal
			
}