package Unit_Testing_Tool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstProgram1global {

	WebDriver driver;
	@Test
	public void Collabera()
	{
		driver=new ChromeDriver();
		driver.get("https://collabera.com/");
		Reporter.log("Collabera home page is displayed");
		driver.quit();
	}
		
		@Test
		
		public void Infosys()
		{
			driver = new ChromeDriver();
			driver.get("https://www.infosys.com/");
			Reporter.log("Infosys home page is displayed");
			driver.quit();				
		}
		
        @Test
		
		public void Wipro()
		{
			driver = new ChromeDriver();
			driver.get("https://www.wipro.com/");
			Reporter.log("Wipro home page is displayed");
			driver.quit();				
		}
        
 @Test
		
		public void Infogain()
		{
			driver = new ChromeDriver();
			driver.get("https://www.infogain.com/");
			Reporter.log("Infogain home page is displayed");
			driver.quit();				
		}
 
 @Test
	
	public void Testyantra()
	{
		driver = new ChromeDriver();
		driver.get("https://www.testyantra.com/");
		Reporter.log("Test Yantra home page is displayed");
		driver.quit();				
	}

        
 }
	


