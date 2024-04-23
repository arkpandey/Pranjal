import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathExample {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "F:\\Automation Projects\\software\\chrome\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		//1. Using simple xpath method by using tag and attributes only 
		
//		WebElement un = driver.findElement(By.xpath("//input[@id='email']"));
//		
//		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
//		
//		WebElement login = driver.findElement(By.xpath("//input[@value='Log In']"));
		
	
		//2. Using AND conditions
		
//		WebElement un = driver.findElement(By.xpath("//input[@id = 'email' and @class = 'inputtext']"));
//		WebElement pass = driver.findElement(By.xpath("//input[@id = 'pass' and @tabindex = '2']"));
//		WebElement login = driver.findElement(By.xpath("//input[@value = 'Log In' and @type = 'submit']"));
//		
//		un.sendKeys("Pranjal@123");
//		pass.sendKeys("pranjal@1");
//		login.click();
		
		
		//3. Using OR condition 
		
//		WebElement un = driver.findElement(By.xpath("//input[@id = 'email' or @class = 'inputtext']"));
//		WebElement pass = driver.findElement(By.xpath("//input[@id = 'pass' or @tabindex = '2']"));
//		WebElement login = driver.findElement(By.xpath("//input[@value = 'Log In' or @type = 'submit']"));
		
		
		//4. Using the Contains method
		
//		WebElement un = driver.findElement(By.xpath("//input[contains(@name, 'ma')]"));
//		WebElement pass = driver.findElement(By.xpath("//input[contains(@type, 'ass')]"));
//		WebElement login = driver.findElement(By.xpath("//input[contains(@type, 'mit')]"));
//		
//		un.sendKeys("Pranjal@123");
//		pass.sendKeys("pranjal@1");
//		login.click();
//		
		//5. Using the Starts-With method 
		
//		WebElement un = driver.findElement(By.xpath("//input[starts-with(@id, 'em')]"));
//		WebElement pass = driver.findElement(By.xpath("//input[starts-with(@id, 'pa')]"));
//		WebElement login = driver.findElement(By.xpath("//input[starts-with(@type, 'su')]"));
		
		//6. Using the Text method
		
		WebElement link = driver.findElement(By.xpath("//*[text()='Agile Project']"));
		link.click();
		
	
		
		
		
		

	}

}
