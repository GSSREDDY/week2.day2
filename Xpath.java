package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps");
	driver.manage().window().maximize();
	String title = driver.getTitle();
	System.out.println(title);
	driver.findElement(By.xpath("//input[@class='inputLogin']")).sendKeys("DemosalesManager");
driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
driver.findElement(By.xpath("//input[@type='submit']")).click();
driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
driver.findElement(By.xpath("//a[text()='Contacts']")).click();
driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Santosh");
driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("Reddy");
driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
driver.close();
//WebElement eleDropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
//Select 
















































//driver.findElement(By.xpath("//a[text()='Leads']")).click();


	//driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();

//driver.findElement(By.xpath("//a[text()='CRM/SFA']")).click();
			

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
