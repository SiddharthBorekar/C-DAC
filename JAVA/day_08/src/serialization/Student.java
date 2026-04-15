package serialization;

import java.io.Serializable;

public class Student implements Serializable{
	private int rollNo;
	private String name;
	
	public Student() {
		System.out.println("Default Constructor");
	}
	public Student(int rollNo,String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	public String toString() {
		return rollNo+ "   " +name;
	}
	
}
