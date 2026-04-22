package assign_4;

public class Tile {
	private double edgeLen;

	public Tile(double edgeLen) {
		super();
		this.edgeLen = edgeLen;
	}

	public void setEdgeLen(double edgeLen) {
		this.edgeLen = edgeLen;
	}
	
	public double getEdgeLen() {
		return edgeLen;
	}
	
	public String toString() {
		return "Tile [edgeLen=" + edgeLen + "]";
	}
	
}