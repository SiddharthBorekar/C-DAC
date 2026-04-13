package exceptionDemo;
 

//this is compile time error 
//to avoid this kind of error we used Exception handling Keyword
public class Demo{                             
	public static void msg() {
		int no = 10/0;
		System.out.println("no = "+no);
	}
	public static void getMsg() {
		msg();	
	}
	public static void main(String[] args) {
		Demo d = new Demo();
		Demo.getMsg();
		System.out.println("End of program");
	}
}
