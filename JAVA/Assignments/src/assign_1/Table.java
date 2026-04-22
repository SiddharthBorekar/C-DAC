package assign_1;
import java.util.Scanner;
public class Table {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Eneter a number to print Table :");
		int num = s.nextInt();
		
		int table;
		for(int i=1;i<=10;i++) {
			table = num * i;
			System.out.println(table);
		}
		

	}	
	
}
