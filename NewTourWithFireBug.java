package snapdeal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class NewTourWithFireBug {

	public static void main(String args[])
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("mobileNumber")).sendKeys("9716336096");
	    driver.findElement(By.xpath("//form[@id='recharge']/ul/li[5]/span/span")).click();
	    driver.findElement(By.linkText("Rs 130")).click();
	    driver.findElement(By.name("isFastForward")).click();
	    driver.findElement(By.xpath("//form[@id='recharge']/div[4]/button")).click();
	    driver.close();
		    
	}
}
