package com.pinhong;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 
 * 评论操作类
 *
 */
public class InformationOperation {
	static Information[]informations = new Information[10];
	public InformationOperation() {
		// TODO Auto-generated constructor stub
	}
	
	public static void publishInformation() {
		Information information = new Information();
		Information.publish(information);
		for(int i = 0;i<informations.length;++i) {
			if(informations[i] == null) {
				informations[i] = information;
				return;
			}
		}
		informations = Arrays.copyOf(informations, informations.length+5);
		informations[informations.length-5] = information;
	}
	
	public static void publishReply(int NO) {
		int counter = 0;
		for(int i = 0;i<informations.length;++i) {
			if(informations[i]!=null && informations[i].getId()==NO) {
				Reply reply = new Reply();
				Reply.reply(reply);
				informations[i].addReply(reply);
				++counter;
			}
		}
		if(counter == 0)
			System.out.println("没找到该帖子");
	}
	
	public static void lookInformation(int NO) {
		int counter = 0;
		for(int i = 0;i<informations.length;++i) {
			if(informations[i]!=null && informations[i].getId()==NO) {
				informations[i].look();
				++counter;
			}
		}
		if(counter == 0)
			System.out.println("没找到该帖子");
	}
}