import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ValidationTesting {
	WebDriver wd;

	@Test(priority = 1)
	public void myInfo() {
		wd.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/div[2]/table/tbody/tr[1]/td/table/tbody/tr[ 2]/td[1]/a[1]"))
				.click();
	}

	@Test(priority = 2)
	public void logout() {
		wd.findElement(By.linkText("Logout")).click();
	}

	@BeforeClass
	public void loginOHM() {
		wd.get("http://demo.frontaccounting.eu/index.php");
		wd.findElement(By.xpath("/html/body/div/form/center[2]/input")).click();
	}

	@BeforeSuite
	public void openBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\NARENDER KESWANI\\Downloads\\chromedriver_win321\\chromedriver.exe");
	wd = new ChromeDriver();
}
}
