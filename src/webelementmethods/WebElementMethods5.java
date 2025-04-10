package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods5 {

	public static void main(String[] args) throws InterruptedException {

	WebDriver driver=	new ChromeDriver();
		Thread.sleep(1000);
		
		driver.get("https://facebook.com/");
        Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
				
        System.out.println(driver.getTitle());
        Thread.sleep(1000);
        
        driver.findElement(By.className("_9vtf")).submit();
        Thread.sleep(1000);
        
        System.out.println(driver.getTitle());
        Thread.sleep(1000);
		
		driver.quit();
	}

}
