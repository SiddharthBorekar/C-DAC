//Create a class Employee  with(empNo ,salary and totalSalary) ) with following features.
//Only parameterized constructor;
//totalSalary always represents the total of all the salaries of all employees created.
//empNo should be auto incremented. 
//display total employees and totalSalary using the class method.

package assign_day3;

public class Employee1 {
	private static int empNo;
	private float sal;
	private static float totalsal;
	
	static {
		empNo = 0;
		totalsal = 0;
	}
	
	public Employee1(float sal) {
		empNo++;
		this.sal = sal;
		totalsal += sal;
	}
	public static void display() {
		System.out.println("EmpNo :"+empNo+"TotalSal :"+totalsal);
	}
	
	public static void main(String[] args) {
		Employee1 e1 = new Employee1(50870);
		Employee1.display();
		Employee1 e2 = new Employee1(70250);
		Employee1.display();
		Employee1 e3 = new Employee1(90440);
		Employee1.display();
		Employee1 e4 = new Employee1(70450);
		Employee1.display();
		Employee1 e5 = new Employee1(70044);
		Employee1.display();
	}
}
