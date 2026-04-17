package tree;

import java.util.TreeSet;

public class TreetSetDemo {
	public static void main(String[] args) {
		
		TreeSet t = new TreeSet();
//		t.add(10);
//		t.add(null); //NullPointerException
		t.add(89);
		t.add(78);
		t.add(32);
//		t.add(10.2f); //ClassCastException: class java.lang.Integer cannot be cast to class java.lang.Float 
		System.out.println(t);
	}
}