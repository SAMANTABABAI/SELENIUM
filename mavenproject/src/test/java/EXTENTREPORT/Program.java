package EXTENTREPORT;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Program {
@Test
public void report()
{
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	String screen_shot = driver.getScreenshotAs(OutputType.BASE64);
ExtentSparkReporter esp= new ExtentSparkReporter("ECTENTREPORT//ExtentReport.html");
ExtentReports er= new ExtentReports();
er.attachReporter(esp);
ExtentTest test= er.createTest("program");
test.log(Status.INFO,"report of testcase is generated");

test.addScreenCaptureFromBase64String(screen_shot);
er.flush();

}

}