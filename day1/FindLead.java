package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//Find the element Enter the username
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				Thread.sleep(1000);
				//find the element enter the password
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				Thread.sleep(1000);
				//click login button
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.partialLinkText("CRM/SFA")).click();
				//click leads
				driver.findElement(By.linkText("Leads")).click();
				//click find element
				driver.findElement(By.linkText("Find Leads")).click();
				//Enter company name
				driver.findElement(By.xpath("(//input[contains(@name,'companyName')])[2]")).sendKeys("TestLeaf");
				//click find leads button
				driver.findElement(By.xpath("(//button[contains(@class,'x-btn-text')])[7]")).click();
	}

}
