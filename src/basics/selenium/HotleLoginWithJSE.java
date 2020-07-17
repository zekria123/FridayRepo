package basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotleLoginWithJSE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		String url = "http://tek-school.com/hotel/";
		
		driver.get(url);
		
		WebElement signIn = driver.findElement(By.xpath("//span[@class='hide_xs]"));
				
				JSUtility.clickElementWithJS( signIn,driver);
				
		JSUtility.sendKeysWithJS(driver, "email", " Test@test.com");
		JSUtility.sendKeysWithJS(driver, "password", "woringPassword");
		
		WebElement singnInButton = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
		
		JSUtility.clickElementWithJS( singnInButton,driver);
		

	}

}
