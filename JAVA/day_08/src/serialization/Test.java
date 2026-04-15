package serialization;

//import java.io.*;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new  FileOutputStream ("Test.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Student s = new Student(1,"Sidd");
		oos.writeObject(s);
		System.out.println("Success");
		fos.close();
		oos.close();
	}
}
