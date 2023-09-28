package com.innominds.practice;

import java.util.Scanner;

public class DuplicateWordsinArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the words: ");
		String string=sc.nextLine();
//		String string="hello sai hello yashwanth hello harsha";
		String[] str=string.split(" ");
//		int count;
		for(int i = 0; i < str.length; i++) {
			int count=1;
			for(int j=i+1; j<str.length; j++) {
				if(str[j].equals(str[i])) {
					count++;
					str[j]="0";
				}
			}
			if(count>1 && str[i]!="0") {
				System.out.println(str[i]);
			}
		}	
	}
}



