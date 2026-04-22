package assign_3;

import java.util.Scanner;

public class ProductMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product[] pro = new Product[2];
		for (int i = 0; i < pro.length; i++) {
			System.out.println("Enter product details: ");
			System.out.println("Enter product pid: ");
			int pid = sc.nextInt();
			System.out.println("Enter product price: ");
			float p = sc.nextFloat();
			System.out.println("Enter product quantity: ");
			int q = sc.nextInt();
			pro[i] = new Product(pid, p, q);
		}
		System.out.println("Display All product Information: ");
		for (Product p: pro) {
			System.out.print(p);
		}
		System.out.println();
		int maxPid = pro[0].getPid();
		float maxPrice = pro[0].getPrice();
		
		for(int i = 0; i < pro.length;i++)
		{
			if(pro[i].getPrice() > maxPrice)
			{
				maxPrice = pro[i].getPrice();
				maxPid = pro[i].getPid();
			}
		}
		System.out.println("\nPID of the product with the highest price: "+maxPid);
		System.out.println("\nTotal amount spent on all products.: "+Product2.totalAmt(pro));
		sc.close();
	}

}