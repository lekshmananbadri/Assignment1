package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateContact {

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
				//click contacts
				driver.findElement(By.linkText("Contacts")).click();
				//click create contacts
				driver.findElement(By.linkText("Create Contact")).click();
				//Enter first name
				driver.findElement(By.id("firstNameField")).sendKeys("S");
				//Enter last name
				driver.findElement(By.id("lastNameField")).sendKeys("Lekshmanan");
				//Enter Birth date
				driver.findElement(By.id("createContactForm_birthDate")).sendKeys("06/24/1996");
				//click submit button
				driver.findElement(By.name("submitButton")).click();
				String text = driver.findElement(By.id("viewContact_fullName_sp")).getText();
				System.out.println(text);
				//driver.close();
			
			
				
	}

}
