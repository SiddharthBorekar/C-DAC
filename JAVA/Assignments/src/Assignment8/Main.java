package Assignment8;
import java.util.*;
public class Main {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		List<Employee> a=new ArrayList<Employee>();
		a.add(new Employee(1,"Ashish",90000));
		a.add(new Employee(2,"Ram",90000));
		a.add(new Employee(3,"Rohit",90000));
		a.add(new Employee(6,"Ishwar",90000));
		a.add(new Employee(5,"Siddarth",90000));
		a.add(new Employee(4,"Joshi",90000));

		System.out.println(a);
		
		System.out.println("Enter id of employe to find: ");
		int n=sc.nextInt();
		
		for(Employee i:a) {
			if(n==i.getId())
			System.out.println(i);
		}
		
		
//		Collections.sort(List<Employee> a);
		Collections.sort(a);

		for(Employee i:a) {
			System.out.println(i);
		}
	}
}