package com.innominds.practice;

import java.util.Arrays;

public class CommonPrefix {

	public static void main(String[] args) {
		String word="flow flight flop";
		String[] splitwords=word.split(" ");
		System.out.println(Arrays.toString(splitwords));
		
		int  size=splitwords.length;
		if(size==0) {
			System.out.println("The input size is:" + size);
		}else if(size ==1) {
			System.out.println("The input size is:" + splitwords[0]);

		}
		else {
			StringBuilder res=new StringBuilder();
			int length=splitwords[0].length();
			for(int i=0;i<length;i++) {
				if(splitwords[0].charAt(i)==splitwords[size-1].charAt(i)) {
					res.append(splitwords[0].charAt(i));
				}else {
					System.out.println("No common prefix for strings");
					break;
				}	
				
			}
			String result=res.toString();
			System.out.println("longest common prefix:" +result);
		}

	}

}
