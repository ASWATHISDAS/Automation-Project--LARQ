package Test_LARQ;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class T_6BrokenLinks_LARQ {

	ChromeDriver driver;
	String base_url="https://www.livelarq.com";
	
	@BeforeTest
	public void browserSetup() {
		driver=new ChromeDriver();
		driver.get(base_url);
		driver.manage().window().maximize();
	}
	
	@Test
	public void verify_blueline() throws IOException{
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int totallinks=links.size();
		System.out.println(totallinks);
		for(int i=0;i<totallinks;i++) {
			String hrefattval=links.get(i).getAttribute("href");
			System.out.println(hrefattval);
			if(hrefattval==null||hrefattval.isEmpty()) {
				System.out.println("THERE IS NO href VALUE");
				continue;
			}
			verify(hrefattval);	
		}
	}

	private void verify(String hrefattval) {
		// TODO Auto-generated method stub
		try {
			URL hreflink=new URL(hrefattval);
			HttpURLConnection con=(HttpURLConnection)hreflink.openConnection();
			
			if(con.getResponseCode()>=400) {
				System.out.println("Broken Link-->"+hreflink);
			}
			else {
				System.out.println("Valid Link-->"+hreflink);
			}
		}
		catch(Exception e) {
			
		}	
	}	
}
