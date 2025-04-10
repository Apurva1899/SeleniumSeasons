package micellenousactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RightClick {

WebDriver driver;
	
	@BeforeMethod
	
	public void setup(){
		
	driver=	new ChromeDriver();
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	driver.manage().window().maximize();
		
}
@Test	
 
public void rightClick() throws InterruptedException{
	
	Actions action=new Actions(driver);
	
	action.contextClick(driver.findElement(By.xpath("//span[text()='right click me']")))
	.keyDown(Keys.DOWN).pause(2000)
	.keyDown(Keys.DOWN).pause(2000)
	.keyDown(Keys.DOWN).pause(2000)
	.keyDown(Keys.ENTER).pause(2000).build().perform();
	
	Thread.sleep(2000);
}



@AfterMethod

public void teardown() throws InterruptedException {
	Thread.sleep(2000);
	driver.quit();
}
	
}
