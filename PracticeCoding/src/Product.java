import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int num=sc.nextInt();
		int num1=sc.nextInt();
		int res=num* num1;
		
		System.out.println(num +"x"+num1+"="+res);

	}

}
