package assign_3;

import java.util.Scanner;

public class Student {

	private int rollNo;
	private String name;
	private int age;
	private int score;

	public Student(int rollNo, String name, int age, int score) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter details Of student: ");
		Student[] stud = new Student[5];

		for (int i = 0; i < stud.length; i++) {
			System.out.println("Enter rollNo: ");
			int rn = sc.nextInt();
			System.out.println("Enter Name: ");
			String nm = sc.next();
			System.out.println("Enter age: ");
			int age = sc.nextInt();
			System.out.println("Enter score: ");
			int scr = sc.nextInt();
			stud[i] = new Student(rn, nm, age, scr);

		}

		System.out.println("Student Lies in GRP 0-50 Score");
		for (Student students : stud) {
			if (students.getScore() >= 0 && students.getScore() <= 50) {

				
				System.out.println(students.toString());
			}
		}
		System.out.println("Student Lies in GRP 50-65 Score");
		for (Student students : stud) {
			if (students.getScore() >= 50 && students.getScore() <= 65) {
				System.out.println(students.toString());
			}
		}
		System.out.println("Student Lies in GRP 65-80 Score");
		for (Student students : stud) {
			if (students.getScore() >= 65 && students.getScore() <= 80) {
				System.out.println(students.toString());
			}
		}
		System.out.println("Student Lies in GRP 80-100 Score");
		for (Student students : stud) {
			if (students.getScore() >= 80 && students.getScore() <= 100) {

				System.out.println(students.toString());
			}
		}
		sc.close();
	}
}