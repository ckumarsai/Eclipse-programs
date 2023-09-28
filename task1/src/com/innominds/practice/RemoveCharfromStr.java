package com.innominds.practice;

public class RemoveCharfromStr {
	public static void main(String[] args) {
		String str="CHINNAbunny";
		String string=str.toLowerCase();
		System.out.println(string);
		String modifiedStr=string.replace("c", "j");
		System.out.println(modifiedStr);
	}
}

