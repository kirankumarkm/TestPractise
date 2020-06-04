package JavaInterview;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HashMapUse {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.firefox.marionette","F:\\eclipse-java-luna-SR2-win32-x86_64\\geckodriver-v0.11.1-win64.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://classic.crmpro.com/index.html"); // enter URL
		
		System.out.println(getCredentialsMap());
		
		driver.findElement(By.name("username")).sendKeys(getUserName("username",0));
		driver.findElement(By.name("password")).sendKeys(getUserName("username",1));
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(6000);
		driver.close();
	}
	
	public static HashMap<String,String> getCredentialsMap()
	{
		HashMap<String,String> usemap = new HashMap<String,String>();
		
		usemap.put("username", "kumarkk:t@123");
		return usemap;
	}
	
	public static String getUserName(String role,int index)
	{
		String credentials = getCredentialsMap().get(role);
		return credentials.split(":")[index];
	}
	public static  String getUserpwd(String role)
	{
		String credentials = getCredentialsMap().get(role);
		return  credentials.split(":")[1];
	}

}
