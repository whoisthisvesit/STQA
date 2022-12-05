import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegressionTesting {
	public class RegressionTest {
		WebDriver driver;

		@Test(groups = { "sanity", "regression" }, priority = 1)

		public void launchBrowser() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\NARENDER KESWANI\\Downloads\\chromedriver_win321\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}

		@Test(groups = { "sanity", "regression" }, priority = 6)

		public void closeBrowser() {
			driver.close();
		}

		@Test(groups = { "sanity" }, priority = 2)

		public void verifyGoogleTitle() {
			driver.get("https://www.google.com/");
			Assert.assertEquals("Google", driver.getTitle());
		}

		@Test(groups = { "regression" }, priority = 3)

		public void verifyYahooTitle() {
			driver.get("https://in.yahoo.com/");
			Assert.assertEquals("Yahoo Search - Web Search", driver.getTitle());
		}

		@Test(groups = { "sanity", "regression" }, priority = 4)

		public void verifyGcritTitle() {
			driver.get("http://www.gcrit.com/build3/admin/");
			Assert.assertEquals("gcrit.com is for sale | HugeDomains", driver.getTitle());
		}

		@Test(groups = { "regression" }, priority = 5)

		public void verifyGcreddyTitle() {
			driver.get("http://www.gcreddy.com/");
			Assert.assertEquals(
					"Software Testing – A blog about Manual Testing, Selenium, UFT/QTP, SQL, Java and Python Step by Step Tutorials by G C Reddy.",
					driver.getTitle());
		}
	}

}
