package tree;

import java.util.TreeSet;

public class TreeSetStr {
	public static void main(String[] args) {

		TreeSet<String> st = new TreeSet<String>(new MyComparatorStr());
//		TreeSet<String> st = new TreeSet<String>();
		st.add("sagar");
		st.add("digvijay");
		st.add("sid");
		st.add("amman");
		st.add("Amman");
		System.out.println(st);
		
	}
}