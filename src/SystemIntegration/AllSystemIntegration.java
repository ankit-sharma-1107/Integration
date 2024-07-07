package SystemIntegration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllSystemIntegration {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.id("userEmail")).sendKeys("sharma.aankit1124@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Testing@123");
		driver.findElement(By.id("login")).click();
	}

}
