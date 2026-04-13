package day_06;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo5 {

	public static void main(String[] args) throws IOException {

//		FileOutputStream fos = new FileOutputStream("abc.txt", true);
//		FileOutputStream fos = new FileOutputStream("abc.txt");
		FileOutputStream fos = new FileOutputStream("abc.txt",true);
		fos.write(65);
		
		String str = "Hello World";
		byte []b = str.getBytes();
		fos.write(b);
		System.out.println("Success");
		fos.close();
	}
}