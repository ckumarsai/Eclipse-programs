import java.util.Scanner;

public class ArithmaticOperations {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int num1=sc.nextInt();
	

	public int adding() {
		 int res=num+num1;
		 return res;
	}
	
	public int substraction() {
		int res=num-num1;
		return res;
	}
	
	public int multiply() {
		int res=num*num1;
		return res;
	}
	public int devide() {
		int res=num/num1;
		return res;
	}
	public int modulo() {
		int res=num % num1;
		return res;
	}
	
	public static void main(String[] args) {
		ArithmaticOperations ac =new ArithmaticOperations();
		System.out.println(ac.adding());
		System.out.println(ac.substraction());
		System.out.println(ac.multiply());
		System.out.println(ac.devide());
		System.out.println(ac.modulo());;
	}

}
