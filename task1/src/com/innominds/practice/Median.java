package com.innominds.practice;

//package com.code.practice;

import java.util.Arrays;

public class Median {
	public void medianOfSortedArray(int[] array) {
		int mid=array.length/2;
		if(array.length%2==0) {
			System.out.println("The median is:" +(array[mid]+array[mid-1])/2 );
		}else {
			System.out.println("The median is:" +array[mid]);
		}	
	}

	public static void main(String[] args) {
		int[]arr1= {1,3,5,8};
		int[] arr2= {2,4,6,7,9};
		int[] merge=new int[9];
		int count=0;
		for(int i=0;i<arr1.length;i++) {
			merge[i]=arr1[i];
			
			count++;
		}
		for(int j=0;j<arr2.length;j++) {
			
			merge[count++]=arr2[j];
		}
		for(int k=0;k<merge.length;k++) {
			System.out.print(merge[k]);
		}
	    Arrays.sort(merge);
	    System.out.println(Arrays.toString(merge));
	    Median m=new Median();
	    m.medianOfSortedArray(merge);
	}
	
	
	
}

