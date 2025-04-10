package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods2 {

	public static void main(String[] args) throws InterruptedException {

	WebDriver driver=	new ChromeDriver();
		Thread.sleep(1000);
		
		driver.get("https://adactinhotelapp.com/");
        Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
				
	    driver.findElement(By.id("login")).click();
		Thread.sleep(1000);
		
System.out.println( driver.findElement(By.id("username_span")).getAttribute("class"));
System.out.println( driver.findElement(By.id("username_span")).getAttribute("name"));
System.out.println( driver.findElement(By.id("username_span")).getCssValue("font-size"));
System.out.println( driver.findElement(By.id("username_span")).getCssValue("color"));
System.out.println( driver.findElement(By.id("username_span")).getText());


Thread.sleep(1000);
		
		driver.quit();
	}

}
