package com.innominds.practice;

public class FirstandLastElement {

	public static void main(String[] args) {
		int arr[]={ 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
		int x=2;
		FirstandLastElement l=new FirstandLastElement();
//		firstLastElement(arr,x);
		l.firstLastElement(arr, x);
	}
	public static void firstLastElement(int arr[], int x) {
//		int n=arr.length;
		int first=-1, last=-1;
		for(int i=0;i<arr.length;i++) {
			if(x!=arr[i])
				continue;
			if(first==-1)
				first=i;
			last=i;
		}
		if(first!=-1) {
			System.out.println("first occurence is:" +first);
			System.out.println("last occurence is:" +last);
		}
		else {
			System.out.println("not found");
		}
	}
	

}
