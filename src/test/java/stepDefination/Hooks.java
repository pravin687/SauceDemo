package stepDefination;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utility.World;

public class Hooks {
	
	public World world;
	private static ExtentReports et;
	public Hooks(World world) {
		this.world=world;
		
	}
	
	
	
	@Before
	public void start() throws IOException {
		world.tb.launchDriver();
	}
	
  @After
	public void closeDriver() throws IOException {
		world.tb.launchDriver().quit();
	}
  
  public String getBase64ScreenShot() throws WebDriverException, IOException {
	  return ((TakesScreenshot) world.tb.launchDriver()).getScreenshotAs(OutputType.BASE64);
  }
  
  
  @AfterStep
  public void afterstep(Scenario sc) throws WebDriverException, IOException {
	  if(sc.isFailed()) {
	        ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64ScreenShot()).build());
		  
	  }

	  
  }
  
}
