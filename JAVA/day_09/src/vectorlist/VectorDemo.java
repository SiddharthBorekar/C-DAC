package vectorlist;
import java.util.Enumeration;
import java.util.Vector;
public class VectorDemo {
	public static void main(String[] args) {
		Vector <Integer> v =new Vector <Integer>(5);			//vector Capacity is 10
			System.out.println(v.capacity());
			
			for(int i=1;i<16;i++) {
				v.addElement(i);			           //To add elements in vector 
			}
			System.out.println(v);	
			for(int i=0;i<5;i++) {
				v.remove(0);
			}
			System.out.println(v);
//			v.add(11);
//			System.out.println(v);
//			System.out.println(v.capacity());
//			System.out.println(v.remove(4));
//			System.out.println(v.capacity());
		
			Enumeration <Integer> e = v.elements();
//			while(e.hasMoreElements()) {
//				
//				System.out.println(e.nextElement());
//			}
	}
}
