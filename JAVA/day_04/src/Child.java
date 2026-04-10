
public class Child extends Parent{
	public Child m1() {
		return this;
	}
	public void msg() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		new Child().m1().msg();  //this is also the method to get access.
	}
}
