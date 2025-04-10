package dropdowntesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownTest1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=	new ChromeDriver();
		Thread.sleep(1000);
		
	driver.get("https://amazon.in/");
    Thread.sleep(1000);
	
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	driver.findElement(By.id("searchDropdownBox")).sendKeys("books");
	Thread.sleep(1000);
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("harry potter");
	Thread.sleep(1000);
	
	driver.findElement(By.id("nav-search-submit-button")).click();
	Thread.sleep(1000);
	
	System.out.println(driver.getTitle());
	
	driver.quit();
	
	}

}
