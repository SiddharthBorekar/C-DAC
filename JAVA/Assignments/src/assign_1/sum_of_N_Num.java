package assign_1;
import java.util.Scanner;
public class sum_of_N_Num {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a nth number :");
		int size = s.nextInt();
		int sum = 0;
		
		for(int i=1;i<=size;i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}	
}