import java.util.Scanner;

public class avgOfNum {
	Scanner sc=new Scanner(System.in);
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	int num3=sc.nextInt();
	
	public double avgOfNumbers() {
		double sum=num1+num2+num3;
		double res=sum/3;
		return res;
	}

	public static void main(String[] args) {
		avgOfNum avg=new avgOfNum();
		System.out.println(avg.avgOfNumbers());;


	}

}
