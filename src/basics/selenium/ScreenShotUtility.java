package basics.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

	// The below commends means that the below method can take three parameters . 1 driver , 2 location, 3 fileName. 
	
	/**
	 * *
	 * *
	 *
	 * @param drver
	 * @param location
	 * @param fileName
	 */
	public static void screenShot(WebDriver driver, String location, String fileName) {
		// Take Screenshot
		// Store Screenshot in a folder or location
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File(location + fileName + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception in execution");
			
		}
	}
}
