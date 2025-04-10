package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods1 {

	public static void main(String[] args) throws InterruptedException {

	WebDriver driver=	new ChromeDriver();
		Thread.sleep(1000);
		
		driver.get("https://adactinhotelapp.com/");
        Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
	//WebElement usernameText =driver.findElement(By.id("username"));
	//usernameText.sendKeys("Appu535");
		
		driver.findElement(By.id("username")).sendKeys("apurva18");
		Thread.sleep(1000);
		
		driver.findElement(By.name("password")).sendKeys("Apurva@18");
		Thread.sleep(1000);
		
	    driver.findElement(By.id("login")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("datepick_in")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("datepick_in")).sendKeys("16/02/2025");
		Thread.sleep(1000);
		
		driver.quit();
	}

}
