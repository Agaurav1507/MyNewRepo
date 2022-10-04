package WebPgeScripts;


import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
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
import Utilities.MyExcelUtility;
import Utilities.seleniumutility;
import WebPages.Kitelogin;

public class KiteScript extends seleniumutility {
	
	WebDriver driver=null;
	Kitelogin getkitelogin=null;
	ExtentReports report=null;
	ExtentTest test=null;
	MyExcelUtility meu=new MyExcelUtility();
	
	
	@BeforeTest
	
	public void starttest() {
		
		report=new ExtentReports(".\\ExtenReports\\kitereport.html");
		
		test=report.startTest("Kite Functionality");
	}
	
	@BeforeClass
	
	public void gettourl() throws IOException {
		
		String Url=meu.getcellvalue("Sheet1", 3, 0);
		
		driver=setup("chrome",Url);
		
	}
	
	@Test
	
	public void loginfunctionality() throws IOException, InterruptedException {
		
		getkitelogin=new Kitelogin(driver);
		
//		String Password=meu.getcellvalue("Sheet1", 3, 1);
//		
//		String Pin=meu.getcellvalue("Sheet1", 3, 2);
		
		String title=meu.getcellvalue("Sheet1", 3, 3);
		
		getkitelogin.login();
		
		Thread.sleep(3000);
		
		if(getcurrenttitleofapp().equals(title)) {
			
			test.log(LogStatus.PASS, "Either login was failed or title got changed");
			
			meu.UpdateCellValue("Sheet1", 3, 4, "Pass");
		} else {
			
			test.log(LogStatus.FAIL, test.addScreenCapture(takescreenshot(driver)),"Unsuccessfull");
			
			meu.UpdateCellValue("Sheet1", 3, 4, "Fail");
		}
	}
	
	@AfterClass
	
	public void closebrowser() {
		cleanup();
	}
	
	@AfterTest
	
	public void Endtest() {
		
		report.endTest(test);
		report.flush();
	}
	
	public String takescreenshot(WebDriver driver) throws IOException {
		
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File(".\\Screenshots\\Kitelogin"+System.currentTimeMillis()+".png");
		
		FileUtils.copyFile(src, dest);
		
		String filepath=dest.getAbsolutePath();
		return filepath;
	}

}
