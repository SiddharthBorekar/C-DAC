package wrapper;

public class WrapperDemo {
	public static void main(String[] args) {
		int no = 10;
		Integer i = new Integer(no);  //Boxing
		int n = i.intValue();		  //UnBoxing
		//String to premitive
		String str = "100";
		int a = Integer.parseInt(str);
		//String to wrapper
		Integer b = Integer.valueOf(str);
		//autoboxing
		int s = 11;
		Integer d = s;
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		//Auto Unboxing
		int m = d;
		System.out.println(m);
	}
}
