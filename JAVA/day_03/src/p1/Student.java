package p1;
public class Student {
	private int rollno;
	private String name;
	private static int count;
	
	public Student () {}
	public Student(int rn, String n) {
		this.rollno = rn;
		this.name = n;
		count++;
	}
	public String toString() {
		return "Student [rn = "+rollno+",name = "+name+"]";
	}
	public static void getCount() {
		System.out.println("count = "+count);
	}
	static
	{
		System.out.println("static block is called :");
		count = 10;
	}
	public static void main(String[] args) {
		System.out.println("In main method");
		Student s1 = new Student(1,"Sidd");
		Student s2 = new Student(2,"Aditya");
		Student s3 = new Student(3,"Aman");
//		Student.static getCount();
		Student.getCount();
	}
}