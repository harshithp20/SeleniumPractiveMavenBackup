package practice;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class AmazonHomepage {

	@Test
	public void amazonHomepage()
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/"); 
	}
}

