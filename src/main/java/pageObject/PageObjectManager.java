package pageObject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public WebDriver driver;
	public LoginPage lp;
	public InventoryPage ip;
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	public LoginPage getLoginPage() {
		lp=new LoginPage(driver);
		return lp;
		
	}
	
	public InventoryPage getInventoryPage() {
		ip=new InventoryPage(driver);
		return ip;
	}
	

}
