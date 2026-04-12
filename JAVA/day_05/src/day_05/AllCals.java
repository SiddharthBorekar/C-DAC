package day_05;

public class AllCals extends A implements StaticCal,CompareCal{
	@Override
	public void add(int a ,int b) {
		System.out.println("Add = "+(a+b));
	}
	@Override
	public void sub(int a ,int b) {
		System.out.println("Sub = "+(a-b));
	}
	@Override
	public int max(int a ,int b) {
		//System.out.println("Max = "+(a,b));
		return (a>b?a:b);
	}
	@Override
	public void avg(int a ,int b) {
		System.out.println("Add = "+(a+b)/2);
	}
	
	public static void main(String[] args) {
		AllCals a = new AllCals();
		a.add(10,20);
		a.sub(10,20);
		System.out.println(a.max(5,6));
		a.avg(10,20);
		System.out.println(ArithCal.no);
		
	}
}
