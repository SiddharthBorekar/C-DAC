package hashtable;

import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable <Temp,String> h = 
				new Hashtable <Temp,String>();
		h.put(new Temp(1),"C");
		h.put(new Temp(3),"A");
		h.put(new Temp(4),"E");
		h.put(new Temp(23),"R");
		h.put(new Temp(15),"W");
		System.out.println(h);
	
		h.put(new Temp (1),"C");
		System.out.println(h);
//		h.put(null, null);				//In Hashtable Null is not allowed 
//		System.out.println(h);			//It show NullPointerException

	}
}
