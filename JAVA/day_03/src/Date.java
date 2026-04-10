
public class Date {
	public int day;
	public int month;
	public int year;
	
	public Date () {
		System.out.println("This is Default Constructor :");
	}
	Date(int dd,int mm,int yy) {
		this.day = dd;
		this.month = mm;
		this.year = yy;
	}
	public String toString() { 
		return "Date [dd = "+day+","+month+","+year+"]";
	}
	public static void main(String[] args) {
		Date d = new Date(9,4,2026);
		System.out.println(d);
	}
}