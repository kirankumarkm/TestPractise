package JavaInterview;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowHandle 
{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.marionette","F:\\eclipse-java-luna-SR2-win32-x86_64\\geckodriver-v0.11.1-win64.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");	
		
		
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath(".//*[@id='post-body-6170641642826198246']/a[1]")).click();
		Set<String>allwindow = driver.getWindowHandles();
		
		
		for(String child:allwindow)
		{
			if (!parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				Thread.sleep(2000);
				driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
				Thread.sleep(2000);
				String childTitle = driver.getTitle();
				System.out.println("Child window name :"+childTitle);
				driver.close();
			}
			
		}
		driver.switchTo().window(parent);
		System.out.println("Parent Window name :"+driver.getTitle());
		driver.close();

	}

}
