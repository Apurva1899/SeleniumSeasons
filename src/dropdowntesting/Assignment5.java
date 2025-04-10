package dropdowntesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=	new ChromeDriver();
			Thread.sleep(1000);
			
		driver.get("https://www.ebay.com/");
	    Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.id("gh-cat")).sendKeys("music");
		Thread.sleep(1000);
		
		driver.findElement(By.id("gh-ac")).sendKeys("cd player");
		Thread.sleep(1000);
		
		//driver.findElement(By.id("ui-id-23")).click();
		//Thread.sleep(1000);	
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		}

	

	}


