import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Projects\\software\\chrome\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");	
		
		//to click on single checkbox we need to find out the element and to click on it
		
		//WebElement checkbox1 = driver.findElement(By.id("checkbox1"));
		//checkbox1.click();
		
		
		//To select the single checkbox in single code we will use below method
//		if(checkbox1.isSelected())
//		{
//			System.out.println("Checkbox is selected by default");
//		}
//		else 
//		{
//			checkbox1.click();
//		}
		

		//To select the multiple checkbox in single code we will use below method
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@type='checkbox']"));
		int size = checkboxes.size();
		System.out.println(size);
		
		
		//if you have multiple element and you want to perform operation on specific index you can use this method
		//checkboxes.get(0).click();
//		
//		for (int i = 0;i <size;i++)
//		{
//			checkboxes.get(i).click();
//		}
//		
		

		for (int i = 0; i < size; i++)
		{
			// getAttribute method is used to fetch the value of element attributes as per given key
			String value = checkboxes.get(i).getAttribute("value");
			if (value.equalsIgnoreCase("cricket") )
			{
				checkboxes.get(i).click();
			}
			
		}
		
		
		
		
	}

}
