package lambda;
@FunctionalInterface
public interface HelloWorldInterface {
	
		int no = 100;
		public String sayhello();
		public static void getNo(){
			System.out.println("no = "+no);
		}
		public default void get() {
			System.out.println("hava 8 default method");
		}
	}
