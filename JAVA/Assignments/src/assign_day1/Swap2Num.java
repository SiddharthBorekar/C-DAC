package assign_day1;
import java.util.Scanner;
public class Swap2Num {
	public static void main(String[] args) {
		Scanner  s = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int x = s.nextInt();
		int y = s.nextInt();
			
//		int temp = x;
//		x = y;
//		y = temp;
//		System.out.println("after swapping number ");
//		System.out.println(x);
//		System.out.println(y);
		
		
		System.out.println("Without using 3rd varable");
		//x=10  y=20
		x = x + y;		//x=30
		y = x - y;		//y=10
		x = x - y;		//x=20
		
		System.out.println(x);
		System.out.println(y);
	}
}
