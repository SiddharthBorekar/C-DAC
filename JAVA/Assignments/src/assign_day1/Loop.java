package assign_day1;
import java.util.Scanner;
public class Loop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int size =  s.nextInt();
//		int size = 11;
		
//		for(int i=1;i<size;i++) {
//			System.out.println(i);
//		}
		int i = 0;
		while(i<size) {
			i++;
			System.out.println(i);
		}
		
	}
}
