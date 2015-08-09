package snapdeal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class Switch {

	public static void main(String args[])
	{

		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		 driver.findElement(By.name("userName")).clear();
		    driver.findElement(By.name("userName")).sendKeys("ravi_blr");
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		driver.get("http://gmail.com");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t" );
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"w" );
		String selectAll = Keys.chord(Keys.CONTROL, Keys.SHIFT,"t");
		driver.findElement(By.tagName("html")).sendKeys(selectAll);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t" );
		driver.switchTo().defaultContent();
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "shift" +"\t" );
	}
}