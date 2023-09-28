package com.innominds.stringprograms;

public class ReverseString {

	public static void main(String[] args) {
		String str="hello chinna";
//		String  revstr;
		char[] ch=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
	}

}
