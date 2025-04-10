package webdrivermethods;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverMethods4 {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {

		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://adactinhotelapp.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Forgot Password?")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		//driver.navigate().to("https://www.facebook.com/"); or
		URL obj=new URL("https://www.facebook.com/");
		driver.navigate().to(obj);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);


driver.quit();
       
		
	}

}
