package Production_Environment;

import java.util.Random;

import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helpers.SelectorExternal;

public class editContacts_Prod {
	
	@Test
	public void OnboardProd() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\temp\\chromedriver.exe");

 	// open chrome browser
 	WebDriver driver = new ChromeDriver();

 	// navigate to testing page
 	driver.get("https://hub.emailTest.com");

 	//Create object of Dimensions class
    Dimension d = new Dimension(720,920);
    //Resize the current window to the given dimension
    driver.manage().window().setSize(d);
 
 // explicit wait - to wait for the Next button to be click-able
 	 	WebDriverWait wait = new WebDriverWait(driver, 8);
 	 	wait.until(ExpectedConditions.elementToBeClickable(SelectorExternal.SignIn));

 	 			//type email 
 	 			driver.findElement(SelectorExternal.username).sendKeys("qualitynow123+prod+1281@emailTest.com");
 	 			driver.findElement(SelectorExternal.passwrord).sendKeys("9fyUon:OLa"); 			
 	 			
 	 		
 	 			
 	 			driver.findElement(SelectorExternal.SignIn).click();
 	 			
//           What is the full registered name of the factory?
		 		   // create instance of Random class
		        Random rand = new Random();
		  
		        // Generate random integers in range 0 to 999
		        int rand_int1 = rand.nextInt(1000);
		     //generate random integer telephone number
				int rand_int2 = rand.nextInt(100000000);
				
				
		    // edit Contact Information for Account/ Buying	
				driver.manage().window().maximize();
	 			wait.until(ExpectedConditions.elementToBeClickable(SelectorExternal.EditContacts));
	 			driver.findElement(SelectorExternal.EditContacts).click();
 						 												
				 driver.findElement(SelectorExternal.title).click();
				 driver.findElement(SelectorExternal.titleLord).click();
 					
				 driver.findElement(SelectorExternal.first_name).sendKeys("Lewis");
				 driver.findElement(SelectorExternal.last_name).sendKeys("Hamilton");
				 driver.findElement(SelectorExternal.other_name).sendKeys("Leviston");
				 driver.findElement(SelectorExternal.email).sendKeys("qualitynow345+acount"+rand_int1+"@emailTest.com");
				 
					
				 driver.findElement(SelectorExternal.phone_country_code).click();
					
				 driver.findElement(SelectorExternal.phone_codeCambodgia).click();
				 
				 
				 driver.findElement(SelectorExternal.phone_number).sendKeys("077"+rand_int2);
 					
				 driver.findElement(SelectorExternal.SaveContacts).click();
 					
	       // edit Chairman Information
	 		
//	 			wait.until(ExpectedConditions.elementToBeClickable(SelectorExternal.ChairmanButton));
//	 			 driver.findElement(SelectorExternal.ChairmanButton).click();
				 wait.until(ExpectedConditions.elementToBeClickable(SelectorExternal.title2));
				 driver.findElement(SelectorExternal.title2).click();
				 driver.findElement(SelectorExternal.titleLord2).click();
 					
				 driver.findElement(SelectorExternal.first_name2).sendKeys("Gerard");
				 driver.findElement(SelectorExternal.last_name2).sendKeys("Thomas");
				 driver.findElement(SelectorExternal.other_name2).sendKeys("Tommy");
				 driver.findElement(SelectorExternal.email2).sendKeys("qualitynow567"+rand_int1+"@emailTest.com");
				 
				
				driver.findElement(SelectorExternal.phone_country_code2).click();
					
				driver.findElement(SelectorExternal.phone_codeCambodgia2).click();
				 
				 
				 driver.findElement(SelectorExternal.phone_number2).sendKeys("077"+rand_int2);
 					
				 driver.findElement(SelectorExternal.Savechairman).click();
 					
			
 					
				Thread.sleep(1000);
				// edit Production Information	
				 wait.until(ExpectedConditions.elementToBeClickable(SelectorExternal.SaveProduction));
				 driver.findElement(SelectorExternal.NoProduction).click();
				 driver.findElement(SelectorExternal.SaveProduction).click();
				
				Thread.sleep(1000);
				 //edit Marketing Information
				
				 wait.until(ExpectedConditions.elementToBeClickable(SelectorExternal.NoMarketing));
				 driver.findElement(SelectorExternal.NoMarketing).click();
				 driver.findElement(SelectorExternal.SaveMarketing).click();
				 
				//edit HR Information
				Thread.sleep(1000);
				 wait.until(ExpectedConditions.elementToBeClickable(SelectorExternal.NoHR));
				 driver.findElement(SelectorExternal.NoHR).click();
				 driver.findElement(SelectorExternal.SaveHR).click();
				 
				//edit Compliance Information
				Thread.sleep(1000);
				 wait.until(ExpectedConditions.elementToBeClickable(SelectorExternal.NoCompl));
				 driver.findElement(SelectorExternal.NoCompl).click();
				 driver.findElement(SelectorExternal.SaveCompl).click();
				 
					//edit Contact Finance Information
				Thread.sleep(1000);
				 wait.until(ExpectedConditions.elementToBeClickable(SelectorExternal.contactFinanceTitle));
				driver.findElement(SelectorExternal.contactFinanceTitle).click();	 		    				
				driver.findElement(SelectorExternal.contactFinanceTitle8).click();	 		    				
				driver.findElement(SelectorExternal.finance_first_name).sendKeys("George");	 		    				
				driver.findElement(SelectorExternal.finance_last_name).sendKeys("Cazacu");	 		    				
				driver.findElement(SelectorExternal.finance_contact_email).sendKeys("Georgecazacusd"+rand_int1+"@emailTest.com");	 		    			
				driver.findElement(SelectorExternal.finance_phone_code).click();	 		    				
				driver.findElement(SelectorExternal.finance_phone_code5).click();	 		    				
				driver.findElement(SelectorExternal.finance_phone_number).sendKeys("07448"+rand_int1);	 		    				 
				driver.findElement(SelectorExternal.saveContactFinance).click();
				
				 
				//edit Booking Information
				Thread.sleep(1000);
			 wait.until(ExpectedConditions.elementToBeClickable(SelectorExternal.NoBooking));
			driver.findElement(SelectorExternal.NoBooking).click();	 		    				
			driver.findElement(SelectorExternal.SaveBooking).click();	 		
		
			
			//edit Contact Finance Information
			Thread.sleep(1000);
			 wait.until(ExpectedConditions.elementToBeClickable(SelectorExternal.NoTQC));
			driver.findElement(SelectorExternal.NoTQC).click();	 		    				
			driver.findElement(SelectorExternal.SaveTQC).click();	 
}
}