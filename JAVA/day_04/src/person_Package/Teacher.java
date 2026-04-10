package person_Package;

public class Teacher extends Person{
	private String subject;
	
	public Teacher() {}
	
	public Teacher(String fname,String lname ,int age,String subject) {
		super(fname,lname,age);
		this.subject = subject;
	}
	public String toString() {
		return super.toString()+ subject;
	}
	public void getData() {
		super.getdata();
		System.out.println("Enter Subject :");
		subject = s.next();
	}
	public void display() {
		super.display();
		System.out.println(subject);
	}
	}
