import java.util.Scanner;
public class Calculate_Area {
	private float radius;
	private double area;
	
	public Calculate_Area() {
		radius = 0;
		area = 0;
	}
	public Calculate_Area(float r)
	{
		radius = r;
	}
	public double SentArea() {
		area = 3.14*(radius*radius);
		return area;
	}
	public void Display(){
		System.out.println(SentArea());
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Radius :");
		int x = s.nextInt();
//		s.Calculate_Area(x);
		
		Calculate_Area a = new Calculate_Area(x);
		a.Display();
	}
}