package basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
	 // 1. Set system property for chrome browser 
		// 2. We need to use Webdriver Interface to lunch chrome Browser
		// 3. manage driver: open browser in full screen
		// driver.manage().window().fullscreen();
		// 4. pageload time out : wait for 10 seconds before throwing timeout exception
				// (pageload)
		// 5.Implicit Time Wait: what is Implicit Time Wait?
				// Implicit wait applies for entire execution time before driver throws an
				// error.
		// 6. lunch Chrome Browser to navigate to http://tek-school.com/retail/
				// .get method is used to lunch a website
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
        
	//	driver.manage().window().fullscreen();
		
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
		driver.get("http://tek-school.com/retail/");
		
		String siteTitle = driver.getTitle();
		
		System.out.println(siteTitle);
		Thread.sleep(5000);
		driver.close();
		driver.quit();


	}

}
