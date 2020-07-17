package basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		// implicit wait for 30 seconds
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//4.  maximize browser 
		driver.manage().window().maximize();
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		WebElement headerFrame = driver.findElement(By.xpath("//frame[@name='main']"));
		
		driver.switchTo().frame(headerFrame);
		
		WebElement header = driver.findElement(By.xpath("//h2[text()='Title bar']"));
		
		System.out.println(header.getText());
		
		driver.switchTo().defaultContent();
		
		WebElement bodyFrame = driver.findElement(By.xpath("//frame[@name='navbar']"));
		
		driver.switchTo().frame(bodyFrame);
		
		driver.findElement(By.xpath("//a[text(='Home']")).click();
		
		driver.switchTo().defaultContent();
		
		WebElement footer = driver.findElement(By.xpath("//frame[@name='bot']"));
		
		driver.switchTo().frame(footer);
		
		WebElement footer1 = driver.findElement(By.xpath("//h2[text()='Footer']"));
		
		System.out.println(footer1.getText());
		
		
		
		
		
		

		driver.close();
	}

}
