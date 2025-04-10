package handlings;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindowHandle {
	
WebDriver driver;
	
	@BeforeMethod
	
	public void setup(){
		
	driver=	new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
		
}
@Test	
 
public void multipleWindowHandleTest() throws InterruptedException{
	
driver.findElement(By.xpath("//img[contains(@src,'img/google-play.png')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
	
	
	Thread.sleep(2000);
}



@AfterMethod

public void teardown() throws InterruptedException {
	Thread.sleep(2000);
	driver.quit();
}

}
