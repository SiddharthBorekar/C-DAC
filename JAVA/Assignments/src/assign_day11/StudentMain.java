package assign_day11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

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
		Scanner s = new Scanner(System.in);
		List<Student> a = new  ArrayList <Student>();
		
		for(int i = 0; i<3;i++)
		{
			System.out.println("Enter Student Id: ");
			int id = s.nextInt();
			s.nextLine();
			System.out.println("Enter Student Name: ");
			String nm = s.nextLine();
			System.out.println("Enter Student Department: ");
			String dept = s.nextLine();
			System.out.println("Enter Student Marks: ");
			double marks = s.nextDouble();
			
//			Student ss = new Student(id, nm, dept, marks);
//			a.add(ss);
			a.add(new Student(id, nm, dept, marks));
			
		}
//		System.out.println(a);
		a.stream().forEach(System.out::println);
		System.out.println("------------------");
		a.stream().filter(i->i.getMarks()>60).forEach(System.out::println);
		System.out.println("------------------");
		a.stream().sorted(Comparator.comparing(Student::getMarks).reversed()).forEach(System.out::println);
		System.out.println("------------------");
		Map<String, List<Student>> m =a.stream().collect(Collectors.groupingBy(Student::getDepartment));
		System.out.println(m);
		
	}
}
