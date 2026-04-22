package assign_4;

public class TwoBhk extends OneBhk {

	

	private double roomArea2;

	public TwoBhk() {

	}

	public TwoBhk(double roomArea2, double roomArea, double hallArea, double price) {
		super(roomArea, hallArea, price);
		this.roomArea2 = roomArea2;
	}

	@Override
	public void show() {
		System.out.println("2BHK Details: ");
		super.show();
		System.out.println("RoomArea2: " + roomArea2);
	}
	@Override
	public String toString() {
		
		return super.toString() + "TwoBHK [roomArea2=" + roomArea2 + "]";
	}

}