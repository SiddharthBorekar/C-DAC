package assign_4;

public class OneBhk {
	private double roomArea;
	private double hallArea;
	private double price;

	public OneBhk() {

	}

	public OneBhk(double roomArea, double hallArea, double price) {
		super();
		this.roomArea = roomArea;
		this.hallArea = hallArea;
		this.price = price;
	}
	
	public double getPrice()
	{
		return price;
	}

	public void show() {
		System.out.println("RoomArea1: " + roomArea + " HallArea: " + hallArea + " Price:" + price);
	}

	@Override
	public String toString() {
		return "OneBHK [roomArea=" + roomArea + ", hallArea=" + hallArea + ", price=" + price + "]";
	}
	

}