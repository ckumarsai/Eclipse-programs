import java.util.Scanner;

public class Sumofdigits {
	public static int sumOfdigits(Long n) {
		int sum=0;
		while(n!=0) {
			sum+=n%10;
			n/=10;
			
		}
		return sum;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input to the number:");
		Long n=sc.nextLong();
		System.out.println("The sum of digits is:" + sumoOfdigits(n));	
	}
	
	

}
