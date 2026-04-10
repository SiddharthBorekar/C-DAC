import java.util.Scanner;
public class sum_of_N_Num {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a nth number :");
		int size = s.nextInt();
		
		for(int i=1;i<size;i++) {
			
			System.out.println(size + i);
		}
	}	
}