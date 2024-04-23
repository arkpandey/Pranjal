import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_IsSelected_IsDisplayed_IsEnable {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Projects\\software\\chrome\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		
		boolean result = username.isDisplayed();
		boolean result1 = username.isEnabled();
		System.out.println(result);
		System.out.println(result1);
		
		boolean result2 = password.isDisplayed();
		boolean result3 = password.isEnabled();
		System.out.println(result2);
		System.out.println(result3);
		
		// is displayed - method is used to validate element is present or not
		// is enabled - method id used to check elemet is enable or disabled
		
		if(username.isDisplayed() && username.isEnabled())
		{
			username.sendKeys("pranjal@001");
		}
		else
		{
			System.out.println("username is not displayed");
		}
		if(password.isDisplayed() && password.isEnabled())
		{
			password.sendKeys("pranjal");
		}
		else
		{
			System.out.println("password is not displayed");
		}
		
		
		// is selected - method is used to validate checkbox or radio button is alreday selected or not 
		WebElement checkbox = driver.findElement(By.id("persist_box"));
		
		boolean result4 = checkbox.isSelected();
		System.out.println(result4);
		

	}

}
