package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTheBrowser {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(1000);
//close the browser	
		//driver.close();
		//Find the element Enter the username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		Thread.sleep(1000);
		//find the element enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(1000);
		//click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		//To verify the load page
		// print the title of page
		String title = driver.getTitle();
		System.out.println("title");
		System.out.println(driver.getCurrentUrl());
		//click leads
		driver.findElement(By.linkText("Leads")).click();
		//click create leads
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter the company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		//Enter the first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("S");
		//Enter the last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Lekshmanan");
		//click create lead button
		driver.findElement(By.name("submitButton")).click();
		//verify the lead is created
		//find the element
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text);
		
		
	}

}
	