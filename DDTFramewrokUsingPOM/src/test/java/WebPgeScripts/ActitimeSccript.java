package WebPgeScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.model.Log;

import Utilities.MyExcelUtility;
import Utilities.seleniumutility;
import WebPages.ActitimeLogin;

public class ActitimeSccript extends seleniumutility {

	WebDriver driver=null;

	ActitimeLogin getactitime=null;

	MyExcelUtility meu = new MyExcelUtility();
	
	static ExtentReports reports;
	
	static ExtentTest test;
	
	@BeforeTest
	
	public void starttest() {
		
		reports=new ExtentReports(".\\ExtenReports\\Actitime.html");
		
		test=reports.startTest("ActiTimeFunctionality");
	}

	@BeforeClass

	public void openbrowser() throws IOException {
		
		String url = meu.getcellvalue("Sheet1", 1, 0);

		driver = setup("chrome", url);

	}

	@Test(priority=1)

	public void loginfunctionality() throws IOException {
		
		getactitime = new ActitimeLogin(driver);
		
		String Username=meu.getcellvalue("Sheet1", 1, 1);
		
		String Password=meu.getcellvalue("Sheet1", 1, 2);
		
		getactitime.login(Username,Password);
		
	}
	
	@Test
	
	public void validate() throws IOException {
		
		String title=meu.getcellvalue("Sheet1", 0, 3);
		
		if(getcurrenttitleofapp().equals(title)) {
			
			meu.UpdateCellValue("Sheet1", 0, 4, "Pass");
			
			test.log(LogStatus.PASS, "Succesfull");
		}
		else {
			
			test.log(LogStatus.FAIL, test.addScreenCapture(takeScreenshot(driver)),"Unsuccesfull");
			
			meu.UpdateCellValue("Sheet1", 1, 4, "Fail");
		}
	}
	
	@AfterClass
	
	public void closebrowser() {
		
		cleanup();
	}
	
	@AfterTest
	
	public void endtest() {
		
		reports.endTest(test);
		
		reports.flush();
	}
	
	public String takeScreenshot(WebDriver driver) throws IOException {
		
	File srcfile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	
	File destfile=new File(".\\Screenshots\\Actitime"+System.currentTimeMillis()+".png");
	
	String filepath=destfile.getAbsolutePath();
	
	FileUtils.copyFile(srcfile, destfile);
	
	return filepath;
		
		
	}

}
