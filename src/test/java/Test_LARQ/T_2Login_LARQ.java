package Test_LARQ;

import org.testng.annotations.Test;

import Base_LARQ.Base_LARQ;
import Page_LARQ.P_2Login_LARQ;
import Util_LARQ.Util_LARQ;

public class T_2Login_LARQ extends Base_LARQ{

		@Test
		public void verifyLoginWithValidCred() throws InterruptedException {
			P_2Login_LARQ p1=new P_2Login_LARQ(driver);
			
			 p1.SignIconClick();
			
			String xl="D:\\Automation\\Selenium\\MyProject\\LARQ_2Login1.xlsx";
		    String Sheet="Sheet1";
		    int rowCount=Util_LARQ.getRowCount(xl,Sheet);
		    System.out.println(rowCount);
		
		    for(int i=1;i<=rowCount;i++) {
				int cellCount=Util_LARQ.getCellCount(xl, Sheet, i);
				System.out.println("Cell Count: "+cellCount);
		    
			  for(int j=0;j<cellCount;j+=2) { 
					
				String userName=Util_LARQ.getCellValue(xl, Sheet, i, j);
				System.out.println("Usename = "+userName);
				String pswd=Util_LARQ.getCellValue(xl, Sheet, i, j+1);
				System.out.println("Password = "+pswd);
		
				//p1.SignIconClick();
				p1.SetValuesL(userName, pswd);
				p1.SignButtonClick();
				
			    String act_url=driver.getCurrentUrl();
	       	    System.out.println("Act_Url: "+act_url);
		        String exp_url="https://www.livelarq.com/user/sign-in";
		       
		       if(act_url.equals(exp_url)) {
		    	   System.out.println("LOGIN SUCCESS");  
		       }
		       else {
		    	   System.out.println("LOGIN FAILED");
		       }
		       
		       Thread.sleep(1000);
				driver.get("https://www.livelarq.com");

				 p1.SignIconClick();
			}
	       }
	      }
         }
