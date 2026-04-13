package day_06;

public class MyException extends Exception{
	@Override
	public String toString() {
		return "Sidd occurred!!";
	}
	public String msg(String str) {
		return str;
	}
//	public static void main(String[] args) {
//		MyException my = new MyException();
//		System.out.println(my);
//		
//	}
}
