import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodPractical {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//This method will help you to set the browser path which we need to use to run the automation script
		
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Projects\\software\\chrome\\chromedriver.exe");
		
		// to create chromedriver object we need to create webdriver interface reference variable and need to 
		//create object for browser
		
		WebDriver driver  = new ChromeDriver();
		
		//1. get()- this method will help you to open the any URL
		
		driver.get("https://www.amazon.in/");
		
		// 2: .close()- This method is used to close the opened URL
		//driver.close();
				
		//3: .getTitle()- This is use to get title of the website
				
		String title = driver.getTitle();
		System.out.println(title);
				
		//4: .getCurrentURL():- To get the current opened URL details
				
		String url = driver.getCurrentUrl();
		System.out.println(url);
				
		//5:- .getPageSource to get the source code
				
		String source = driver.getPageSource();
		System.out.println(source);
				
		//6:- driver.quit:- To close all the opened window 
		driver.quit();
		

	}

}
