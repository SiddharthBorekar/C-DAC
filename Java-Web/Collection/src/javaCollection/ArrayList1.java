package javaCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {
	public static void main(String[] args) {
		List <String>li = new ArrayList <>();
		
		li.add("sidd");
		li.add("aditya");
		li.add("A");
		li.add("ABC");
		
		System.out.println(li);
		
		for(String s : li) {
			System.out.println(s);
		}
		
		Collections.sort(li);
		System.out.println(li); 
		
		
		String s = li.get(3);
		System.out.println(s);
		
		Iterator<String> iterator = li.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(" "
					+ "Element: " + iterator.next());
		}
		
		Collections.sort(li,Collections.reverseOrder());
		System.out.println(li);
	}

}