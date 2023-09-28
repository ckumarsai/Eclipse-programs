package com.innominds.practice;

public class ZigZagconversion {

	public static void main(String[] args) {
		ZigZagconversion z=new ZigZagconversion();
		System.out.println(z.convert("PAYPALISHIRING", 3));
		
	}
	
		public String convert(String s, int numRows) {
			StringBuilder[] sbs=new StringBuilder[numRows];
			for(int i=0;i<numRows;i++) {
				sbs[i]=new StringBuilder();
			}
			char[] arr=s.toCharArray();
			int n=arr.length;
			int index=0;
			//Traverse zigzag
			while(index<n) {
				//go down
				for(int j=0;j<numRows && index<n; j++) {
					sbs[j].append(arr[index++]);
				}
				//go up before start
				for(int j=numRows-2; j>0 && index<n;j--) {
					sbs[j].append(arr[index++]);
				}
			}
			//combine all String builders into one
			StringBuilder res=sbs[0];
			for(int i=0;i<numRows;i++) {
				res.append(sbs[i].toString());
			}
			return res.toString();
		}
}
