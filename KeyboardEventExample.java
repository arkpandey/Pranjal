import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEventExample {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Projects\\software\\chrome\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://only-testing-blog.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement un = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		
		Actions action = new Actions(driver);
		//1. Keydown - it will press the key and does not release
		action.keyDown(un, Keys.SHIFT).sendKeys("paresh").perform();
		action.keyDown(pass,Keys.SHIFT).sendKeys("paresh").perform();
		
		action.keyDown(Keys.ENTER).perform();

		
		

	}

}
