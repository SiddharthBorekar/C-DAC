package assign_4;

import java.util.Scanner;

public class FullTimeFaculty extends Faculty {

	private double basic;
	private double allowance;

	public void acceptDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter FacultyId: ");
		facultyId = sc.nextInt();
		System.out.println("Enter Basic Pay: ");
		basic = sc.nextDouble();
		System.out.println("Enter Allowance: ");
		allowance = sc.nextDouble();
		salary = basic + allowance;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Basic Pay: " + basic + " Allowance: " + allowance);
	}

}