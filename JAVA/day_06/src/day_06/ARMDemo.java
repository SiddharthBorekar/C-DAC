import java.io.*;
package day_06;
public class ARMDemo {
	public static void main(String[] args) throws IOException{
		try(FileOutputStream fos = new FileOutputStream("sidd");
			FileInputStream fis = new FileInputStream("abc.txt");
				)
		{
			//read and write
		}
		catch(Exception e) {
			//Todo: handle Exception
		}
	}
}
