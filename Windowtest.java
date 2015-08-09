package snapdeal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class Windowtest {

	public static void main(String args[]) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		String parentWindowHandle= driver.getWindowHandle();
		driver.get("http://www.toolsqa.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();
		//String mainwindow=driver.getWindowHandle();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='button1']")).click();
		driver.findElement(By.xpath(".//*[@id='button1']")).click();
		for(String winHandle:driver.getWindowHandles())
		{
			driver.switchTo().window(winHandle);
			System.out.println(driver.getTitle());
			Thread.sleep(5000);
		}
		
		
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(10000);
		
		//driver.findElement(By.cssSelector(selector))
		
	}
}