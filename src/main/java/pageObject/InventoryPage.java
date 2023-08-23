package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
	
	private WebDriver driver;
	
	public InventoryPage(WebDriver driver) {
		this.driver=driver;
	}
	
By backPack=By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']");
	
By removebackPack=By.xpath("//*[@id='remove-sauce-labs-backpack']");

public void clickOnBackPack() {
driver.findElement(backPack).click();
}

public String getTextOnBackPackBtn() {
return	driver.findElement(removebackPack).getText();
}
}
