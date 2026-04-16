package arrayList;
import java.util.*;
public class ArrayListDemo {
	public static void main(String[] args) {
		//non generic values of arraylist
		ArrayList a = new ArrayList();
		
		a.add(10);
		a.add("Sidd");	//this is how we create ArrayList
		a.add(10.25f);
		System.out.println(a);
		
		a.add(1,"B");	//We can add Elements with Index
		System.out.println(a);
		System.out.println(a.get(3));
		
		//a1 is empty 
	
		ArrayList a1 = new ArrayList();
		a1.add(100);
		a1.addAll(a);		//Copy all the elements of a to a1
		System.out.println(a1);
		
//		int a = (Integer)a.get(3);
		for(Object o:a1) {
			System.out.println(o);
//			Integer obj = (Integer)o;
		}
	}
}
