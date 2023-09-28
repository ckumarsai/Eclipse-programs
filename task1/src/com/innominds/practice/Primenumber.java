package com.innominds.practice;

public class Primenumber {

	public static void main(String[] args) {
		int m=0,temp=0;
		int n=13;
		m=n/2;
		if(n%2==0 || n==1) {
			System.out.println( n +" not a prime");
		}else {
			for(int i=2;i<=n;i++) {
				System.out.println(n +" is prime");
				break;
			}
		
		}

	}

}
