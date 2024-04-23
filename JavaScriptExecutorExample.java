import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class JavaScriptExecutorExample {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Projects\\software\\chrome\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/index.php");
		driver.manage().window().maximize();
		
		//1. Firstly we need to create reference variable of javascript executor interface
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//2. In javascript executor interface we have 2 methods executeScript and executeAsyncScript
		
		driver.findElement(By.name("uid")).sendKeys("Pranjal@123");
		driver.findElement(By.name("password")).sendKeys("pandey1122");
		
		WebElement login = driver.findElement(By.name("btnLogin"));
		
		//we weill use below javascript to click on login button
		//js.executeScript("arguments[0].click();",login);
		
		// we will use below javascript to handle the alert
		//js.executeScript("alert(User or Password in not valid):");
		
		// we will use below script to get all the details of webpage like title domain, name
		
//		String domainName = js.executeScript("return document.domain;").toString();
//		System.out.println(domainName);
//		
//		String title = js.executeScript("return document.title;").toString();
//		System.out.println(title);
//		
//		String URL = js.executeScript("return document.URL;").toString();
//		System.out.println(URL);
//		
//		
//		// we will use below script to launch the new URL
//		js.executeScript("window.location='https://demo.guru99.com/test/facebook.html'");
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
