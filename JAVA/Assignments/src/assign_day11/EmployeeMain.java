//Write a Java program to manage employees’ payroll.
//Create an Employee class with: int id, String name, String designation, double salary. (5 Marks)
//Store at least 6 employees in an ArrayList<Employee> and display them. (5 Marks)
//Filter and display employees with salary > 50,000. (5 Marks)
//Sort employees by designation alphabetically using a Comparator. (5 Marks)
//Create a Map<String, Double> showing total salary per designation. (10 Marks)

package assign_day11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Employee> e = new ArrayList<Employee>();
		
		for(int i=1;i<=2;i++) {
			System.out.println("Enter Employee ID :");
			int Id = s.nextInt();
			
			System.out.println("Enter Employee name :");
			String name = s.next();
			
			System.out.println("Enter Employee designation :");
			String designation = s.next();
			
			System.out.println("Enter Employee salary :");
			double salary = s.nextDouble();
			
			e.add(new Employee(Id, name, designation, salary));
		}
			e.stream().forEach(System.out::println);
			System.out.println("---------------");
			e.stream().filter(i->i.getSalary()>50000).forEach(System.out::println);
			System.out.println("---------------");
			e.stream().sorted(Comparator.comparing(Employee::getDesignation)).forEach(System.out::println);
			
	}
}
