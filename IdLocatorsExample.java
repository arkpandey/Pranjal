import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocatorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Projects\\software\\chrome\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
				
		driver.get("https://demo.guru99.com/test/facebook.html");
		// To find the element by using id locators firstly we need to create reference variable of weblement interfaceand need to use below method
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.id("u_0_b"));
		WebElement keep_me_login = driver.findElement(By.id("persist_box"));
		
		//sendKeys method is used to enter the value in textbox
		username.sendKeys("Pranjal101@gmail.com");
		password.sendKeys("Pranjal@123");
		
		//click method is used to click on any button,radio button, checkbox or link
		login.click();
		keep_me_login.click();
		
		
		

	}

}
