package day_05;

public class Test {
	public static void main(String[] args) {
		Student s = new Student (1,"Sidd");
		s = new Student (2,"Sagar");
		System.out.println(s.getRollNo()+" "+s.getName());
		
		//final Student s = new Student(1,"Ishwar");//s reference var is already define and we put final
													//keyword so s is not overriden
	}
}
