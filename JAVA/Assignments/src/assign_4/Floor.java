package assign_4;

public class Floor {
	private double len;
	private double wid;
	public Floor(double len, double wid) {
		super();
		this.len = len;
		this.wid = wid;
	}
	
	public int totalTiles(Tile t)
	{
		double areaFloor = len * wid;
		double areaTile = t.getEdgeLen()*t.getEdgeLen();
		double tileInFloor = areaFloor / areaTile;
		
		return (int)tileInFloor;
	}
	
	@Override
	public String toString() {
		return "Floor [length=" + len + ", width=" + wid + "]";
	}

	public static void main(String[] args) {
		Floor f1 = new Floor(10, 5);
		Tile t1 = new Tile(2);
		System.out.println(t1);
		System.out.println(f1);
		System.out.println("The whole number of tiles needed to cover the floor completely: "+f1.totalTiles(t1));
	}

}