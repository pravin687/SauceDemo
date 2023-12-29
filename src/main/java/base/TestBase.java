package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public WebDriver driver;
	public static Properties prop;

	public WebDriver launchDriver() throws IOException {
		File f=new File(System.getProperty("user.dir")+"//src//test//resource//config.properties");
		FileInputStream fs=new FileInputStream(f);
		prop=new Properties();
		prop.load(fs);
		
		String browsername=(String) prop.get("browser");
		if(driver==null) {
			if(browsername.equalsIgnoreCase("chrome")){
					driver=new ChromeDriver();}
			else if(browsername.equalsIgnoreCase("firefox")){
				driver=new FirefoxDriver();}
			else if(browsername.equalsIgnoreCase("edge")){
				driver=new EdgeDriver();}
			
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		return driver;
		
	}
	
	
	
}
