package basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelSignInTest {

	private static WebElement loginButton;
	private static WebDriver driver;
	private static String outputPath;

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("WebDriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();driver.get("http://tek-school.com/hotel/");
		System.out.println(driver.getTitle());String outputPath = "C:\\Users\\SDET1\\eclipse-workspace\\SeleniumProject.Feb2020\\output\\";
		// Take The screnshot
		ScreenShotUtility.screenShot(driver, outputPath, "HotelHomePage");
		// find the Sign In Element locator
		WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign in']"));
		// click on signin in home page
		signIn.click();
		try 
		{Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		// take screenshot for sign in page
		ScreenShotUtility.screenShot(driver, outputPath, "HotelSignInPage");
		WebElement userName = driver.findElement(By.id("email"));
		// send email
		userName.sendKeys("test@test.com");
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("wrongPassword");
		
		WebElement loginButton = driver.findElement(By.xpath("//*[@id='SubmitLogin']"));
		
		
		ScreenShotUtility.screenShot(driver, outputPath, "HotelSignInPageFailed");
		
		loginButton.click();
		
		driver.close();
		driver.quit();
		
		
	}
	

}
