public class Date {
	public int day;
	public int month;
	public int year;
	
	public void setDay(int d) {
		day = d;
	}
	public int getDay() {
		return day;
	}
	public void
	setMonth(int m) {
		month = m;
	}
	public int getMonth() {
		return month;
	}
	public void setYear(int y) {
		year = y;
	}
	public int getYear() {
		return year;
	}
	public static void main(String[] args) {
		Date d = new Date();
		
		d.setDay(6);
		System.out.println("Day = "+d.getDay());
		d.setMonth(8);
		System.out.println("Mpnth = "+d.getMonth());
		d.setYear(2026);
		System.out.println("Year = "+d.getYear());
		
		
//		int day = d.getDay();
//		System.out.println("Day = "+day);		
	}
}
