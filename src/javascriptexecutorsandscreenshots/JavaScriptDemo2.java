package javascriptexecutorsandscreenshots;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptDemo2 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.pepperfry.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void dragAndDropTest() throws InterruptedException {
		Thread.sleep(5000);
		try {
		driver.findElement(By.xpath("//iframe[contains(@title,'notification-frame')]"));
		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
		driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']")).click();
		driver.switchTo().defaultContent();
		}
		
		catch(NoSuchElementException e){
			System.out.println(e.getMessage());
		}
		
		WebElement element=driver.findElement(By.xpath("//div[text()='Sell on Pepperfry']"));
		
		//down casting
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("Window.scrollBy(0,11000)");
		//js.executeScript("arguments[0].scrollIntoView(true);", element);
		js.executeScript("arguments[0].click();", element);
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//div[text()='Sell on Pepperfry']")).click();
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	

}
