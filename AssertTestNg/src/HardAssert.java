import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HardAssert {
	static WebDriver driver;
//	 WebDriver wd;
	
	@BeforeTest
	public void getDrive()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NARENDER KESWANI\\Downloads\\chromedriver_win321\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	// "D:\\MCA\\STQA\\chromedriver_win32\\chromedriver.exe");
//		+ "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
//		WebDriver wd = new ChromeDriver(); 
	
	
	@AfterTest
	public void CloseBrowser() {
		driver.close();
		Reporter.log("Driver Closed After Testing");
	}
	@Test 
	public void OpenBrowser() {
		
	        driver.get("https://demo.guru99.com/test/login.html");	        
	        Reporter.log("The website used was test", true);
	        String expectedTitle = "Free QA Automation Tools For Everyone";
	        String originalTitle = driver.getTitle();
	        Assert.assertEquals(originalTitle, expectedTitle);
  }
}
