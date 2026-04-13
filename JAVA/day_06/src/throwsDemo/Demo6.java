package throwsDemo;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo6 {
	public static void main(String[] args) throws IOException {

		FileInputStream fi = null;

		try {
			fi = new FileInputStream("abc.txt");
			int i = 0;
			while ((i = fi.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
//			System.out.println("\n Release Resource");
			fi.close();
		}

	}

}