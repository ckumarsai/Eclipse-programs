package com.innominds.stringprograms;

public class DuplicateString {

	public static void main(String[] args) {
		String str="sainhyashwanthklharshalpyashwanthmpyashwanthz";
		char[] ch=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {
			for(int  j=i+1;j<ch.length-1;j++) {
				if(ch[i]==ch[j]) {
					ch[j]=0;
					count++;
				}
			}
		if(count>0 && ch[i]!=0) {
			System.out.println(ch[i]);
		}
		}

	}

}
