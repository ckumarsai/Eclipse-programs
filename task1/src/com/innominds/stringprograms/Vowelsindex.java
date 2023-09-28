package com.innominds.stringprograms;

public class Vowelsindex {

	public static void main(String[] args) {
		String vowelstr=new String("bsdvghsahnjebgfdinsdgcjondcbuj");
//		char[] chararray=vowelstr.toCharArray();
		int count=0;
		for(int i=0;i<vowelstr.length()-1;i++) {
			if(vowelstr.charAt(i)=='a' || vowelstr.charAt(i)=='e' || vowelstr.charAt(i)=='i' || vowelstr.charAt(i)=='o' || vowelstr.charAt(i)=='u') {
				System.out.println("the vowels are :" +vowelstr.charAt(i) + " the position is: " + i);
				count++;
			}
		}
		System.out.println("count is:" +count++);
	}

}
