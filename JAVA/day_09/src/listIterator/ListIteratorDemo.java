package listIterator;

import java.util.*;

public class ListIteratorDemo {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();

		a.add("Sidd");
		a.add("adi");
		a.add("madhuri");
		a.add("Sharad");

		System.out.println("--------");
		ListIterator<String> itr = a.listIterator();
		while (itr.hasNext()) {
			String str = itr.next();
//			itr.add("Borekar");
			System.out.println(str);
		}
		System.out.println("--------");

		while (itr.hasPrevious()) {
			String str = itr.previous();
//			itr.add("Borekar");
			System.out.println(str);
		}
	}
}