package utilities;

import org.openqa.selenium.chrome.ChromeOptions;

public class MyUtilities {
	
	
	public static ChromeOptions setupChromeOptions() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		return options;
		
	}

}
