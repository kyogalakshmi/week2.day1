package week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase2 {
/*
	 * Test case 2:

Open the browser
Load the URL
Maximize the browser
Enter UserName
Enter Password
Click Login
Click CRM/SFA
Click Contacts Tab
Click Find Contacts
Click Email Tab
Type email as babu@testleaf.com
Click Find Contacts
Close the browser
	 * 
	 * 
	 */
public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yoga\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Contacts")).click();
	
		driver.findElement(By.partialLinkText("Find Contacts")).click();
		
		
		
	   driver.findElement(By.xpath("//span[text()='Email']")).click();
	   WebElement search = driver.findElement(By.name("emailAddress"));
	    search.sendKeys("babu@testleaf.com");
	    
	    driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
	   if(search.isDisplayed())
	   {
		   System.out.println(search.getAttribute("value")+" " +"is Found!!");
	   }
	   else {
		   System.out.println("Search Element is NotFound!!");
	   }
	    driver.close();
	}

}
