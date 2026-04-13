package pattern;

public class AdvancePattern {
	public static void main(String[] args) {
		//Butterfly Pattern
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
