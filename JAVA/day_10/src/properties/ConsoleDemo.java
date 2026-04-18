
package properties;
import java.io.Console;

/**
 * 
 * @author Sidd
 */
public class ConsoleDemo {
	public static void main(String[] args) {
		Console console = System.console();
		System.out.println("Enter username");
		
		String user = console.readLine();
		System.out.println("username :"+user);
		System.out.println("Enter password : ");
		char ch[] = console.readPassword();
		String pwd = String.valueOf(ch);
		System.out.println("Password : "+pwd);
	}
}
