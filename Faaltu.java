package snapdeal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class Faaltu {

	public static void main(String args[])
	{

		WebDriver driver=new FirefoxDriver();
		driver.get("http://selenium.googlecode.com/svn/trunk/docs/api/java/index.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("html/body/div[1]/ul/li[5]/a")).click();
	}
}