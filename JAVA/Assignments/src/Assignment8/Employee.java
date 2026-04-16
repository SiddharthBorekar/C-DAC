package Assignment8;
import java.util.*;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private float salary;
	
	public Employee(int id,String name,float salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toString() {
		return "\nID= "+id+" Name= "+name+" Salary= "+salary;
	}
	
	
	public int getId() {
		return id;
	}
	@Override
	public int compareTo(Employee e) {
		
		return this.id -e.id;
	}
}