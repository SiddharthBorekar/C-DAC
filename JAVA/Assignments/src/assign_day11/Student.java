//Create a Student class with: int id, String name, String department, double marks. (5 Marks)
//Take input for at least 5 students from the user and store them in an ArrayList<Student>. (5 Marks)
//Display all student records. (5 Marks)
//Display only those students who scored more than 60 marks. (5 Marks)
//Sort students by marks in descending order using a Comparator and display the sorted list. (5 Marks)
//Create a Map<String, List<Student>> where key = department name and value = list of students belonging to that department, and display this map. (5 Marks)

package assign_day11;

public class Student {
	private int id;
	private String name;
	private String department;
	private double marks;
	
	public Student() {}

	public Student(int id, String name, String department, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", department=" + department + ", marks=" + marks + "]";
	}

	
	
	
	
	
}
