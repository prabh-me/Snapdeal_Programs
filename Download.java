package snapdeal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Download {
public static void main(String args[])
{
	FirefoxProfile profile=new FirefoxProfile();
	profile.setPreference("browser.download.folderList", 2);
	profile.setPreference("browser.download.dir","E:\\softwares");
	profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/exe");
	
	WebDriver driver= new FirefoxDriver(profile);
	driver.get("http://download.com");
	driver.findElement(By.xpath(".//*[@id='pop']/ul/li[1]/a/span")).click();
	driver.findElement(By.xpath(".//*[@id='product-upper-container']/div[1]/div[1]/div/div[1]/a/span[1]")).click();
	
}
	
}
