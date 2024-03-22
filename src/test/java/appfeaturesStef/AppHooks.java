package appfeaturesStef;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import driverfactoryClass.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AppHooks 
{
	WebDriver driver;
	@Before
	public void initiateBrowser() throws IOException
	{
		Properties prop=new Properties(); 
		String path =System.getProperty("user.dir")+"//src//test//resources//config.properties";
		FileInputStream fis=new FileInputStream(path);
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		DriverFactory df=new DriverFactory();
		driver = df.initBrowser(browserName);
		// maximize 
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}

}
