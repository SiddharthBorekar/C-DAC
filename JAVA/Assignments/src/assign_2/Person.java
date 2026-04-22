package assign_2;

import java.util.Scanner;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		age = 18;
	}
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;;
	}
	
	public void init() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name :");
		name = s.next();
		
		System.out.println("Enter age (age should greater than 18)");
		age = s.nextInt();
		if(age < 18) {
			age = 18;
		}
	}
	
	public void Display() {
		System.out.println("name = "+name);
		System.out.println("Age = "+age);
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		p.init();
		p.Display();
	}
}
