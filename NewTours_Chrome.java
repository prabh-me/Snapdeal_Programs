package snapdeal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class NewTours_Chrome {

	
	public static void main(String[] args) throws BiffException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		FileInputStream fi=new FileInputStream("E:/Login.xls");	
		Workbook wb=Workbook.getWorkbook(fi);
		Sheet s=wb.getSheet("Sheet1");
		
		for(int i=1; i<s.getRows(); i++)
		{
			 String username=s.getCell(0, i).getContents();
			
			  System.out.println("username is "+ username);
			
			  String pass=s.getCell(1, i).getContents();
			
			
			   System.out.println("password is "+ pass);
			
			   driver.findElement(By.name("userName")).sendKeys(username);
			   
	           driver.findElement(By.name("password")).sendKeys(pass);
			    
			    driver.findElement(By.name("login")).click();
			    
			    driver.findElement(By.linkText("SIGN-OFF")).click();
			    
				//System.out.println("log out is successfully:"+"Current url is:"+driver.getCurrentUrl());
			
			
		} 

	}

}



