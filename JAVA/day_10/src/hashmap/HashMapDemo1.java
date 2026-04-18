package hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 {
	public static void main(String[] args) {
		HashMap<String,Integer> h = 
				new HashMap<String,Integer>();
		
		h.put("Rahul",600);
		h.put("Sidd",710);
		h.put("Aditya",700);
		h.put("Sagar",300);
		h.put("om",100);
		System.out.println(h);

		Set<String> s = h.keySet();
		System.out.println(s);

		Collection<Integer> i = h.values();
		System.out.println(i);
		
		Set<Entry<String,Integer>> s1 = h.entrySet();
		System.out.println(s1);
	}
}
