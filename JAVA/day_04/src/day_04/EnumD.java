package day_04;

public class EnumD {
	public enum coffee{Small(60),Medium(75),Large(90);
		private int price;
		private coffee (int price)
		{
			this.price = price;
		}
		public int getprice()
		{
			return price;
		}
	}
	public static void main(String[] args) {
		coffee c = coffee.Medium;
		System.out.println(c+" Size of coffee cost is ==> "+c.getprice());
	}
	}
