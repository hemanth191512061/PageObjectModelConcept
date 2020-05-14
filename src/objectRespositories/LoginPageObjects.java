package objectRespositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	WebDriver driver;

	
	By username= By.xpath("//input[@name=\"username\"]");
	By password= By.xpath("(//label)[4]/input");
	
	public LoginPageObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement username() {
		return driver.findElement(username);
	}
	
	public WebElement password() {
		return driver.findElement(password);
	}

}
