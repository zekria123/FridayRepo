package basics.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FFbrowser {

	public static void main(String[] args) {
		
		
	//	Firfox browser is default browser of selenium we do not need to set system.setproperty
		
		System.setProperty("webdriver.geckodriver.driver", "C:\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		// It will open Test Environment Website.
        driver.get("http://tek-school.com/retail/");
        
        // Store website title in a string and string name is  title
        String title = driver.getTitle();
        
        System.out.println("website title is " + title);
        
        driver.quit();
	}

}
