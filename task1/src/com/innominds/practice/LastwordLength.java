package com.innominds.practice;

public class LastwordLength {

	public static void main(String[] args) {
		String str="hai chinna sunny bunny";
		String[] splitword=str.split(" ");
		for (int i = splitword.length-1; i > 0; i--) {
			System.out.println("last word is:" +splitword[i]);
			System.out.println("The last word length is:" +splitword[i].length());
			break;		
		}
	}
}
