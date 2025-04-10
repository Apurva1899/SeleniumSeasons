package linkstesting;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LinkTest4 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
	  //focus on make money with us
WebElement block=driver.findElement(By.xpath("//div[text()='Make Money with Us']/parent::div"));
	  
List<WebElement> allLinks=block.findElements(By.tagName("a"));
	
	
	for(int i=0;i<allLinks.size();i++)
	{
		System.out.println(allLinks.get(i).getText());
		allLinks.get(i).click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		System.out.println("--------------------------------");
		driver.navigate().back();
	}

driver.quit();
	}

}
