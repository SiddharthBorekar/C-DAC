package assign_3;

import java.util.Scanner;

public class TransposeMatrix {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] m1 = new int[3][3];
		System.out.println("Enter Matrix[3x3] Elements");
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				m1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix: ");
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				System.out.print(m1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Transpose Of Matrix: ");
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				System.out.print(m1[j][i] + " ");
			}
			System.out.println();
		}
		sc.close();

	}

}