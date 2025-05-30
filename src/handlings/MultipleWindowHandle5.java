package handlings;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Utils;


public class MultipleWindowHandle5 extends Utils {
	
WebDriver driver;
	
	@BeforeMethod
	
	public void setup(){
		
	driver=	new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
		
}

@Test

public void multipleWindowHandleTest() throws InterruptedException{
	
	//first capture home window id 
	String homeWindowId=driver.getWindowHandle();
	
	driver.findElement(By.xpath("//img[contains(@src,'google-play')]")).click();
	
	Utils.switchToWindow(driver,"not found");
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
	
	driver.findElement(By.xpath("//input[@value='Search']")).click();
	Thread.sleep(2000);
	
	//switch to home window 
	
	driver.switchTo().window(homeWindowId);
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//img[contains(@src,'ios')]")).click();
	Utils.switchToWindow(driver,"TestFlight - Apple");
	

	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[text()='Terms of Service']")).click();
	
	Thread.sleep(2000);
	
	driver.switchTo().window(homeWindowId);
	
	Thread.sleep(2000);
	
	Utils.switchToWindow(driver,"Legal - Apple Media Services - Apple");
	
	driver.findElement(By.xpath("//a[text()='Choose your country/region']")).click();
	
	Thread.sleep(2000);
	
	driver.switchTo().window(homeWindowId);
	
	
	
}
	
	
	
	
@AfterMethod

public void teardown() throws InterruptedException {
	Thread.sleep(2000);
	driver.quit();
}

}
