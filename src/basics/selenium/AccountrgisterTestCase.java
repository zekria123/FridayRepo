package basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountrgisterTestCase {

	public static void main(String[] args) {
		
		
		// set basic system property for chrome
				// set pageload to 30
				// set implicit wait to 30
				// set windows to maximize
				// open test environment
				// open register form   15 min to write the code
				//=-------------------------------
				// check if Yes radio button is not selected  return false
				// click on Yes radio button j
				// verify yes radio button is selected
				// verify privacy policy is displayed
				// verify Continue button is enabled
		
		// check if Yes radio button is not selected  return false
				// click on Yes radio button j
				// verify yes radio button is selected
				// verify privacy policy is displayed
				// verify Continue button is enabled.

		System.setProperty("WebDriver.chrome.driver", "c:\\ChromDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		
	}

}
