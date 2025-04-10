package dropdowntesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		
		driver.get("https://facebook.com/");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("day"));
		Thread.sleep(1000);
		
		new Select(driver.findElement(By.id("day"))).selectByIndex(1);
		Thread.sleep(1000);
				
		new Select(driver.findElement(By.id("month"))).selectByIndex(9);
		Thread.sleep(1000);
		
		new Select(driver.findElement(By.id("year"))).selectByIndex(25);
		Thread.sleep(1000);
		
		driver.quit();
		
		
	}

}
