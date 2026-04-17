import java.util.*;
import java.util.function.Consumer;
public class ConsumerDemo {
	public static void main(String[] args) {
		List<Instructor> l = Instructordetails.getAll();
		
		Consumer<Instructor> c = a -> {System.out.println(a);};
		l.forEach(c);
		
		//Get name of all Instructor
		System.out.println("_______________");
		Consumer<Instructor> c1 = a -> {System.out.println(a.getName());};
		l.forEach(c1);
		
		System.out.println("_______________");
		Consumer<Instructor> c2 = a -> {System.out.println(a.getAge());};
		l.forEach(c2);
		
		System.out.println("_______________");
		Consumer<Instructor> c3 = a -> {System.out.println(a.getGender());};
		l.forEach(c3);
		
		System.out.println("_______________");
		Consumer<Instructor> c4 = a -> {System.out.println(a.isOnlineCourse());};
		l.forEach(c4);
		
		System.out.println("______________ _");
		Consumer<Instructor> c5 = a -> {System.out.println(a.getCourses());};
		l.forEach(c5);
		
		System.out.println("_______________");
		Consumer<Instructor> c6 = a -> {System.out.println(a.isOnlineCourse());};
		l.forEach(c6);
		
		
		
	}
}
