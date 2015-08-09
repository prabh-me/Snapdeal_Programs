package snapdeal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class Freshersworld {

	public static void main(String args[])
	{

		WebDriver driver=new FirefoxDriver();
		driver.get("http://freshersworld.com");
		driver.manage().window().maximize();
		 driver.findElement(By.linkText("Register Free")).click();
		    driver.findElement(By.id("firstname")).clear();
		    driver.findElement(By.id("firstname")).sendKeys("Prabhjot");
		    driver.findElement(By.id("lastname")).clear();
		    driver.findElement(By.id("lastname")).sendKeys("Singh");
		    driver.findElement(By.id("email")).clear();
		    driver.findElement(By.id("email")).sendKeys("prabh@gmail.com");
		    driver.findElement(By.id("remail")).clear();
		    driver.findElement(By.id("remail")).sendKeys("prabh@gmail.com");
		    driver.findElement(By.id("pass")).clear();
		    driver.findElement(By.id("pass")).sendKeys("password");
		    driver.findElement(By.id("repass")).clear();
		    driver.findElement(By.id("repass")).sendKeys("password");
		    driver.findElement(By.id("mobile")).clear();
		    driver.findElement(By.id("mobile")).sendKeys("9876543210");
		    new Select(driver.findElement(By.id("currentCity"))).selectByVisibleText("Delhi");
		    
		    new Select(driver.findElement(By.id("course"))).selectByVisibleText("BE/B.Tech");
		    try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    new Select(driver.findElement(By.id("branch"))).selectByVisibleText("Computer Science & Engineering (CSE)");
		    new Select(driver.findElement(By.id("passMonth"))).selectByVisibleText("MAY");
		    new Select(driver.findElement(By.id("passYear"))).selectByVisibleText("2015");
		    driver.findElement(By.id("marks")).clear();
		    driver.findElement(By.id("marks")).sendKeys("80");
		    try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    new Select(driver.findElement(By.id("hqState"))).selectByVisibleText("Delhi");
		    try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    new Select(driver.findElement(By.id("hqInstitute"))).selectByVisibleText("Amity School of Engineering & Technology, Noida (New Delhi)");
		    new Select(driver.findElement(By.id("hqUniversity"))).selectByVisibleText("Guru Govind Singh Indraprastha Vishwavidyalaya");
		    String a=driver.findElement(By.xpath(".//*[@id='captchaView']")).getText();
		    driver.findElement(By.id("captcha")).clear();
		    driver.findElement(By.id("captcha")).sendKeys(a);
		    driver.findElement(By.name("submitRegister")).click();
		//driver.close();
	}
}