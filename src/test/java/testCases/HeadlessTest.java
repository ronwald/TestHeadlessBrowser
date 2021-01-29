package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import utilities.MyUtilities;

public class HeadlessTest extends MyUtilities{
	
	Logger log = LoggerFactory.getLogger(HeadlessTest.class);

	 @Test
	public void HeadlessChromeDriverTest() throws IOException {
	
		 System.setProperty("webdriver.chrome.driver", "C:/Chrome Driver/chromedriver.exe");	 
		 WebDriver driver = new ChromeDriver(setupChromeOptions());
		 driver.navigate().to("https://www.avenuecode.com/");
		 
		 String pageTitle = driver.getTitle();
		 log.info("Page opened: {}", pageTitle);
		  
		 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 //copying the file into /screenshots directory
		 FileUtils.copyFile(scrFile, new File("output/screenshots/homepage.png"));
		 
		 Assert.assertTrue(pageTitle.contains("Avenue Code"));
		 log.info("Quitting driver");
		 driver.quit();
		 
		 String test = "test";
	}
	 

	
	

}
