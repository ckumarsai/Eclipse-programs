package com.innominds.practice;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class DuplicatesnumsinArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 4, 1, 5, 8, 3, 4, 8, 2};

		for (int i = 0; i <arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					int []result= {arr[j]};
					System.out.print(Arrays.toString(result));					
				}
			}
			

		}
		
//		LinkedHashSet<Integer> lh =new LinkedHashSet<Integer>();
//		int[] arr = {1, 2, 4, 1, 5, 8, 3, 4, 8, 2};
//		for(int i=0; i<arr.length;i++) {
//			lh.add(arr[i]);
//		}
//		System.out.println(lh);
	}
}










