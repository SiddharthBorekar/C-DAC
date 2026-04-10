package inheritance;

public class B extends A{
	public void m1() {
		System.out.println("In m1() of B");
	}
	public void m2() {
		System.out.println("In m2() of B");
	}
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.no);  // no is private in class A that's why showing error
									//if i make protected,public,default it will work.
		System.out.println("no ="+b.getno());
		b.m1();
		
		//polymorphic reference
		//superclass reference = childclass object
		//B a= new A();
		A a = new A();
		a.m1();
		
		if(a instanceof B)
		{
			((B)a).m2();
		}
		A c = new B();
		System.out.println(c instanceof B);	
	}
}
