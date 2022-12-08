package genericLib;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public WebDriver driver;
	@BeforeMethod
	public void openApp() throws Exception
	{
		PropertieFileData pdata=new PropertieFileData();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.data("url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void closeApp()
	{
		driver.quit();
	}
	

}
