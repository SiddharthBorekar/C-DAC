package day_05;

public abstract class Bank {
	public Bank() {
		System.out.println("Constructor");
	}
	public abstract float getROI(); 
	
	public void getMSG() {
		System.out.println("Hello");
	}
}
