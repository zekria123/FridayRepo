package basics.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser {

	public static void main(String[] args) {
		
		
	// setup systemprotery for IE browser 
		
		System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
		
		
		//1. create Obj of Webdriver that references to InternetExplorerDriver()
		
		WebDriver driver = new InternetExplorerDriver();
		
		//2. Open Test environment http://tek-school.com/retail/
		driver.get("http://tek-school.com/retail/");
		
		//3. wait for 5 sec 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//4. Close the browser 
		//driver.close();
		driver.quit();
	

	}

}
