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
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class Dropdown {

	public static void main(String args[]) throws InterruptedException
	{
//System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		//String parentWindowHandle= driver.getWindowHandle();
		driver.get("http://www.echoecho.com/htmlforms11.htm");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[1]/tbody/tr/td/table/tbody/tr[2]/td[3]/select"));
		Select s1=new Select(element);
		s1.selectByIndex(1);
		Thread.sleep(2000);
		s1.selectByValue("Butter");
		WebElement option=s1.getFirstSelectedOption();
		List<WebElement> x= s1.getOptions();
		for(WebElement ele:x) {
			System.out.println(ele.getText());
		}
	}
}