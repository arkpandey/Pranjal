import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScollUpAndDownExample {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Projects\\software\\chrome\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://moneyboats.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		// to scroll down the webpage we will use below method
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,500)");
		
		// to scroll up the webpage we will use below method
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-500)");
		
	
		

	}

}
