package deserialization;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import serialization.Student;
public class Test1 {
	public static void main(String[] args)throws IOException, ClassNotFoundException ,FileNotFoundException{
		ObjectInputStream oin = new ObjectInputStream(new FileInputStream("Test.txt"));
		Student s1 = (Student)oin.readObject();
		System.out.println(s1);
	}
}