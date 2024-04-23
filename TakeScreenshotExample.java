import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenshotExample {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Projects\\software\\chrome\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/index.php");
		driver.manage().window().maximize();
		
		//Firstly we are taking reference of TakesScreenshot interface
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		// calling getscreenshotAs method to create image
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		
		//Move the file into new destination folder
		File destFile = new File("F:\\Automation Projects\\ScreenShots\\error.png");
		
		//we will copy the screenshot into destination folder
		Files.copy(srcFile, destFile);
		
		
		
		


	}

}
