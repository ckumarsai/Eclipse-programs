
public class MinmaxNumber {

	public static void main(String[] args) {
//	int[] arr= {60,6,4,10,19,20,30,49};
//	int min=0,max=0;
//	for(int i=0;i<arr.length;i++) {
//		for(int j=i+1;j<arr.length;j++) {
//			if(arr[j]>arr[i]) {
//				max=arr[j];				
//			}else if(arr[i]>min) {
//				min=arr[i];
//			}
//		}
//	}
//	System.out.println(max);
//	System.out.println(min);
		MinmaxNumber m=new MinmaxNumber();
		int[] arr= {3,10,20,30,40,1};
		System.out.println(m.minnum(arr));
		System.out.println(m.maxnum(arr));
		
	}
	public int minnum(int[] array) {
		int min=array[0];
		for(int i=0;i<array.length;i++){
			if(array[i]<min){
				min=array[i];
				
			}
		}
		return min;
	}
	public int maxnum(int[] array) {
		int max=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		return max;
	}

}