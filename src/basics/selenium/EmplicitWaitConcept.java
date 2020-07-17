package basics.selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class EmplicitWaitConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		

		
		driver.get("http://tek-school.com/real-estate/");
		
		//object of webDriverWait class
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		WebElement find = driver.findElement(By.xpath("//a[text(='find']"));
		wait.until(ExpectedConditions.elementToBeClickable(find));
		
		find.click();
		// Explicit waits we can use for single element can be 
		//elementToBeClickable
		//
		
		
	}

}
