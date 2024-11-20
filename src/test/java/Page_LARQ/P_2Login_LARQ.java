package Page_LARQ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P_2Login_LARQ {

	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"__next\"]/section[1]/div/div/section/div[1]/div/div[4]/nav/ul/li[3]")
	WebElement SignIcon;

	@FindBy(id="login_email")
	WebElement Username;
	
	@FindBy(id="login_pass")
	WebElement Password;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/div[3]/div/div/div[1]/form/div[3]/button")
	WebElement Sign_In;

	public P_2Login_LARQ(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void SignIconClick() {
		SignIcon.click();
	}
	
	public void SetValuesL(String userName, String pswd) {
		// TODO Auto-generated method stub
		Username.sendKeys(userName);
		Password.sendKeys(pswd);
	}
	
	
	public void SignButtonClick() {
		Sign_In.click();
	}	
}
