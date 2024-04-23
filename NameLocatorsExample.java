import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocatorsExample {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Projects\\software\\chrome\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		WebElement username = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.name("pass"));
		
		username.sendKeys("Pranjal101@gmail.com");
		password.sendKeys("Pranjal@123");
		
		

	}
}
