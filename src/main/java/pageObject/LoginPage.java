package pageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.TestBase;
import utility.StepBase;

public class LoginPage{

	public StepBase sb;
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

private	By username=By.xpath("//*[@id='user-name']");
private	By password=By.xpath("//*[@id='password']");
private	By loginbtn=By.xpath("//*[@id='login-button']");
	
	public void loginurl() throws IOException {
		
		driver.get("https://www.saucedemo.com/");
	}
	
	
	public void setUsername() {
		sb.findele(username);
		sb.explicitWait();
		//driver.findElement(username).sendKeys("standard_user");
	}
	
	public void setPassword() {
		driver.findElement(password).sendKeys("secret_sauce");
	}
	
	public void clickOnLoginBtn() {
		driver.findElement(loginbtn).click();
	}
	
	public String homepageurl() {
		String s="https://www.saucedemo.com/inventory.html";
		return s;
	}
	
	public String validateHomepageurl() {
		return driver.getCurrentUrl();
	}
}
