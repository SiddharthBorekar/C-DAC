//This is a Parent class of Teacher, HOD ,Collage.
package person_Package;
import java.util.Scanner;

public class Person extends Object {
	private String firstName;
	private String lastName;
	private int age;
	
	protected Scanner s = new Scanner(System.in);
	
	public Person() {}
	
	public Person(String firstName , String lastName,int age){
		super();
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
	}
	public String toString() {
		return super.toString()+ firstName+""+lastName+""+age+"";
	}
	public void getdata() {
		System.out.println("Enteryour first and last Name :");
		firstName = s.next();
		lastName = s.next();
		System.out.println("Enter age :");
		age = s.nextInt();
	}
	public void display() {
		System.out.println(firstName+""+lastName+""+age+"");
	}
}
