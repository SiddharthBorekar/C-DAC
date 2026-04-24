package dsa_stack;

import java.util.Scanner;

public class DsaStack {
	public static void main(String[] args) {
		int num;
		char ch;

		IntStack st = new IntStack(5);
		Scanner s = new Scanner(System.in);

		do {
			System.out.println("Enter Choice ");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. Exit");
			ch = s.next().charAt(0);

			switch (ch) {
			case '1':
				System.out.println("Enter Number to Push :");
				num = s.nextInt();
				st.push(num);
				break;
			case '2':
				int n = st.pop();
				if (n != -999) {
					System.out.println("element removed " + n);
				}
				else {
					System.out.println("Stack kis Empty!!!");
				}
				break;

			case '3':
				System.out.println(st.peek()+ "is Peak Element ");
				break;
			case '4':
				break;

			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}

		} while (ch != '4');
		s.close();

	}
}
