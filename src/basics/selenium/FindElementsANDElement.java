package basics.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsANDElement {

	public static void main(String[] args) {

		System.setProperty("WebDriver.chrome.driver", "C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		driver.get("http://tek-school.com/retail/");

		WebElement desktops = driver.findElement(By.xpath("//a[text()='Desktops']"));
		desktops.click();

		// Difference between driver.findElement and driver.findElements
		// FindElement
		// finds one element in UI
		// Return type is WebElement
		// Exception : No SuchElemnentFoundException

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size()); // how many links are present in this page

		for (int i = 0; i < allLinks.size(); i++) {

			String textOfElements = allLinks.get(i).getText();
			System.out.println(textOfElements);

			if (textOfElements.equals("Desktops")) {
				allLinks.get(i).click();
				break;

			}
			
		
			// findElements
			// finds many elements with same locator address or xpath or tag
			// Return type is ArrayList
			// if no element is found will return an empty list and dose not throws
			// exception.

			// lets take a screenShot

			String picOutPut = "C:\\Users\\Owner\\eclipse-workspace\\SeleniumProject.Feb2020\\OutputScreenShots";

			ScreenShotUtility.screenShot(driver, picOutPut, "TestEnvPic");

			driver.quit();
		}

	}

}
