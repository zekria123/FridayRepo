package basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeHeadLessBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. set system property for Chrome browser
				System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
				
				ChromeOptions options = new ChromeOptions();
			
				options.addArguments("headLess");
				
				WebDriver driver = new ChromeDriver();
				// implicit wait for 30 seconds
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//4.  maximize browser 
				driver.manage().window().maximize();
				
				//2. open canvas page https://canvas.instructure.com/login/canvas
				driver.get("https://canvas.instructure.com/login/canvas");
				System.out.println(driver.getTitle());
				
				
				
			
				// To find Web Element in UI page we will use .findElement() method 
				
				WebElement email = driver.findElement(By.id("pseudonym_session_unique_id"));
				
				// find Webelment for password with using ID for locator
				
				WebElement password = driver.findElement(By.id("pseudonym_session_password"));
				
				// find Webelment for Login button with using ID for locator
				WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div[2]/button"));
				
				
				// to send a value we will use sendKeys method 
				// to click on a button or element we will use .click method
				
				// sends email value
				email.sendKeys("student@tekschool.us");
				// sends password value
				password.sendKeys("i am not sharing my password");
				
				
				
				
				// clicks on login button 
				loginButton.click();
				
	}

}
