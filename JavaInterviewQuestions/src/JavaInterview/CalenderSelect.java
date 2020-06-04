package JavaInterview;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalenderSelect {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.firefox.marionette","F:\\eclipse-java-luna-SR2-win32-x86_64\\geckodriver-v0.11.1-win64.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath(".//*[@id='onward_cal']")).click();
		Thread.sleep(3000);
		
		List<WebElement>obj = driver.findElements(By.xpath(".//div[@id='rb-calendar_onward_cal']/table//td"));
		System.out.println(obj.size());
		
		for(int i=0;i<obj.size();i++)
		{
			String date = obj.get(i).getText();
			System.out.println("Value present :"+date);
			if(date.equalsIgnoreCase("31"))
			{
				obj.get(i).click();
				break;
			
			}
		}

	}

}
