package assign_4;

import java.util.Scanner;

public class PartTimeFaculty extends Faculty {

	private int hour;
	private double rate;

	public void acceptDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter FacultyId: ");
		facultyId = sc.nextInt();
		System.out.println("Enter Hour: ");
		hour = sc.nextInt();
		System.out.println("Enter Rate: ");
		rate = sc.nextDouble();
		salary = hour * rate;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Hour: " + hour + " Rate: " + rate);
	}
}