package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/input.xhtml");
		//Maximize the browser
		driver.manage().window().maximize();
		//Enter your name
		driver.findElement(By.id("j_idt88:name")).sendKeys("Lekshmanan");

	}

}
