package snapdeal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class Project1 {

	public static void main(String args[])
	{

		WebDriver driver=new FirefoxDriver();
		driver.get("https://youtube.com");
		driver.manage().window().maximize();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	    driver.findElement(By.xpath(".//*[@id='item-section-559289']/li/div/div/div[2]/div[1]/div/div[2]/h3/a")).click();
	 
	    //if(driver.findElement(By.xpath(".//*[@id='pass']")).isEnabled())
	    
	 //System.out.println("yyoyoo");

	  /* String a=driver.getTitle();
	    try{
	    Assert.assertEquals(a, "google");
	    }
	    catch(Throwable e){
	    	System.out.println("Exception encountered");
	    }
	    System.out.println("True hai");
	    
	    driver.quit();*/
	}
	}