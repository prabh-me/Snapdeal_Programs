package snapdeal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class Excel {

	public static void main(String args[]) throws BiffException, IOException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		FileInputStream fi= new FileInputStream("E:/Login.xls");
		System.out.println("file.." +fi);
		
		Workbook wb= Workbook.getWorkbook(fi);
		System.out.println(wb);
		Sheet s=wb.getSheet(0);
		System.out.println("sheet= "+s);
		System.out.println("Total rows"+ s.getRows());
		System.out.println("Total columns"+ s.getColumns());
		
		for(int i=1;i<s.getRows();i++)
		{
			String username=s.getCell(0,i).getContents();
			System.out.println("username is " + username);
			String pass=s.getCell(1,i).getContents();
			System.out.println("password is " +pass);
			driver.findElement(By.name("userName")).sendKeys(username);
			 driver.findElement(By.name("password")).sendKeys(pass);
			    driver.findElement(By.name("login")).click();
			    driver.findElement(By.linkText("SIGN-OFF")).click();
		}
		
	}
}