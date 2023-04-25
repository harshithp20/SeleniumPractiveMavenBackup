package practice;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonHomepageTest {

	@Test
	public void amazonHomepageTest()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/"); 
	}
}

//Jenkins push
