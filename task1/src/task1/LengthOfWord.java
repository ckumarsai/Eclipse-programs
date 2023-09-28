package task1;

import java.util.Scanner;

public class LengthOfWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str1=sc.nextLine();
		System.out.println("Original word is "+str1);
		System.out.println("The Last Word Length is: " +wordOfLength(str1));
	}
	public static int wordOfLength(String str1) {
		int wordlength=0;
		String[] words=str1.split(" ");
		if(words.length>0) {
			wordlength=words[words.length-1].length();
		}else {
			wordlength=0;
		}
		return wordlength;
	}

}
