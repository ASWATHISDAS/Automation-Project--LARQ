package Test_LARQ;

import org.testng.annotations.Test;

import Base_LARQ.Base_LARQ;
import Page_LARQ.P_1Reg_LARQ;
import Util_LARQ.Util_LARQ;


public class T_1Reg_LARQ extends Base_LARQ {

	@Test
	public void verifyLoginWithValidCred() throws InterruptedException {
		P_1Reg_LARQ p1=new P_1Reg_LARQ(driver);
		
		p1.Sign_In();
		p1.AccountClick();
		
		String xl="D:\\Automation\\Selenium\\MyProject\\LARQ_1Reg1.xlsx";
	    String Sheet="Sheet1";
	    int rowCount=Util_LARQ.getRowCount(xl,Sheet);
	    System.out.println(rowCount);
	
	    for(int i=1;i<=rowCount;i++) {
			int cellCount=Util_LARQ.getCellCount(xl, Sheet, i);
			System.out.println("Cell Count: "+cellCount);
	    
		  for(int j=0;j<cellCount;j+=10) { 
				
			String Email=Util_LARQ.getCellValue(xl, Sheet, i, j);
			System.out.println("Email= "+Email);
			String Password=Util_LARQ.getCellValue(xl, Sheet, i, j+1);
			System.out.println("Password = "+Password);
			String CPassword=Util_LARQ.getCellValue(xl, Sheet, i, j+2);
			System.out.println("CPassword = "+CPassword);
			String Country=Util_LARQ.getCellValue(xl, Sheet, i, j+3);
			System.out.println("Country = "+Country);
			String Fname=Util_LARQ.getCellValue(xl, Sheet, i, j+4);
			System.out.println("Fname = "+Fname);
			String Lname=Util_LARQ.getCellValue(xl, Sheet, i, j+5);
			System.out.println("Lname = "+Lname);
			String Address=Util_LARQ.getCellValue(xl, Sheet, i, j+6);
			System.out.println("Address = "+Address);
			String City=Util_LARQ.getCellValue(xl, Sheet, i, j+7);
			System.out.println("City = "+City);
			String State=Util_LARQ.getCellValue(xl, Sheet, i, j+8);
			System.out.println("State = "+State);
			String Zip=Util_LARQ.getCellValue(xl, Sheet, i, j+9);
			System.out.println("Zip = "+Zip);
	
			
			p1.SetValues(Email,Password,CPassword,Country,Fname,Lname,Address,City,State,Zip);
			p1.Save();
			
	       Thread.sleep(1000);
			driver.get("https://www.livelarq.com/");
			p1.Sign_In();
			p1.AccountClick();
			}
          }
       }
     }
