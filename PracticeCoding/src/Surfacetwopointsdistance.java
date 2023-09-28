import java.util.Scanner;

public class Surfacetwopointsdistance {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Input to the lattitude of Co-01");
		double lat1=input.nextDouble();
		System.out.println("Input to the langitude of Co-01");
		double long1=input.nextDouble();
		System.out.println("Input to the lattitude of Co-02");
		double lat2=input.nextDouble();
		System.out.println("Input to the langitude of Co-02");
		double long2=input.nextDouble();
		System.out.println("The distance between the points is :" + distanceLatandLang(lat1,long1,lat2,long2));
	}
	
	public static double distanceLatandLang(double lat1,double long1,double lat2,double long2) {
		lat1=Math.toRadians(lat1);
		long1=Math.toRadians(long1);
		lat2=Math.toRadians(lat2);
		long2=Math.toRadians(long2);
		double earthradius=6371.01;
		return earthradius*Math.acos(Math.sin(lat1)*Math.sin(lat2)+Math.cos(lat1)*Math.cos(lat2)*Math.cos(long1-long2)) ;
	}

}
