public class Employee {
	private int empId;
	private String empName;
	private float empSal;
	
	
	public Employee() {
		System.out.println("Defult constructor ");
		empId = 111;
		empName = "Siddharth";
		empSal = 42.56f;
		}
	public Employee(int id,String en,float sal) {
		System.out.println("parameterize Constructor :");
			empId = id;
			empName = en;
			empSal = sal;			
	}
//	public String toString() {
//		return "Employe = ["+empId+" "+empName+" "+empSal+"]";
//	}
	
	public String toString() {
		String s="Employe = ["+empId+" "+empName+" "+empSal+"]";
		return s;
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();

		System.out.println(e);
		Employee e1 = new Employee(2,"siddharth",125.12f);
		System.out.println(e1);
	}
}	