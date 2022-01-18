package TestOperations;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import ReusableComponents.driverConfig;
import ReusableComponents.extentReports;
import uiRepositories.footerPageUI;
import uiRepositories.homePageUI;
import uiRepositories.loginPageUI;
import uiRepositories.selectCarPageUI;

public class testRunner extends driverConfig{
	public ExtentReports report;
	public ExtentTest logger;
	public homePageUI hpi=new homePageUI();
	public loginPageUI lpi=new loginPageUI();
	public selectCarPageUI scpi=new selectCarPageUI();
	public footerPageUI fpi=new footerPageUI();
	static ExtentReports extent = extentReports.ExtentReports();
	
	@Test(priority=1)
	public void homePageGetTitle() throws IOException, InterruptedException {
		try {
		logger=extent.createTest("Home Page-Get Title");
		hpi.siteNavigation(logger);
		hpi.getTitle();
		logger.pass("SUCCESSFULL");
		}catch(Exception e) {
			logger.fail("UNSUCCESSFULL");
		}
	}
	@Test(priority=2)
	public void homePageElement() throws IOException, InterruptedException {
		try {
		logger=extent.createTest("Home Page-Element Click");
		hpi.siteNavigation(logger);
		hpi.validPageElement();
		logger.pass("SUCCESSFULL");
		}catch(Exception e) {
			logger.fail("UNSUCCESSFULL");
		}
	}
	@Test(priority=3)
	public void validAgentDetails() throws InterruptedException, IOException {
		try {
		logger=extent.createTest("Login Page-Agent Login");
		lpi.siteNavigation(logger);
		lpi.agentLogin();
		logger.pass("SUCCESSFULL");
		}catch(Exception e) {
			logger.fail("UNSUCCESSFULL");
		}
	}
	@Test(priority=4)
	public void validcustomerLoginDetails() throws InterruptedException, IOException {
		try {
		logger=extent.createTest("Login Page-Customer Login");
		lpi.siteNavigation(logger);
		lpi.customerLogin();
		logger.pass("SUCCESSFULL");
		}catch(Exception e) {
			logger.fail("UNSUCCESSFULL");
		}
	}
	@Test(priority=5)
	public void validforgotPasswordDetails() throws InterruptedException, IOException {
		try {
		logger=extent.createTest("Login Page-Forgot Password");
		lpi.siteNavigation(logger);
		lpi.forgotPassword();
		logger.pass("SUCCESSFULL");
		}catch(Exception e) {
			logger.fail("UNSUCCESSFULL");
		}
	}
	@Test(priority=6)
	public void validonewayBooking() throws InterruptedException, IOException {
		try {
		logger=extent.createTest("Select car page-Oneway Booking");
		scpi.siteNavigation(logger);
		scpi.oneWayBooking();
		logger.pass("SUCCESSFULL");
		}catch(Exception e) {
			logger.fail("UNSUCCESSFULL");
		}
	}
	@Test(priority=7)
	public void validroundtripBooking() throws InterruptedException, IOException {
		try {
		logger=extent.createTest("Select car page-RoundTrip Booking");
		scpi.siteNavigation(logger);
		scpi.roundTripBooking();
		logger.pass("SUCCESSFULL");
		}catch(Exception e) {
			logger.fail("UNSUCCESSFULL");
		}
	}
	@Test(priority=8)
	public void validlocalTripBooking() throws InterruptedException, IOException {
		try {
		logger=extent.createTest("Select car page-Local Trip Booking");
		scpi.siteNavigation(logger);
		scpi.localBooking();
		logger.pass("SUCCESSFULL");
		}catch(Exception e) {
			logger.fail("UNSUCCESSFULL");
		}
	}
	@Test(priority=9)
	public void validFromAirportTripBooking() throws InterruptedException, IOException {
		try {
		logger=extent.createTest("Select car page-From Airport Booking");
		scpi.siteNavigation(logger);
		scpi.cabFromAirportBooking();
		logger.pass("SUCCESSFULL");
		}catch(Exception e) {
			logger.fail("UNSUCCESSFULL");
		}
	}
	@Test(priority=10)
	public void validToAirportTripBooking() throws InterruptedException, IOException {
		try {
		logger=extent.createTest("Select car page-To Airport Booking");
		scpi.siteNavigation(logger);
		scpi.cabtoAirportBooking();
		logger.pass("SUCCESSFULL");
		}catch(Exception e) {
			logger.fail("UNSUCCESSFULL");
		}
	}
	@Test(priority=11)
	public void validContactDetails() throws IOException, InterruptedException {
		try {
		logger=extent.createTest("Footer page-Contact Us");
		fpi.siteNavigation(logger);
		fpi.contactUs();
		logger.pass("SUCCESSFULL");
		}catch(Exception e) {
			logger.fail("UNSUCCESSFULL");
		}
	}
	@Test(priority=12)
	public void validbloggerSocialLinkDetails() throws IOException, InterruptedException {
		try {
		logger=extent.createTest("Footer page-Social Link");
		fpi.siteNavigation(logger);
		fpi.bloggerSocailLink();
		logger.pass("SUCCESSFULL");
		}catch(Exception e) {
			logger.fail("UNSUCCESSFULL");
		}
	}
	@Test(priority=13)
	public void validAboutDetails() throws IOException, InterruptedException {
		try {
		logger=extent.createTest("Footer page-About Us");
		fpi.siteNavigation(logger);
		fpi.aboutUs();
		logger.pass("SUCCESSFULL");
		}catch(Exception e) {
			logger.fail("UNSUCCESSFULL");
		}
	}
	@Test(priority=14)
	public void validcabTypeDetails() throws InterruptedException, IOException {
		try {
		logger=extent.createTest("Footer page-Sitemap Cab  Type");
		fpi.siteNavigation(logger);
		fpi.siteMapCabType();
		logger.pass("SUCCESSFULL");
		}catch(Exception e) {
			logger.fail("UNSUCCESSFULL");
		}
	}
	@Test(priority=15)
	public void validcarRentalDetails() throws InterruptedException, IOException {
		try {
		logger=extent.createTest("Footer page-Car rental");
		fpi.siteNavigation(logger);
		fpi.carRentalCitiies();
		logger.pass("SUCCESSFULL");
		}catch(Exception e) {
			logger.fail("UNSUCCESSFULL");
		}
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	@AfterSuite
	public void reportClose() {
		extent.flush();
	}
}
