package practice;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ActiTimeApplicationTest {

	@Test
	public void actiTimeApplication()
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/"); 
	}
}

