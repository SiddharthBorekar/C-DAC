package inner_Class;

public class Outer3 {
	private int n1;
	private static int n2;
	
	public Outer3() {
		n1 = 200;
	}
	static {
		n2 = 100;
	}
	public static class Inner3{
		private int n = 300;
		public void get() {
			System.out.println("n2 = "+n2);
		}
	}
	public static void main(String[] args) {
		Outer3.Inner3 i = new Outer3.Inner3();
		Outer3.Inner3 n = new Outer3.Inner3();
		n.get();
		i.get();
		
	}
}

