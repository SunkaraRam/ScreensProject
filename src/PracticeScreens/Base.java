package PracticeScreens;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;
	
	public static void initialization() {
		
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://google.com");
	}
	
	public void failed(String testMethodName){
		
		try {
		
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(src, new File("D:\\ScreensProject\\ScreenShots\\"+testMethodName+"_"+".jpg"));
		
			} 
		catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
	}
	
	
	
}
