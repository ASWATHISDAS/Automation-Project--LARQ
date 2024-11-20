package Page_LARQ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P_3Product_LARQ {

	WebDriver driver;
	
	@FindBy (xpath="//*[@id=\"__next\"]/section[1]/div/div/section/div[1]/div/div[1]/nav/ul/li[4]/button")
	WebElement options;
	
	//@FindBy (xpath="//img[@alt=\"LARQ Bottle Flip Top Obsidian Black\"][@src=\"https://res.cloudinary.com/larq/image/upload/q_auto,f_auto/w_900/v1710408035/SKU/SPA/v3/BNSOB050A.png\"]")
	
	@FindBy (xpath="//*[@id=\"main-content\"]/section[8]/div/div/div[2]/div/div[1]/div[1]/div[1]/div/div[4]/a/div/div/img")
	WebElement product;
	
	@FindBy (xpath="//*[@id=\"main-content\"]/div[1]/div/div/div[1]/div/div[2]/div/div[1]/div[4]/button")
	WebElement addtocart;
	
	@FindBy (xpath="//*[@id=\"__next\"]/section[1]/div/div/section/div[1]/div/div[4]/nav/ul/li[4]/button")
	WebElement AddIcon;
	
	//@FindBy(xpath="//button[contains(text(),'Check out now')]")
	@FindBy (xpath="//button[@data-category=\"Cart Preview\"]")
	WebElement Check;
	
	
	public P_3Product_LARQ(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void option() throws InterruptedException {
		Actions act=new Actions(driver);
		act.moveToElement(options).perform();
		options.click();
		product.click();
		
	}
	
	public void PdtClick() throws InterruptedException {
		Thread.sleep(2000);
		product.click();
	}
	
	public void AddClick() throws InterruptedException {
		Thread.sleep(2000);
		addtocart.click();
		Thread.sleep(2000);
		AddIcon.click();
		//Thread.sleep(2000);
		//AddIcon.click();
		
		Check.click();
		}
		
	}


