package day_05;

public class Employee extends Object {
	private int empId;
	private String empName;

	public Employee() {
		System.out.println("Default Constructor");
	}

	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	public String toString() {
		return empId + " " + empName + " ";
	}

	@Override
	public boolean equals(Object o) {
		Employee e = (Employee) o;
		if ((this.empId == e.empId) && (this.empName.equals(e.empName)))
			return true;
		else
			return false;
	}

	@Override
	public int hashCode() {
		return empId + 1;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "sidd");
		Employee e2 = new Employee(1, "Sidd");

		if (e1.equals(e1)) {
			System.out.println("Object are equal");
		} else {
			System.out.println("Object are not Equal");
		}
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
	}

}
