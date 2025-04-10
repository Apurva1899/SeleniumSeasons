package dropdowntesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=	new ChromeDriver();
		Thread.sleep(1000);
		
	driver.get("https://amazon.in/");
    Thread.sleep(1000);
	
	driver.manage().window().maximize();
		Thread.sleep(1000);

	//selectByIndex(int) ==> here int means index which starts from zero (not prefered)

	/*WebElement drop=driver.findElement(By.id("searchDropdownBox"));
	Select s1=new Select(drop);
	s1.selectByIndex(12);*/
		//or
		
		/*new Select(driver.findElement(By.id("searchDropdownBox"))).selectByIndex(12);
		Thread.sleep(5000);*/
		
		new Select(driver.findElement(By.id("searchDropdownBox"))).selectByVisibleText("Books");
		Thread.sleep(2000);
		
		

	driver.quit();
	
	}

}
