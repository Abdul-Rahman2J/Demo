package SeleniumScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	/*	WebElement dr=driver.findElement(By.id("username"));
		dr.sendKeys("BalaramanR");
		
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("26GJ80");
		
		driver.findElement(By.id("login")).click();
		
		System.out.println("The Script passed");*/
		
	

	}

}
