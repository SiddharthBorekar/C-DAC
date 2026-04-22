//Create a class Employee  with(empNo ,salary and totalSalary) ) with following features.
//Only parameterized constructor;
//totalSalary always represents the total of all the salaries of all employees created.
//empNo should be auto incremented. 
//display total employees and totalSalary using the class method.

package assign_3;

public class EmployeeMain {
	private static int empNo;
	private float sal;
	private static float totalsal;
	
	static {
		empNo = 0;
		totalsal = 0;
	}
	
	public EmployeeMain(float sal) {
		empNo++;
		this.sal = sal;
		totalsal += sal;
	}
	public static void display() {
		System.out.println("EmpNo :"+empNo+"TotalSal :"+totalsal);
	}
	
	public static void main(String[] args) {
		EmployeeMain e1 = new EmployeeMain(50870);
		EmployeeMain.display();
		EmployeeMain e2 = new EmployeeMain(70250);
		EmployeeMain.display();
		EmployeeMain e3 = new EmployeeMain(90440);
		EmployeeMain.display();
		EmployeeMain e4 = new EmployeeMain(70450);
		EmployeeMain.display();
		EmployeeMain e5 = new EmployeeMain(70044);
		EmployeeMain.display();
	}
}
