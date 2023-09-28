import java.util.Scanner;

public class FindoutNumbers {
	public static void main(String[] args) {
		String input;
		String numinstring;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		input = sc.nextLine();
		numinstring = input.replaceAll("[^0-9]", "");
		System.out.println("The  numbers in before and after the characters are :" + numinstring);

	}
}
