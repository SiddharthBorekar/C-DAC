package day_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		Employee e1 = new Employee(222, "Sidd", 451.45f);
		Employee e2 = new Employee(111, "Aditya", 451.45f);
		Employee e3 = new Employee(555, "Om", 451.45f);
		Employee e4 = new Employee(444, "Rahul", 451.45f);
		Employee e5 = new Employee(333, "Muskan", 451.45f);

//		TreeSet <Employee> t = new TreeSet <Employee>();
		ArrayList<Employee> t = new ArrayList<Employee>();

		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);
		Collections.sort(t);
		System.out.println(t);
		t.stream().sorted().forEach(System.out::println);

	}
}
