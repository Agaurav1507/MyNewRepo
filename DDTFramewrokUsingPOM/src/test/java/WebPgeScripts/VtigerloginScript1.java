package WebPgeScripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utilities.ExcelUtility;
import Utilities.MyExcelUtility;
import Utilities.seleniumutility;
import WebPages.Vtigerhome1;
import WebPages.Vtigerleads1;
import WebPages.Vtigerlogin1;

public class VtigerloginScript1 extends seleniumutility {

	WebDriver driver = null;

	Vtigerlogin1 getvtigerlogin = null;

	Vtigerhome1 getvtigerhome = null;

	Vtigerleads1 getvtigerleads = null;
	
	MyExcelUtility meu=new MyExcelUtility();

	static ExtentReports report;

	static ExtentTest test;

	@BeforeTest

	public void starttest() {

		report = new ExtentReports(".\\ExtenReports\\VtigerExtentReport.html");

		test = report.startTest("VtigerLeadTest");

	}

	@BeforeClass
	public void gettourl() throws IOException {

		String url = meu.getcellvalue("Sheet1", 2, 0);

		driver = setup("chrome", url);

		getvtigerlogin = new Vtigerlogin1(driver);

		getvtigerhome = new Vtigerhome1(driver);

		getvtigerleads = new Vtigerleads1(driver);

	}

	@Test(priority = 1)

	public void loginfunctionality() throws IOException {
		
		//MyExcelUtility meu=new MyExcelUtility();
		
		String Username = meu.getcellvalue("Sheet1", 2, 1);

		String Password = meu.getcellvalue("Sheet1", 2, 2);
		
		String title=meu.getcellvalue("Sheet1", 2, 3);

		getvtigerlogin.loginprocess(Username, Password);

		if (getcurrenttitleofapp().equals(title)) {
			
			meu.UpdateCellValue("Sheet1", 2, 4, "Good");

			test.log(LogStatus.PASS, "Successfull");
		}

		else {
			test.log(LogStatus.FAIL, test.addScreenCapture(takescreenshot(driver)), "Unsuccessfull");
			
			meu.UpdateCellValue("Sheet1", 2, 4, "Fail");
		}
	}

	@Test(priority = 2)

	public void homepagefuctionality() {

		getvtigerhome.clickonthreelines();

		getvtigerhome.reachtocreateleads();
	}

	@Test(priority = 3)

	public void generateleads() {

		getvtigerleads.clickoncreatelead();

		getvtigerleads.giveleaddetails("Automation", "Software");

		getvtigerleads.leadsource();

		getvtigerleads.industry();

		getvtigerleads.allotherformalities();

		Assert.assertTrue(getvtigerleads.checkleadcreation(), "Lead creation is failed");

	}

	@AfterClass

	public void closebrowser() {

		cleanup();
	}

	@AfterTest

	public void testend() {

		report.endTest(test);
		report.flush();
	}

	public String takescreenshot(WebDriver driver) throws IOException {

		File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File dest = new File(".\\Screenshots\\Vtigerloginpage" + System.currentTimeMillis() + ".png");

		String filapath = dest.getAbsolutePath();

		FileUtils.copyFile(srcfile, dest);

		return filapath;

	}

}
