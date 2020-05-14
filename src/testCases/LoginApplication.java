package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objectRespositories.LoginPageObjects_PageFactory;

public class LoginApplication{
	
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver web = new ChromeDriver();
		web.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		LoginPageObjects_PageFactory login= new LoginPageObjects_PageFactory(web);
		web.get("https://www.instagram.com/accounts/emailsignup/");
		login.username().sendKeys("hemanth");
		login.password().sendKeys("nani");
	

}
}

