package practice;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonHomepageTest {

	@Test
	public void amazonHomepageTest()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/"); 
	}
}

