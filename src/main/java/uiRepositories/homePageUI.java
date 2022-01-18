package uiRepositories;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import PageObjects.homePageObjects;
import PageObjects.navigateClass;
import ReusableComponents.driverConfig;

public class homePageUI extends driverConfig{
	
	public ExtentReports reporte;
	public ExtentTest logger;
	
	public WebDriver driver;
	
	private static Logger log = Logger.getLogger(homePageUI.class);
	
	public void siteNavigation(ExtentTest logger1) throws IOException {
		this.logger=logger1;
		PropertyConfigurator.configure(".//src//main//java//Utilities//Properties//log4j.properties");
		driver=driverConfiguration();
		//Navigation to site
		navigateClass nc=new navigateClass(driver);
		nc.navigate().to(prop.getProperty("URL"));
		//Extentreports method
		logger.pass("Navigated to site");
		//Log4jMethod
		log.debug("PASS:Navigated to site");
		driver.manage().window().maximize();
	}
	
	public static homePageObjects hpo;
	public void getTitle() {
		//Get title
		String title=driver.getTitle();
		String expected_title=prop.getProperty("expected_title");
		if(title.equalsIgnoreCase(expected_title))
		{
			//Extentreports method
			logger.pass("Website title matches as expected");
			//Log4jMethod
			log.debug("PASS:Website title matches as expected");
			Assert.assertTrue(true);
		}else {
			//Extentreports method
			logger.fail("Website title does not match as expected");
			//Log4jMethod
			log.debug("FAIL:Website title does not match as expected");
			Assert.assertTrue(false);
		}
	}
	
	public void validPageElement() {
		hpo=new homePageObjects(driver);
		//Get element
		WebElement text=hpo.validateText();
		if(text.getText() != null)
		{
			//Extentreports method
			logger.pass("'On-demand Cabs?' element exists");
			//Log4jMethod
			log.debug("PASS:'On-demand Cabs?' element exists");
			Assert.assertTrue(true);
		}else {
			//Extentreports method
			logger.fail("'On-demand Cabs?' element does not exists");
			//Log4jMethod
			log.debug("FAIL:'On-demand Cabs?' element does not exists");
			Assert.assertTrue(false);
		}
	}
	
}
