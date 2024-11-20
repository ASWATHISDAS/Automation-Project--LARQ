package Page_LARQ;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class P_4AddData_LARQ {

WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"addressToggle\"]")
	WebElement Arrow;
	
	@FindBy(xpath="//*[@id=\"addressDropdown\"]/li[1]/a")
	WebElement Enter;
	
	@FindBy(name="shippingAddress.firstName")
	WebElement Fname;
	
	@FindBy(name="shippingAddress.lastName")
	WebElement Lname;
	
	@FindBy(name="shippingAddress.countryCode")
	WebElement Country
	;
	@FindBy(name="shippingAddress.postalCode")
	WebElement Postal;
	
	@FindBy(name="shippingAddress.city")
	WebElement City;
	
	@FindBy(name="shippingAddress.stateOrProvinceCode")
	WebElement State;
	
	@FindBy(name="shippingAddress.address1")
	WebElement Address;
	@FindBy(xpath="//button[@id=\"checkout-shipping-continue\"]")
	WebElement Continue;
	
//	@FindBy(xpath="//*[@id=\"checkout-page-container\"]/div/div/div[1]/ol/li[1]/div[1]/div/div[2]/div/div[2]/button")
//	WebElement SignOut;
	
	public P_4AddData_LARQ(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void Click() {
		Arrow.click();
		Enter.click();
	}
	
	public void SetValues(String fname,String lname,String country,String postal,String city,String state,String add ) throws InterruptedException {
		Fname.sendKeys(fname);
		Lname.sendKeys(lname);
		
		Select ConSelect=new Select(Country);
		ConSelect.selectByVisibleText(country);
	//	Country.sendKeys(country);
		
		Postal.sendKeys(postal);
		City.sendKeys(city);
		
		Select StaSelect=new Select(State);
		StaSelect.selectByVisibleText(state);
	//	State.sendKeys(state);
		
		Address.sendKeys(add);
		
	}
	
	public void Countinue() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)", "");
		Thread.sleep(3000);
		Continue.click();
		Thread.sleep(3000);
		Continue.click();
	}
//	public void SignOutClick() {
//		SignOut.click();}
}
