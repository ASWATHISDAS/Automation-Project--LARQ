package Page_LARQ;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P_5Bill_LARQ {

WebDriver driver;
	
	@FindBy(id="ccNumber")
	WebElement CardNo;
	
	@FindBy(id="ccExpiry")
	WebElement Exp;
	
	@FindBy(id="ccName")
	WebElement CardName;
	
	@FindBy(id="ccCvv")
	WebElement Cvv;
	
	@FindBy(id="checkout-payment-continue")
	WebElement PlaceOrdr;
		
	@FindBy(xpath="//*[@id=\"main-content\"]/div[1]/div[2]/div/nav/ul/button")
	WebElement SignOut;
	
	@FindBy(xpath="//*[@id=\"__next\"]/section[1]/div/div/section/div[1]/div/div[4]/nav/ul/li[3]")
	WebElement SignIcon;
	
	
	public P_5Bill_LARQ(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	

	public void BillValues(String cardno,String exp,String cardname,String cvv) {
		CardNo.sendKeys(cardno);
		Exp.sendKeys(exp);
		CardName.sendKeys(cardname);
		Cvv.sendKeys(cvv);
	}
	
	public void PlaceOrder() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,5000)", "");
		Thread.sleep(3000);
		PlaceOrdr.click();
		}
	
	public void SignOut() {
		SignIcon.click();
		
		SignOut.click();
	}
}
