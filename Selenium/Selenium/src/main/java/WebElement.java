import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class WebElement {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Girish godbole");
//		driver.findElement(By.name("btnK")).click();   //Not intractrable beacouse of history
		driver.findElement(By.name("q")).sendKeys(Keys.ESCAPE);
//		driver.findElement(By.name("btnK")).click();
	}

}
