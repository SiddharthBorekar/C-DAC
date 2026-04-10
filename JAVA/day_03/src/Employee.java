public class Employee {
	private int empId;
	private String empName;
	private Date dt_of_joining;
	
	public Employee() {
		System.out.println("Difualy constructor");
	}
	public Employee(int ed ,String en , Date dj) {
		empId = ed;
		empName = en;
		dt_of_joining = dj;
	}
	public String toString() {
		return "Employee [empid = "+empId+" empName = "+empName+" Date_of_joining = "+dt_of_joining+"]";
	}
	public static void main(String[] args) {
		Employee emp= new Employee(111,"sidd",new Date(9,4,2026));
		System.out.println(emp);
	}
	
}
