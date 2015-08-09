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


public class Frame {

	public static void main(String args[])
	{

		WebDriver driver=new FirefoxDriver();
		driver.get("http://selenium.googlecode.com/svn/trunk/docs/api/java/index.html");
		driver.manage().window().maximize();
		driver.switchTo().frame("classFrame");
		driver.findElement(By.partialLinkText("Deprec")).click();
			System.out.println("Click on deprec link");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.linkText("Index")).click();
			System.out.println("Switched back classframe");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.switchTo().parentFrame();
			driver.switchTo().frame("packageListFrame");
	}
	}
	