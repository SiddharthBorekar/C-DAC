package day_06;

public class Demo2 {
	public static void main(String[] args) {
		int a,b,c = 0;
		try {
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			c = a / b;
			System.out.println("c ="+c);
		}catch(ArithmeticException e) {
			System.out.println("Denominatorshould  not be zero");
		}catch(NumberFormatException e) {
			System.out.println("Only integral Data");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter at least 2 values");
		}catch(Exception e) {
			System.out.println("Error");
		}
	}
}
