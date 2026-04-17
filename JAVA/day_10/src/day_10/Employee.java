package day_10;

public class Employee implements Comparable<Employee> {
	private int empId;
	private String empname;
	private float sal;

	public Employee(int empId, String empname, float sal) {
		super();
		this.empId = empId;
		this.sal = sal;
		this.empname = empname;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", sal=" + sal + ", empname=" + empname + "]";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int compareTo(Employee e) {
		if (this.empId > e.empId) {
			return +1;
		} else if (this.empId < e.empId) {
			return -1;
		} else
			return 0;
	}

}
