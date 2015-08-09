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


public class Windoealert {

	public static void main(String args[])
	{

		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.javascriptkit.com/javatutors/alert2.shtml");
		driver.manage().window().maximize();
		String mainwindow=driver.getWindowHandle();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//input[@name='B3']")).click();
		org.openqa.selenium.Alert alt=driver.switchTo().alert();
		alt.accept();
		alt.dismiss();
		driver.switchTo().window(mainwindow);
		
		driver.close();
		
		
		
	}
}
