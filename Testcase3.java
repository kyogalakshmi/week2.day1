package week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase3 {
/*
 * Testcase: 3
Create Lead in Leaftaps Application        
==================================================
         1. Launch URL "http://leaftaps.com/opentaps/control/login"	 
	 2. Enter UserName and Password 	  
	 3. Click on Login Button 
	 4. Click on CRM/SFA Link	
	 5. Click on Leads Button	 
	 6. Click on create Lead Button	  
	 7. Enter all the fields in CreateLead page
          **Note
               1. Donot work on Parent Account Field
               2.Enter the Birthdate using SendKeys
	 8. Enter all the fields in contact information   
	 9. Enter all the fields in primary address	 
	 10. Click on create Lead Button
**/
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yoga\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Create Lead")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeafDemo");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Yoga");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
		Select dropdown = new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));  
        dropdown.selectByIndex(1);
        Select marketingCampaignId = new Select(driver.findElement(By.name("marketingCampaignId")));  
        marketingCampaignId.selectByIndex(1);
 
    	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("YogaLK");
    	driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Lakshmi");
    	driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Miss");
    	driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("01/11/22");
    	driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Test");
    	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Test");
    	driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("100000");
    	Select currencyUomId = new Select(driver.findElement(By.id("createLeadForm_currencyUomId")));
    	currencyUomId.selectByIndex(1);
    	Select industryEnumId = new Select(driver.findElement(By.id("createLeadForm_industryEnumId")));  
    	industryEnumId.selectByIndex(1);
    	driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("100");
    	Select ownershipEnumId = new Select(driver.findElement(By.id("createLeadForm_ownershipEnumId")));  
        ownershipEnumId.selectByIndex(1);
    
    	driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("1234");
    	driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("ABC");
    	driver.findElement(By.id("createLeadForm_description")).sendKeys("This is a Test Description!!!");
    	driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("This is a Important Note!!!");
    	
    	//*****************Contact Information**************************************************************
    	
    	driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
    	driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("80");
    	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9845677674663");
    	driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("412");
    	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("yoga@gmail.com");
    	driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("WWW.DEMOTEST.COM");
    	
    	//*****************Primary Address********************************************************************   
    	driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Yogalakshmi");
    	driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Yoga");
    	driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("LakeView");
    	driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("3rd Cross street");
    	driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("CALIFORNIA");
    	Select generalStateProvinceGeoId = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));  
    	generalStateProvinceGeoId.selectByIndex(9);
    	driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("10001");
    	driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("454");
    	Select generalCountryGeoId = new Select(driver.findElement(By.id("createLeadForm_generalCountryGeoId")));  
    	generalCountryGeoId.selectByValue("United States");
    	
    	driver.findElement(By.partialLinkText("submitButton")).click();
        driver.close(); 

    	}

}
