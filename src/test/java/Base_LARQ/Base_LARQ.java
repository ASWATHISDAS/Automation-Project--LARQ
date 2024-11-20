package Base_LARQ;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base_LARQ {

public static WebDriver driver;
	
	@BeforeTest
	public void Browser_Setup() {
		driver=new ChromeDriver();
		driver.get("https://www.livelarq.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}
	
	@AfterTest
	public void Post_Condition() {
		
	}
}
