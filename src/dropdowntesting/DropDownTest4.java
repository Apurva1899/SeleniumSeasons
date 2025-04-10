package dropdowntesting;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=	new ChromeDriver();
		Thread.sleep(1000);
		
	driver.get("https://amazon.in/");
    Thread.sleep(1000);
	
	driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		
		List<WebElement> allItems=drop.findElements(By.tagName("option"));
		
		System.out.println("no of items "+allItems.size());
		
		for(WebElement temp:allItems) {
			System.out.println(temp.getText());
		}
		
		Iterator<WebElement> it=allItems.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().getText());
		}
		
	driver.quit();
	
	}

}
