package Test_LARQ;

import org.testng.annotations.Test;

import Base_LARQ.Base_LARQ;
import Page_LARQ.P_2Login_LARQ;
import Page_LARQ.P_3Product_LARQ;
import Util_LARQ.Util_LARQ;

public class T_3Product_LARQ extends Base_LARQ {

	@Test
	public void verifyLoginWithValidCred() throws InterruptedException {
		P_2Login_LARQ p1=new P_2Login_LARQ(driver);
		
		 p1.SignIconClick();
	    Thread.sleep(2000);
	    p1.SetValuesL("aswathi@gmail.com","achoos123");
	    p1.SignButtonClick();
	    
	    P_3Product_LARQ pdt=new P_3Product_LARQ(driver);
	    pdt.option();
	 //   pdt.PdtClick();
	    pdt.AddClick();
	    
	    
	//	driver.get("https://www.livelarq.com");
	
	   
       }
     }
