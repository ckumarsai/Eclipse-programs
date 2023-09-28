package com.innominds.practice;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int arr[]= {1,3,5,6};
//		int n=arr.length;
		int k=8;
		System.out.println("SearchInsertPosition is:" +findIndex(arr,k));


	}
	public static int findIndex(int arr[],int k) {
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==k)
				
				return i;
			
			else if(arr[i]>k) {
				return i;
				
			}
		}
		return arr.length;
//		return arr[i];
	}
	
}
