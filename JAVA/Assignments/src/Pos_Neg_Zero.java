import java.util.Scanner;
public class Pos_Neg_Zero {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Number :");
		int num = s.nextInt();
		
		if(num < 0) {
			System.out.println(num+" Number is Negative");
		}else if(num > 0) {
			System.out.println(num+" Number is Positive");
		}else if(num == 0) {
			System.out.println("Number is Zero");
		}else {
			System.out.println("Enter a valid number");
		}
		
	}
}
