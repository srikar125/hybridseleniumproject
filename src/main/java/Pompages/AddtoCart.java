package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCart {
	@FindBy(id="add")
	private WebElement plusbtn;
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addtocartbtn;
	
	public AddtoCart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}

	public WebElement getAddtocartbtn() {
		return addtocartbtn;
	}
	
	public void addtocartclick()
	{
		addtocartbtn.click();
	}
}
