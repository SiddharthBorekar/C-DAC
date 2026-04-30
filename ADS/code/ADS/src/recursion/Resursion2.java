package recursion;

public class Resursion2 {

	public static void fun1(int n) { // n = 5 4 3 2

		if (n == 0)
			return;
		System.out.println();
		starprint(n);

		fun1(n - 1);
	}

	public static void starprint(int n) {
		if (n == 0)
			return;
		System.out.print("*");
		starprint(n - 1);

	}

	public static void fun2(int n) {
		if (n == 0)
			return;

		starprint2(n);
		System.out.println();

		spaceprint(5 - n); // adjust spacing

		fun2(n - 1);
	}

	public static void starprint2(int n) {
		if (n == 0)
			return;
		System.out.print("*");
		starprint2(n - 1);
	}

	public static void spaceprint(int n) {
		if (n == 0)
			return;
		System.out.print(" ");
		spaceprint(n - 1);
	}

	public static int calfact(int n) {
		if(n == 1 || n == 0) {
			return 1;
		}
		int nm1 = calfact(n - 1);
		int factn = n * nm1;
		return factn;
	}
	
	public static void main(String[] ar) {
//		  fun1(5);
//		  System.out.println("\n The End.....");

//		fun2(4);
//		System.out.println("\n The End");
		int ans = calfact(5);
		System.out.println(ans);
//		System.out.println();
	}

}
