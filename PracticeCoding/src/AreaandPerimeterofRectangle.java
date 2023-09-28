
public class AreaandPerimeterofRectangle {
	static double width=5.5;
	static double Height = 8.5;
	
	public double areaOfRectangle() {
		double res=width*Height;
//		System.out.println(res);
		return res;
	}
	public double perimeterOfRectangle() {
		double res1=2*(width+Height);
		return res1;
	}

	public static void main(String[] args) {
		AreaandPerimeterofRectangle ar=new AreaandPerimeterofRectangle();
		System.out.println("Area is:" + width +"x" + Height + "=" + ar.areaOfRectangle());
		System.out.println("perimeter is:" + "2" +(width +"x" + Height) + "=" + ar.perimeterOfRectangle());

	}

}
