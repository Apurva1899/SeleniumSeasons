package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {

	WebDriver driver=	new ChromeDriver();
		Thread.sleep(1000);
		
		driver.get("https://adactinhotelapp.com/");
        Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
				
        System.out.println(driver.getTitle());
        Thread.sleep(1000);
        
        driver.findElement(By.className("login_register")).click();
		Thread.sleep(2000);
        
        driver.findElement(By.id("register_form")).submit();
        Thread.sleep(2000);
        
        System.out.println(driver.getTitle());
        Thread.sleep(1000);
		
		driver.quit();
	}

}
