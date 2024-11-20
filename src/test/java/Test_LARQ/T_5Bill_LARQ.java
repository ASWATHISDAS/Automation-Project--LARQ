package Test_LARQ;

import org.testng.annotations.Test;

import Base_LARQ.Base_LARQ;
import Page_LARQ.P_2Login_LARQ;
import Page_LARQ.P_3Product_LARQ;
import Page_LARQ.P_4AddData_LARQ;
import Page_LARQ.P_5Bill_LARQ;
import Util_LARQ.Util_LARQ;

public class T_5Bill_LARQ extends Base_LARQ{
@Test
	public void verifyLoginWithValidCred() throws InterruptedException {
		P_2Login_LARQ p1=new P_2Login_LARQ(driver);
		
	    p1.SignIconClick();
	    Thread.sleep(2000);
	    p1.SetValuesL("aswathi@gmail.com","achoos123");
	    p1.SignButtonClick();
	    
	    P_3Product_LARQ pdt=new P_3Product_LARQ(driver);
	    pdt.option();
	   // pdt.PdtClick();
	    pdt.AddClick();
	    
	    Thread.sleep(1000);
	    
/*	    P_4CheckOut_LARQ pdt1=new P_4CheckOut_LARQ(driver);
	    pdt1.CartClick();
	    pdt1.CheckClick(); */
	    
	    P_4AddData_LARQ pdt2=new P_4AddData_LARQ(driver);
	    pdt2.Click();
	    pdt2.SetValues("Aswathi","Das","Japan","123-0841","NISHIARAI","Akita","Achus(H)");
	    pdt2.Countinue();
	 //   pdt2.SignOutClick();
	    
	    P_5Bill_LARQ pdt3=new P_5Bill_LARQ(driver);
	    pdt3.BillValues("9876543298765432","09/25","Aswathi","967");
	    pdt3.PlaceOrder();
	    
	    
	    
		driver.get("https://www.livelarq.com");
		pdt3.SignOut();
	
       }
}
