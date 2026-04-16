package generic;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListdemo {
	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList <String>();
		ArrayList<Integer> a1 = new ArrayList <Integer>();
		a.add("Ishwar");
		a.add("Loves");
		a.add("Ishwari");
		
		
		a1.add(12);
		a1.add(15);
		a1.add(11);
		a1.add(17);
		
		for(String s:a)
		{
			System.out.println(s);
		}
		for(Integer s:a1)
		{
			System.out.print(s);
		}
		Collections.sort(a);
		System.out.println(a);
		
		
		
		
		Collections.sort(a1);
		System.out.println(a1);

	}
}
