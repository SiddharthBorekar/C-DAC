import java.util.concurrent.ForkJoinPool.ManagedBlocker;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebLocators {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[2]/input")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
		
		driver.manage().window().maximize();
		driver.switchTo().alert().getText();		
	}
}

//Full xpath   /html/body/div[2]/div[6]/form/div[1]/div/div[4]/center/input[1]

//Xpath        /html/body/div[2]/div[6]/form/div[1]/div/div[4]/center/input[1]


//username = iD 
//pass = Xpath
//
//login = name

//drag and drop 
//manage().window().maximize();
//Select by Visible Text();
//SelectbyIndex(3);