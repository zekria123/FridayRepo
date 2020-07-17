package basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		driver.get("https://www.walmart.com/");
		Thread.sleep(1000);
		
		driver.get("https://tolonews.com/");
		
		System.out.println("___________________ page title using get method ______________________");
		
		String siteTitle = driver.getTitle();
		System.out.println(siteTitle);
		
		System.out.println("____________________ title validation by if statement ______________________");
		
		if(siteTitle.equals(siteTitle)) {
			System.out.println(siteTitle+ "\n" +"Test passed.");
		} else {
			System.out.println("Test failed");
		}
		
		System.out.println("________________________title validation by switch statement _______________________"); 
			
		switch(siteTitle) {
		case "Facebook - Log In or Sign Up":
			System.out.println(siteTitle+ "\n"+ "Page title is matching. Test passed ");
		break;
		case "":
			System.out.println("Page title is not matching. Test failed");
		 break;
		}
	 
		driver.navigate().to("https://www.bbc.com/");
		
		Thread.sleep(6000);
		
		driver.navigate().back();
		
		Thread.sleep(6000);
        driver.close();
        driver.quit();
	}

}
