package basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		
		// create obj of webdriver that instantiates ChromeBrowser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		// now driver.get  to get us to the website address.
		// or driver.navigate.to  get us to website address.
		// both do the same job.
		
		driver.get("http://tek-school.com/retail/");
		
		Thread.sleep(500);
		
		driver.get("http://tek-school.com/retail/");
		
		Thread.sleep(500);
		
		driver.navigate().back();
		Thread.sleep(500);
		
		driver.navigate().forward();
		 Thread.sleep(500);
		 driver.close();
		
		

	}

}
