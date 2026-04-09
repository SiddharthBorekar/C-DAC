package p1;

public class A {
//	private int no;
	public int no;
	
	public A() {
		no = 10;
	}
	public int getA() {
		return no;
	}
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.getA());
		System.out.println(a.no);
	}
}