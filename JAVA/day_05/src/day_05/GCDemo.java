package day_05;

public class GCDemo extends Object{
	@Override
	protected void finalize() throws Throwable{
		super.finalize();
		System.out.println("Object garbage Collected");
	}
	public static void main(String[] args) {
		GCDemo g1 = new GCDemo();
		GCDemo g2 = new GCDemo();
		GCDemo g3 = new GCDemo();

		g1 = null;
		g2 = null;
		g3 = null;
		System.gc();
	}
}