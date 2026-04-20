//Write a Java program to manage employees’ payroll.
//Create an Employee class with: int id, String name, String designation, double salary. (5 Marks)
//Store at least 6 employees in an ArrayList<Employee> and display them. (5 Marks)
//Filter and display employees with salary > 50,000. (5 Marks)
//Sort employees by designation alphabetically using a Comparator. (5 Marks)
//Create a Map<String, Double> showing total salary per designation. (10 Marks)

package assign_day11;

public class Employee {
	private int Id;
	private String name;
	private String designation;
	private double Salary;
	
	public Employee() {}
	
	public Employee(int Id,String name,String designation,double Salary) {
		this.Id = Id;
		this.name = name;
		this.designation = designation;
		this.Salary = Salary;
	}
	public int getId() {
		return Id;
	}
	public void setId(int Id) {
		this.Id = Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", designation=" + designation + ", Salary=" + Salary + "]";
	}
}
