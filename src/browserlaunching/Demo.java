package browserlaunching;


import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo {

	public static void main(String[] args) {

		System.out.println("enter browser to be launched:");
		Scanner input=new Scanner(System.in);
		String browserName=input.nextLine();
		WebDriver driver;
		 
		 switch(browserName) {
		 
		 case "chrome":
			 new ChromeDriver();
			 break;
			 
		 case "firefox":
			 new FirefoxDriver();
			 break;
			 
		 case "edge":
			 new EdgeDriver();
			 
			 default: System.out.println("invalid");
		 
		 }
		 
		System.out.println(browserName);
	}

}
