package inheritance;

public class D extends C {
	public D() {
		System.out.println("In default of D");
	}
	public D (int a) {
		super(10.2f);
		System.out.println("In parameter of D");
	}
	public static void main(String[] args) {
		//D d = new D();
		D d = new D(10);
	}

}
