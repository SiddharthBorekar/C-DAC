//In a company an employee is paid as under:
//If his basic salary is less than Rs. 1500, then HRA = 10% of basic salary 
//and DA = 90% of basic salary.
//If his salary is either equal to or above Rs. 1500, then HRA = Rs. 500
//and DA = 98% of basic salary.
//If the employee's salary is input by the user, write a program to find his gross salary. GS=Basic+DA+HRA

package assign_3;

import java.util.Scanner;

public class Employee {
	private float sal;
	private float HRA;
	private float DA;
	
	public Employee() {}
	
	public Employee(float sal,int HRA,int DA) {
		this.sal = sal;
		this.HRA = HRA;
		this.DA = DA;
	}
	
	public void init() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Salary of an Employee :");
		sal = s.nextFloat();
	}
	
	public void salary() {
		if (sal < 1500) {
			HRA = sal * 0.10f;
			DA = sal * 0.90f;
			System.out.println("HRA is :"+HRA);
			System.out.println("DA is :"+DA);
		}else {
			HRA = 500;
			DA = sal * 0.98f;
			System.out.println("HRA is :"+HRA);
			System.out.println("DA is :"+DA);
		}
	}	
	public void grosssal() {
		float GS;
		GS = sal + DA + HRA;
		
		System.out.println("Gross Salary is :"+GS);
	}
	
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.init();
		e.salary();
		e.grosssal();
	}
}
