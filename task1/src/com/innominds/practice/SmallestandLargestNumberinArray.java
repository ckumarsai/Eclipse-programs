package com.innominds.practice;

import java.util.Arrays;

public class SmallestandLargestNumberinArray {

	public static void main(String[] args) {
		int[] numbers= {1,60,-300,400,800};
		int largest=numbers[0];
		int smallest=numbers[0];
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>largest) {
				largest=numbers[i];
			}else if(numbers[i]<smallest) {
				smallest=numbers[i];
			}
			
		}
		System.out.println("The nums in array is:"  +Arrays.toString(numbers));
		System.out.println("Largest num is:" + largest);
		System.out.println("smallest num is:" + smallest);

		

	}

}
