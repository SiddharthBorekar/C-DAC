package day_12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		Employee e1 = new Employee(111,"Sidd",500000);
		Employee e2 = new Employee(222,"aditya",600000);
		Employee e3 = new Employee(333,"sagar",700000);
		Employee e4 = new Employee(444,"Ishwar",800000);
		Employee e5 = new Employee(555,"aditya",900000);
		
		List <Employee> list = Arrays.asList(e1,e2,e3,e4,e5);
		long count = list.stream().count();
		
		System.out.println("Count :"+count);
		
		List<Employee> l1 = list.stream().filter(i -> i.getEmpSal()>700000)
				.collect(Collectors.toList());
		System.out.println(l1);
		
		System.out.println("____________________");
		
		list.stream().filter(i -> i.getEmpSal()>700000)
		.collect(Collectors.toList()).forEach(System.out::println);;
		
		
		
	}
}