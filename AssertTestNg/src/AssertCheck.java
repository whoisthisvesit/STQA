import org.testng.annotations.Test;

import java.io.FileInputStream;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertCheck {


static WebDriver driver;

@BeforeTest
public void getDrive()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\NARENDER KESWANI\\Downloads\\chromedriver_win321\\chromedriver.exe");
driver = new ChromeDriver();
}
@Test (priority = 0)
public void CloseBrowser() {
driver.close();
Reporter.log("Driver Closed After Testing");
}

@Test (priority = -1)
public void OpenBrowser() {
Reporter.log("This test verifies the current selenium compatibility with TestNG by launching the chrome driver");
       Reporter.log("Launching Google Chrome Driver version 81 for this test");
       
       driver.get("https://demo.guru99.com/test/login.html");
       SoftAssert softassert = new SoftAssert();
       Reporter.log("The website used was DemoQA for this test", true);
       String expectedTitle = "Free QA Automation Tools For Everyone";
       String originalTitle = driver.getTitle();
       softassert.assertEquals(originalTitle, expectedTitle);
       System.out.println("*** Checking For The Second Title ***");
// Checking title for ToolsQA � Demo Website to Practice Automation � Demo Website to Practice Automation
       softassert.assertEquals(originalTitle, "Login Page" );
       softassert.assertAll();
  }
}
