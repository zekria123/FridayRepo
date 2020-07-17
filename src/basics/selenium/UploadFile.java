package basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		String url = "http://xndev.com/display-image/";
		driver.get(url);
		
		// we need to find Locator of WebElement
		WebElement uploadFile = driver.findElement(By.xpath("//input[@type='file']"));
		String filePath = "C:\\Users\\SDET1\\Downloads\\download.jpg";
		// upload the file
		uploadFile.sendKeys(filePath);
		
		
		
		
		
	}

}
