package day_12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Demo {
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(10,56,78,11,13,4,7);
		li.stream().forEach(System.out::println);
		
		int sum = IntStream.of(1,2,3,4,5,6).sum();
		System.out.println("Sum :"+sum);
		System.out.println("---------------");
		int t = IntStream.rangeClosed(5,10).sum();
		System.out.println("Total :"+t);
		System.out.println("---------------");
		
		int total = li.stream()
				.filter(x-> x % 2 == 0)
				.map(x -> x * 2)
				.reduce(0,Integer::sum);
		System.out.println("Tolat :"+total);
		System.out.println("---------------");
		
	}
}
