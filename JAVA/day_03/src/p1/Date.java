package p1;
public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date () {
		System.out.println("This is Default Constructor :");
	}
	private Date(int dd,int mm,int yy) {
		this.day = dd;
		this.month = mm;
		this.year = yy;
	}
	public String toString() { 
		return "Date [dd = "+day+","+month+","+year+"]";
	}
	public static void swapDates(Date d1,Date d2) {
		System.out.println("in swapdayes ----> ");
		Date temp;
		temp = d1;
		d1 = d2;
		d2 = temp;
		System.out.println("d1 = "+d1);
		System.out.println("d2 = "+d2);
	}
	public static void main(String[] args){
		Date d1 = new Date(9,4,2026);
		Date d2 = new Date(4,5,2027);
		System.out.println("Before Swapping --->");
		System.out.println("d1 = "+d1);
		System.out.println("d1 = "+d2);
		Date.swapDates(d1,d2);
		System.out.println("After Swapping --->");
		System.out.println("d1 = "+d1);
		System.out.println("d1 = "+d2);
	}
}