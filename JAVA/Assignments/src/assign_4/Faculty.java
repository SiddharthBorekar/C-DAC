package assign_4;

public class Faculty {

	protected int facultyId;
	protected double salary;

	public Faculty() {

	}

	public Faculty(int facultyId, double salary) {
		super();
		this.facultyId = facultyId;
		this.salary = salary;
	}

	public void display() {
		System.out.println("FacultyId: " + facultyId + " Salary: " + salary);
	}

}