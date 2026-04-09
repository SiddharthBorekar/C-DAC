public class Player {
	private String PlayerName;
	private String PlayerCountry;
	
	public Player() {
		//this ("Sachin");
		PlayerCountry = "India";
	}
	public Player (String PlayerName) {
		this();
		this.PlayerName = PlayerName;
	}
	public String toString() {
		return "Player [PlayerName = "+PlayerName+" "+PlayerCountry+"]";
	}
	
	
	public static void main(String[] args) {
		Player p = new Player("Virat");
		System.out.println(p);
	}
}