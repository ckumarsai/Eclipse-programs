package com.innominds.practice;

//import com.code.practice.BiggestofFourNums;

public class BiggestofFourNums {
	public  void biggestOfNum(int a,int b,int c,int d) {
		if(a>b && a>c && a>d)
		{
			System.out.println("biggest num is" +a);
		}
		else if(b>a && b>c && b>d) {
			System.out.println("biggest num is" +b);
		}
		else if(c>a && c>b && c>d) {
			System.out.println("biggest num is" +c);
		}
		else {
			System.out.println("biggest num is" +d);
		}
	}

	public static void main(String[] args) {
		BiggestofFourNums b=new BiggestofFourNums();
		b.biggestOfNum(80, 60, 30, 40);
	}

}