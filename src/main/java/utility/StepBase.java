package utility;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StepBase {
	public World world;
	private WebDriver driver;
	
	public StepBase() throws IOException{
		driver=world.tb.launchDriver();
	}
	
	public void findele(By username) {
		driver.findElement((By) username);
	}


	
}
