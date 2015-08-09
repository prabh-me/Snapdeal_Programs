package snapdeal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.*;

public class Project {

	public static void main(String args[])
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		String a=driver.getTitle();
		System.out.println(a);
		   driver.findElement(By.name("userName")).clear();
		    driver.findElement(By.name("userName")).sendKeys("ravi_blr");
		    driver.findElement(By.name("password")).clear();
		    driver.findElement(By.name("password")).sendKeys("ravi_blr");
		    driver.findElement(By.name("login")).click();
		    
		    driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
		    
		    new Select(driver.findElement(By.name("passCount"))).selectByVisibleText("2");
		    new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("Frankfurt");
		    new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("London");
		    new Select(driver.findElement(By.name("fromDay"))).selectByVisibleText("5");
		    new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("New York");
		    new Select(driver.findElement(By.name("toDay"))).selectByVisibleText("10");
		    driver.findElement(By.cssSelector("font > font > input[name=\"servClass\"]")).click();
		    new Select(driver.findElement(By.name("airline"))).selectByVisibleText("Blue Skies Airlines");
		    driver.findElement(By.name("findFlights")).click();
		    driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[5]/td[1]/input")).click();
		    driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[5]/td[1]/input")).click();
		    driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/p/input")).click();
		    //driver.findElement(By.cssSelector("input[name=findFlights]")).click();
		    driver.findElement(By.linkText("SIGN-OFF")).click();
		    
		    
		    
	    driver.close();
	    
		    
	}
}

