package snapdeal;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class Mouseandkeyboard {

	public static void main(String args[]) throws InterruptedException
	{
//System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		//String parentWindowHandle= driver.getWindowHandle();
		driver.get("http://www.freshersworld.com");
		
		driver.manage().window().maximize();
		
		WebElement menu=driver.findElement(By.linkText("Jobs"));
		WebElement link=driver.findElement(By.xpath(".//*[@id='drop_down1']/div[1]/ul/li[1]/a"));
		WebElement link1=driver.findElement(By.linkText("MBA Jobs"));
		WebElement link2=driver.findElement(By.linkText("BPO Jobs"));
		Actions action=new Actions(driver);
		action.moveToElement(menu).perform();
		
		Action seriesofactions=action.keyUp(Keys.CONTROL).click(link1).click(link2).build();
		seriesofactions.perform();
		//Action seriesofactions1=action.keyUp(Keys.CONTROL).clickAndHold(link1).click().build();
	}
}