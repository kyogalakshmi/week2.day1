package week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {
	
	/*
Open the browser
Load the URL
Maximize the browser
Enter UserName
Enter Password
Click Login
Click CRM/SFA
Click Contacts Tab
Click Create Contact
Type First Name
Type Last Name
Click Create Contact Button
Print the first name and browser title 
Close the browser 
	 */

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yoga\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("Browser Title is: " + title);
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Contacts")).click();
		driver.findElement(By.partialLinkText("Create Contact")).click();

		WebElement firstname = driver.findElement(By.id("firstNameField"));
		firstname.sendKeys("Yoga");
		String FNAME = firstname.getAttribute("value");

		driver.findElement(By.id("lastNameField")).sendKeys("K");
		driver.findElement(By.name("submitButton")).click();

		System.out.println("First Name is: " + FNAME);
		driver.close();
	}

}
