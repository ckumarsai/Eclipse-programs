
public class primenumberArray {

	public static void main(String[] args) {
		int primearr[]= {1,7,4,3,5,7,11,17,0};
		for(int i=0;i<primearr.length;i++) {
			int count=0;
//			if(primearr[i]==0 || primearr[i]==1) {
//				System.out.println( "is not a prime");
//			}
			if(primearr[i]==0 || primearr[i]==1) {
				continue;
			}else {
				
			for(int j=2;j<primearr[i];j++) {
				if(primearr[i]%j==0) {
					count++;
				}
			}
			if(count==0 ) {
				System.out.println(primearr[i] + " is prime");
			}
			}
		}
	}

}
