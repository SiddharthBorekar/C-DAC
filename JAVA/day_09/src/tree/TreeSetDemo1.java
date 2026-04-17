package tree;

import java.util.TreeSet;

public class TreeSetDemo1 {
	
	public static void main(String[] args) {
//		TreeSet<Integer> t = new TreeSet<Integer>();
		TreeSet<Integer> t = new TreeSet<Integer>(new MyComparator());
		
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(10);
		System.out.println(t);
		
	}

}