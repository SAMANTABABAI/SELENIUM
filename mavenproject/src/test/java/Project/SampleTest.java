package Project;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest {
	@Test
	public void testcase()
	{
		Reporter.log("i am a bad boy",true);
	}
	@Test
	public void testcase1()
	{
 ChromeDriver driver=new ChromeDriver();
 driver.get("https://www.flipkart.com/");
		 
	}
   @Test
   public void testcase2()
   {
	   ChromeDriver driver= new ChromeDriver();
	   driver.get("https://www.amazon.in/");
   }
}



