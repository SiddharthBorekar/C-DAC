package person_Package;

public class HOD extends Teacher{
private String Department;
	
	public HOD() {}
	
	public HOD(String fname,String lname ,int age,String subject,String Department) {
		super(fname,lname,age,subject);
	
		this.Department = Department;
	}
	public String toString() {
		return super.toString()+ Department;
	}
	
	public void getData() {
		super.getdata();
		System.out.println("Enter Subject :");
		Department = s.next();
	}
	public void display() {
		super.display();
		System.out.println(Department);
	}
}
