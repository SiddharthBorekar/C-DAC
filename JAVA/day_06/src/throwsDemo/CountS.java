
package throwsDemo;

import java.io.FileInputStream;
import java.io.IOException;

public class CountS {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fi = null;
		try {
			fi = new FileInputStream("abc.txt");
			int i = 0;
			int countS = 0; 
			while ((i = fi.read()) != -1) {
				System.out.print((char)i);
				if((char)i == 'S' || (char)i == 's')
				{
					countS++;
				}
			}
			System.out.println("\n Count of S character in file: "+countS);
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
//		System.out.println("\n Release Resource");
			fi.close();
		}
	}
}
