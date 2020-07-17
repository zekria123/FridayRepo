package basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeDay3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://tek-school.com/hotel/");
		String outputPath1 = "C:\\Users\\ardcs\\eclipse-workspace\\selenium\\output\\";
		ScreenShotUtility.screenShot(driver, outputPath1, "TestEnvPic1");
		WebElement signin = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[7]/ul/li/a"));
		signin.click();
		Thread.sleep(5000);
		String outputPath2 = "C:\\Users\\ardcs\\eclipse-workspace\\selenium\\output\\";
		ScreenShotUtility.screenShot(driver, outputPath2, "TestEnvPic2");
		WebElement enteremail = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		enteremail.sendKeys("emal.ramin.dawlatzai@gmail.com");
		WebElement password = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
		password.sendKeys("EMALkhan@25");
		WebElement login = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
		login.click();
		String outputPath3 = "C:\\Users\\ardcs\\eclipse-workspace\\selenium\\output\\";
		ScreenShotUtility.screenShot(driver, outputPath3, "TestEnvPic3");
		driver.quit();

	}

}
