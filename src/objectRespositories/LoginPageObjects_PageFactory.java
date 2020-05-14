package objectRespositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects_PageFactory {
	
	WebDriver driver;

	
	@FindBy(name="username")
	WebElement Username;
	@FindBy(xpath="(//label)[4]/input")
	WebElement Password;
	
	public LoginPageObjects_PageFactory(WebDriver driver) {
		this.driver=driver;
	   PageFactory.initElements(driver, this);
	}
	public WebElement username() {
		return Username;
	}
	
	public WebElement password() {
		return Password;
	}

}
