import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocatorsExample {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Projects\\software\\chrome\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		
		//CSS selector is known as dynamic web element
		//1. by using the tag name and class name in css selector
//		WebElement un = driver.findElement(By.cssSelector("input.inputtext"));
//		
//		//2. by using tag and id in css selector
//		WebElement pass = driver.findElement(By.cssSelector("input#pass"));
//		
//		un.sendKeys("pranjal001");
//		pass.sendKeys("pass@1234");
		
//		//3. by using tag and attributes in css selector
//		WebElement un = driver.findElement(By.cssSelector("input[type='text'][name='email']"));
//		
//		//4. by using tag, class and attributes in css selector
//		WebElement pass = driver.findElement(By.cssSelector("input.inputtext[type='password'][tabindex='2']"));
//		
//		un.sendKeys("pranjal@001");
//		pass.sendKeys("paresh@123");
//		
//		//5. by using tag,id and attributes in css selector
//		WebElement login = driver.findElement(By.cssSelector("input#u_0_b[type='submit'][value='Log In']"));
//		login.click();
//		
		//6. by using starts with - it will find th locators based on starting character
		WebElement un = driver.findElement(By.cssSelector("input[name^='ema']"));
		un.sendKeys("pranjal@123445");
		
		//7. by using ends with- it will find the locator based on ending character
		WebElement pass = driver.findElement(By.cssSelector("input[type$='word']"));
		pass.sendKeys("Pranjal@1");
		
		//8. by using the contains -it will find the locator based on character which is present or not 
		WebElement login = driver.findElement(By.cssSelector("input#u_0_b[type*='bm']"));
		login.click();
		
		
		
		
		
		
		
		

	}

}
