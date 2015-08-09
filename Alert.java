package snapdeal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class Alert {

	public static void main(String args[])
	{

		WebDriver driver=new FirefoxDriver();
		driver.get("http://jsbin.com/usidix/1");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input")).click();
		String alertMessage=driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		driver.switchTo().alert().dismiss();
		//driver.switchTo().alert().accept();
		
		driver.close();

		
	}
}