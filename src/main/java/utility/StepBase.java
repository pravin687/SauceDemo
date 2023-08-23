package utility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepBase {
	public World world;
	private WebDriver driver;
	
	public StepBase() throws IOException{
		driver=world.tb.launchDriver();
	}
	
	public void findele(By username) {
		driver.findElement((By) username);
	}

	public void explicitWait() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(null));
	}
	
}
