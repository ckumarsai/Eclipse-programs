package com.innominds.practice;

import java.util.Arrays;

public class Mean {

	public static void main(String[] args) {
//		int[] arry= {1,8,6,10};
//		int sum=0;
//		for(int i=0;i<arry.length;i++) {
//			sum=sum+arry[i];
//		}
//		System.out.println(sum);
//		double mean=sum/arry.length;
//		System.out.println("The mean is:" +mean);
		
		int[] array1= {1,4,6,10};
		int[] array2= {1,3,5,8,18};
		int[] mergedArray=new int[9];
		int count=0;
		for(int i=0;i<array1.length;i++) {
			mergedArray[i]=array1[i];
			count++;
		}
		for(int j=0;j<array2.length;j++) {
			mergedArray[count++]=array2[j];
		}
		Arrays.sort(mergedArray);
		System.out.println("merged array:" +Arrays.toString(mergedArray));
		double sum=0;
		for(int i=0;i<mergedArray.length;i++) {
			  sum=sum+mergedArray[i];
		}
		System.out.println("Mean is:" +sum/mergedArray.length);
	}

}