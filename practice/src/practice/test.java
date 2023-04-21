package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\" + "Program Files\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//a[text() = 'Login']")).click();
		
		driver.findElement(By.xpath("(//input[@type = 'text'])[2]")).sendKeys("123@gmail.com");
		
		driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("123456");
		
		driver.findElement(By.xpath("(//button[@type = 'submit'])[2]")).click();
	}
}
