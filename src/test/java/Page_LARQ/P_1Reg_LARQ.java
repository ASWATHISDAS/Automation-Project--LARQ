package Page_LARQ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class P_1Reg_LARQ {

   WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"__next\"]/section[1]/div/div/section/div[1]/div/div[4]/nav/ul/li[3]/a")
	WebElement SignInIcon;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/div[3]/div/div/div[2]/div/div[2]/a")
	WebElement Account;
	
	@FindBy(name="email")
	WebElement Email;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="passwordConfirm")
	WebElement CPassword;
	
	@FindBy(name="country")
	WebElement Country;
	
	@FindBy(name="firstName")
	WebElement Fname;
	
	@FindBy(name="lastName")
	WebElement Lname;
	
	@FindBy(name="addressLineOne")
	WebElement Address;
	
	@FindBy(name="suburbCity")
	WebElement City;
	
	@FindBy(name="stateProvince")
	WebElement State;
	
	@FindBy(name="zipPostcode")
	WebElement Zip;
		
	@FindBy(xpath="//*[@id=\"main-content\"]/div[2]/div/div/div[15]/div/button")
	WebElement Save;
	
	public P_1Reg_LARQ(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	    }
	
	public void Sign_In() {
	    SignInIcon.click();
	}
	
	public void AccountClick() {
	    Account.click();
	    }
	
	public void SetValues(String mail,String pw,String cpw,String con,String fn,String ln,String add,String city,String state,String zip) {
		Email.sendKeys(mail);
		Password.sendKeys(pw);
		CPassword.sendKeys(cpw);
	//Country.sendKeys(con);
		Select CountrySelect=new Select(Country);
		CountrySelect.selectByVisibleText(con);
	    Fname.sendKeys(fn);
	    Lname.sendKeys(ln);
	    Address.sendKeys(add);
	    City.sendKeys(city);
   // State.sendKeys(state);
	    Select StateSelect=new Select(State);
		StateSelect.selectByVisibleText(state);
	    Zip.sendKeys(zip);
	   }
	    
	    public void Save() {
		Save.click();
	    }  
      }
