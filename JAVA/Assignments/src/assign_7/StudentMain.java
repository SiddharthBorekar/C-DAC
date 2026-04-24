package assign_7;

import java.util.ArrayList;
import java.util.Scanner;

/*Q1. Student Result Management (30 Marks)
Write a Java program to manage students’ exam results.
	Create a Student class with: int id, String name, String department, double marks. (5 Marks)
	Take input for at least 5 students from the user and store them in an ArrayList<Student>. (5 Marks)
	Display all student records. (5 Marks)
	Display only those students who scored more than 60 marks. (5 Marks)
	Sort students by marks in descending order using a Comparator and display the sorted list. (5 Marks)
	Create a Map<String, List<Student>> where key = department name and value = list of students belonging to that department, and display this map. (5 Marks)*/
public class StudentMain {
	public static void main(String[] args) {
		ArrayList<Student> a = new ArrayList<Student>();
		Scanner s = new Scanner (System.in);
		for(int i=1;i<=2;i++) {
			System.out.println("Enter a Student ID");
			int id = s.nextInt();
			
			System.out.println("Enter a Student name");
			String name = s.nextLine();
			
			s.nextLine();
			
			System.out.println("Enter a Student department");
			String department = s.nextLine();
			
			System.out.println("Enter a Student marks");
			double marks = s.nextDouble();
			
			a.add(new Student(id, name, department, marks));
		}
		a.stream().forEach(System.out::println);
	}
}