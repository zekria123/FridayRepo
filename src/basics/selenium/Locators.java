package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//By .id         =  fastest locator
		//By.name        
		//By.ClassNAme
		//By.Classlector
		//By.XEpath      =  xpath  is slow but you can travel from parent to child and child to parent and siblings.
		//By.LinkText
		
		
        //  Syntax for locator
		// webElement  elementname = driver.findElement(By.id("value of ID");
		
		// webElement  elementname = driver.findElement(By.name("value of name");
		
		// webElement  elementname = driver.findElement(By.className("value of class");
		
		// webElement  elementname = driver.findElement(By.ccsSelector("CcsSelector");
		
		// webElement  elementname = driver.findElement(By.Xpath("Xpath");
		
		// webElement  elementname = driver.findElement(By.linkText("value of ID");
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement usrname = driver.findElement(By.id("email"));		
		
	}

}
