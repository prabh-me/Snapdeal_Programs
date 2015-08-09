package snapdeal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class Keyboard {

	public static void main(String args[])
	{

		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		   driver.findElement(By.name("userName")).clear();
		    driver.findElement(By.name("userName")).sendKeys("ravi_blr");
		    driver.findElement(By.name("password")).clear();
		    driver.findElement(By.name("password")).sendKeys("ravi_blr",Keys.F5);
		//driver.close();
	}
}