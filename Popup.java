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


public class Popup {

	public static void main(String args[]) throws InterruptedException
	{
//System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		String parentWindowHandle= driver.getWindowHandle();
		driver.get("http://www.quackit.com/javascript/popup_windows.cfm");
		driver.manage().window().maximize();
		//String mainwindow=driver.getWindowHandle();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("html/body/div[1]/div/article/div[2]/div[2]/div[2]/div/input")).click();
		//driver.findElement(By.xpath(".//*[@id='button1']")).click();
		for(String winHandle:driver.getWindowHandles())
		{
			Thread.sleep(5000);
			driver.switchTo().window(winHandle);
			System.out.println(driver.getTitle());
			
				//driver.close();
			//Thread.sleep(1000);
		}
		driver.findElement(By.xpath("html/body/div[1]/div/article/p[2]/a")).click();
		Thread.sleep(1000);
		driver.switchTo().window(parentWindowHandle);
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[1]/div/article/p[2]/a[2]")).click();
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,500)");
		
		//Thread.sleep(1000);
		
		//driver.findElement(By.cssSelector(selector))
		
	}
}