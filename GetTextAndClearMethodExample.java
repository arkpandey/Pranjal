import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAndClearMethodExample {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Projects\\software\\chrome\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("Pranjal@12334");
		
		//to clear the populated text in textbox we need to use clear method
		username.clear();
		
		//to fetch the value of particular element we can use gettext method  
		WebElement text = driver.findElement(By.tagName("h1"));
		String value = text.getText();
		System.out.println(value);
		
		
		
		
		
		

	}

}
