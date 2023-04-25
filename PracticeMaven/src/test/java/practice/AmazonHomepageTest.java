package practice;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class AmazonHomepageTest {

	@Test
	public void amazonHomepageTest()
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/"); 
	}
}

