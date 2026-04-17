package hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {
	public static void main(String[] args) {
// used for searching an element
		
//		HashSet h = new HashSet();
		LinkedHashSet h = new LinkedHashSet(); 		// order is preserved
//		h.add(null);  // 1st null will get added into hashset
		
		h.add(10);
		h.add('A');
		h.add(10);		// duplication is not allowed
		h.add(105.55f);
		h.add(null);
		System.out.println(h);
		
	}
}