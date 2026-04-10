package assign_day3;

import java.util.Scanner;

public class Student {
	private String name;
	private int Rollno;
	private int age;
	private int score;
	
	public Student() {
		System.out.println("Default constructor");
	}
	public Student(String name,int Rollno,int age,int score) {
		this.name = name;
		this.Rollno = Rollno;
		this.age = age;
		this.score = score;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int Roll = s.nextInt();
		
	
	}
}
