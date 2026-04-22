package assign_3;

public class Product2 {
	
	public static float totalAmt(Product[] pr)
	{
		float total =  0.00f;
		for(Product products : pr)
		{
			float amtSpent = products.getPrice() * products.getQuantity();
			total +=amtSpent;
		}
		return total;
	} 

}