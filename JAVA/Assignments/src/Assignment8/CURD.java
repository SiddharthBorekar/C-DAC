package Assignment8;
import java.util.ArrayList;

public class CURD {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();

		System.out.println("add");
		a.add("Sidd");
		a.add("Aditya");
		a.add("Sagar");
		a.add("Aaman");
		a.add("IShwar");
		System.out.println(a);

		System.out.println("display");
		System.out.println();

		for (String s : a) {
			System.out.println(s);			//Display 
		}
		
		System.out.println("update");
		a.set(3, "Strix");							// Update
		System.out.println(a);

		System.out.println("\n delete\n");
		a.remove(3);							//Delete
		System.out.println(a);
		
	}
}