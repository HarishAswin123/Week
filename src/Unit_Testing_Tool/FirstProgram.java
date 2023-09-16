package Unit_Testing_Tool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstProgram {
	
	@Test

   public void swiggy()
		{
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.swiggy.com/");
			Reporter.log("Swiggy page is launched");
			driver.quit();
			
		}
	
	@Test
	
	public void zomato()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/");
		Reporter.log("Swiggy page is launched");
		driver.quit();
		
	}
	
	
	
		

	}


