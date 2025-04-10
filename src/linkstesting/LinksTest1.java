package linkstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTest1 {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=	new ChromeDriver();
			Thread.sleep(1000);
			
		driver.get("https://adactinhotelapp.com/");
        Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
				
       System.out.println(driver.findElement(By.linkText("Forgot Password?")).isDisplayed());     
       Thread.sleep(1000);
       
       driver.findElement(By.linkText("Forgot Password?")).click();
       Thread.sleep(1000);
       
      System.out.println(driver.getTitle());
      
      System.out.println(driver.findElement(By.linkText("Go back to Login page")).isDisplayed());     
      Thread.sleep(1000);
      
      driver.findElement(By.linkText("Go back to Login page")).click();
      Thread.sleep(1000);
      
      System.out.println(driver.getTitle());
      
      driver.quit();
	}

}
