
public class PalindromeString {

	public static void main(String[] args) {
		
		String str="hara";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			System.out.println(rev);
		}
		if(str.equals(rev)) {
			System.out.println(str + " is pal");
		}else {
			System.out.println(str + " is not a pal");
		}
	}

}
