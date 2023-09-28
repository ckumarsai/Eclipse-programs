package com.innominds.practice;

public class ReverseString {

	public static void main(String[] args) {
		String reverstr = "";
		String str="Hello";
		char ch;
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			reverstr=ch+reverstr;
			//System.out.println(ch+reverstr);
			}
		System.out.println("reverse String is:" + reverstr);
		
	}

}
