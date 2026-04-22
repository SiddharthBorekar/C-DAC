package assign_4;

public class FacultyMain {
	public static void main(String[] args) {
		FullTimeFaculty f1 = new FullTimeFaculty();
		f1.acceptDetails();
		f1.display();
		FullTimeFaculty f2 = new FullTimeFaculty();
		f2.acceptDetails();
		f2.display();

		PartTimeFaculty p1 = new PartTimeFaculty();
		p1.acceptDetails();
		p1.display();
		PartTimeFaculty p2 = new PartTimeFaculty();
		p2.acceptDetails();
		p2.display();

	}

}