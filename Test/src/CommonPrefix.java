import java.util.*;

class CommonPrefix {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);  
		System.out.println("Please enter the number of strings you want to enter: ");   
		String input = sc.nextLine(); 
		String[] arr = input.split(" ");
		
		System.out.println("input is:"+Arrays.toString(arr));
		
		int size = arr.length;
		System.out.println("entered size is:"+size);

		if (size ==0) {
			System.out.println(" Longest common prefix:");

		}

		else if (size == 1) {
			System.out.println("Longest common prefix: " + arr[0]);
		} else {
            System.out.println(Arrays.toString(arr));
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
			int length = arr[0].length();
			StringBuilder res = new StringBuilder();

			for (int i=0;i<length;i++) {
				if (arr[0].charAt(i) == arr[size - 1].charAt(i)) {
					res.append(arr[0].charAt(i));
				}

				else {
					System.out.println("There is no common prefix among the input strings");
					break;
				}
			}
			String result = res.toString();
			System.out.println("Longest common prefix: " + result);
		}
		sc.close();
	}
}





