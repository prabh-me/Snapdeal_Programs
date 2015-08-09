package snapdeal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Upload {

	public static void main(String args[])
	{

		WebDriver driver=new FirefoxDriver();
		driver.get("http://workupload.com");
		driver.manage().window().maximize();
	driver.findElement(By.name("userFile[]")).clear();
    driver.findElement(By.name("userFile[]")).sendKeys("E:\\docs\\photo.JPG");
    driver.findElement(By.cssSelector("input.btn.btn-prio")).click();
    try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    driver.findElement(By.id("download-button")).click();
	
}
}