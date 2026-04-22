//Create a Product class with: int pid, String name, double price. (5 Marks)
//Maintain a Map<Integer, Product> as the product catalog. (5 Marks)
//Allow the user to add products to a Cart (List<Product>). (5 Marks)
//Display the contents of the cart with total price. (5 Marks)
//Remove a product from the cart by ID. (5 Marks)
//Maintain the last 3 actions (add/remove) in a Stack and display the undo history.

package assign_7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ProductMain {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		Map<Integer,Product> p = new HashMap<Integer,Product>();
		p.put(1, new Product(1, "ChocoLava", 120));
		p.put(2, new Product(2, "Cake", 150));
		p.put(3, new Product(3, "Kur-kure", 10));
		p.put(4, new Product(4, "Chips", 20));
		p.put(5, new Product(5, "Puff", 25));
		p.put(6, new Product(6, "Samosa", 20));
		p.put(7, new Product(7, "Wada", 50));
		p.put(8, new Product(8, "Dahiwada", 40));
		p.put(9, new Product(9, "PaperBoat", 10));
		p.put(10, new Product(10, "Appy", 20));
		System.out.println(p);
		
		System.out.println("How many products do you want to add: ");
		int pl = s.nextInt();
		List<Product> list = new ArrayList<Product>();
		
		for (int i=0;i<pl;i++) 
		{
			System.out.println("Enter Product Id to add Product in to Cart: ");
			int pdId = s.nextInt();
			if (p.containsKey(pdId)) {
				Product data = p.get(pdId);
				list.add(data);
				System.out.println("Product added to cart.");
			} else {
				System.out.println("Not a valid Id");
			}
		}
		System.out.println(list);
		double total = list.stream().map(x -> x.getPrice()).reduce(Double::sum).get();
		System.out.println(total);
		
		while(true) {
			System.out.println("Enter a Product Id that you want to remove[press 0 to exit]: ");
			int rmId = s.nextInt();
			
			if(rmId == 0) {
				System.out.println("Exit Successfully");
				break;
			}
			if (list.removeIf(r -> rmId == r.getPid())) {
				System.out.println("Item is removed");
				list.stream().forEach(System.out::println);
			}else {
				System.out.println("Enter a valid id");
			}
		}
	}
	
}
