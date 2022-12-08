package genericLib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshot {
	public WebDriver driver;
	public void getphoto(String name) throws Exception
	{
		Date dt=new Date();
		String currentdate=dt.toString().replaceAll(":", "-");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File(autoconstant.photopath+currentdate+name+".png");
		FileUtils.copyFile(src, des);
	}
}
