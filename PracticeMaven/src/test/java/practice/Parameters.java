package practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameters {

	@Test
	public void m1()
	{
		WebDriver driver = null;
		//fetching parameters from Maven
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		
		if(BROWSER.equalsIgnoreCase("edge"))			
				{
					WebDriverManager.edgedriver().setup();
					driver = new EdgeDriver();
				}
		else if(BROWSER.equalsIgnoreCase("chrome"))		
				{
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
				}
		else if(BROWSER.equalsIgnoreCase("firefox"))		
				{
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
				}
		else
				{
					driver = new EdgeDriver();		
				}
		
		driver.get(URL);
	}
}
