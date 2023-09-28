package com.innominds.practice;

import java.util.Scanner;

public class Sqrtofnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=sc.nextInt();
//		int n=256;
		for(int i=1;i<=n;i++) {
			if(i*i==n) {
				System.out.println(i);
			}
		}
	}

}
