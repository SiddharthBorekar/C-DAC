package hashmap;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap <Integer,String> h = 
				new HashMap <Integer,String>();
		
		h.put(100,"Siddharth");
		h.put(200,"Sharad");
		h.put(300,"Madhuri");
		
		System.out.println(h);
		h.put(100,"Siddharh");
		System.out.println(h);
		h.put(null, null);		//No error Because Null is allowed not Allowed in HashTable
		System.out.println(h);
	}
}
