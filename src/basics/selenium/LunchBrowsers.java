package basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchBrowsers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	 // 1. Set system property for chrome browser 
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");

		// 2. We need to use Webdriver Interface to lunch chrome Browser

		WebDriver driver = new ChromeDriver();

		// manage driver: open browser in full screen
		// driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		// pageload time out : wait for 10 seconds before throwing timeout exception
		// (pageload)
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		// Implicit Time Wait: what is Implicit Time Wait?
		// Implicit wait applies for entire execution time before driver throws an
		// error.
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// lunch Chrome Browser to navigate to http://tek-school.com/retail/
		// .get method is used to lunch a website
		driver.get("http://tek-school.com/retail/");

		// get title page return a string and we can verify if we are in correct page.
		String siteTitle = driver.getTitle();

		System.out.println(siteTitle);

		// add a hard break
		Thread.sleep(5000);
		// close the browser
		// what is difference between driver.close and driver.quite?
		// driver.close : will close only one window which opened by webdriver
		driver.close();
		// driver.quite: will close all windows opened by webdriver
		driver.quit();

	}

}
