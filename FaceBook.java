package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.id("email")).sendKeys("satyasantosh2@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("iloveusantosh");
		driver.findElement(By.name("login")).click();
		
		//driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		//driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).click();
		//driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("Santosh");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//driver.findElement(By.xpath("(//input[@data-type='text'])[3]")).
		//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Santosh");
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
