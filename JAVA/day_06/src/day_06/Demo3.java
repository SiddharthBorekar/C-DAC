package day_06;

public class Demo3 {
	public static void main(String[] args) {
		int a,b,c = 0;
		try {
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			c = a / b;
			System.out.println("C = "+c);
			
		}catch(Exception e) {
			if(e instanceof ArithmeticException) {
				System.err.println(e.getMessage());
			}else if(e instanceof NumberFormatException) {
				System.out.println(e);
			}else if(e instanceof ArrayIndexOutOfBoundsException) {
				e.printStackTrace();
			}else {
				System.out.println("error");
			}
		}
	}
}
