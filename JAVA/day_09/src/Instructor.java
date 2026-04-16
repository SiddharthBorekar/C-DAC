import java.util.*;
public class Instructor {
	private String name;
	private int age;
	private String gender;
	private boolean isOnlineCourse;
	private List<String> courses;
	
	public Instructor() {
		System.out.println("Default Constructor");
	}
	
	public Instructor(String name,int age,String gender,boolean isOnlineCourse,List<String> courses)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.isOnlineCourse = isOnlineCourse;
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Instructor [name=" + name + ", age=" + age + ", gender=" + gender + ", isOnlineCourse=" + isOnlineCourse
				+ ", courses=" + courses + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public boolean isOnlineCourse() {
		return isOnlineCourse;
	}
	public void setOnlineCourse(boolean isOnlineCourse) {
		this.isOnlineCourse = isOnlineCourse;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	
	public static void main(String[] args) {
		Instructor i1 = new Instructor ("Siddharth",23,"Male",false,
				Arrays.asList("C","C++",".Net"));
		System.out.println(i1);
	}
	
}
