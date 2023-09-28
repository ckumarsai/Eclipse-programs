package com.innominds.practice;

public class Gcd {

	public static void main(String[] args) {
		int x=16;
		int y=12;
		int gcd=1;
		for(int i=1;i<=x && i<=y;i++) {
			if(x%i==0 && y%i==0) {
				gcd=i;
			
			}
				
		}
		System.out.println("The gcd is:"+gcd);
	}

}
