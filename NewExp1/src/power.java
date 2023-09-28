
public class power {

	public static void main(String[] args) {
		int number = 2;
		int powers = 3;
		power p = new power();
//		int result=powernumber(number,power);
		int result=p.powernumber(number, powers);
		System.out.println(result);
	}

	public  int powernumber(int number,int powers) {
		if(powers!=0) {
		return ((number*powernumber(number,powers-1)));
	}else {
		return 1;
	}
}
}

