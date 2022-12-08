package genericLib;

import java.util.Set;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Webdriverutilities {

	public void dropdown(WebElement ele,String text)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	
	public void mousehover(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.moveToElement(ele).build().perform();
	}
	public void doubleclick(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.doubleClick(ele).build().perform();
	}
	public void draganddrop(WebDriver driver,WebElement src,WebElement des)
	{
		Actions a=new Actions(driver);
		a.dragAndDrop(src, des).build().perform();
	}
	public void switchframe(WebDriver driver)
	{
		driver.switchTo().frame(0);
		driver.switchTo().defaultContent();
	}
	public void switchback(WebDriver driver)
	{
			driver.switchTo().defaultContent();
	}
	
	public void alertpopup(WebDriver driver)
	{
			driver.switchTo().alert().accept();
	}
	public void scrollbar(WebDriver driver,int x,int y)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("Windows.scrollBy("+x+","+y+")");
	}
	public void switchtab(WebDriver driver)
	{
			Set<String> child=driver.getWindowHandles();
			for(String b:child)
				driver.switchTo().window(b);
	}

	
	
	
}
