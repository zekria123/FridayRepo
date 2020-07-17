package basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCnvacePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://canvas.instructure.com/login/canvas");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("pseudonym_session_unique_id"));
		
		WebElement password = driver.findElement(By.id("pseudonym_session_password"));
		
		WebElement loginButton =driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div[2]/button"));
		
		
		
	//	WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div[2]/button"));
		
		email.sendKeys("student@tekschool.us");
		password.sendKeys("i do not share my password");
		
		loginButton.click();
		
		String outputPath = "C:\\Users\\Owner\\eclipse-workspace\\SeleniumProject.Feb2020\\OutputScreenShots";
		
		ScreenShotUtility.screenShot(driver, outputPath, "Pic 1");
		
	//	driver.quit();
	}


}