public class MyDate {
	private int dd;
	private int mm;  //data members
	private int yy;
	//Constructor public
//	public MyDate() {
//		dd = 54;
//	}
	public void initDate(){
		dd=mm=yy=1;
	}
	public void setDate(int d,int m,int y){
		dd = d;
		mm = m;
		yy = y;
	}
	public void displayDate() {
		System.out.println("Date = ["+dd+"/"+mm+"/"+yy+"]");
	}
	public static void main(String[] args){
		MyDate d;
		d = new MyDate();
//		System.out.println(d.dd+"/"+ d.mm+"/"+ d.yy);
		d.initDate();
		d.displayDate();
		//d.setDate(8, 5, 2026);
		//d.displayDate();
		MyDate d1 = new MyDate();
		d1.dd = 8;
	}
}