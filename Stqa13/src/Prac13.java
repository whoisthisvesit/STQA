import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Prac13 {
	
	WebDriver wd;
	@Test(dataProvider="testdata")
	public void demoClass(String email, String password) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\NARENDER KESWANI\\Downloads\\chromedriver_win321\\chromedriver.exe");
	wd = new ChromeDriver();

	
	wd.get("https://maarula.in/dashboard/");
            
	wd.manage().window().maximize();
	Thread.sleep(5000);
	wd.findElement(By.name("log")).sendKeys(email);
	Thread.sleep(2000);
	wd.findElement(By.id("user_pass")).sendKeys(password);
	Thread.sleep(2000);
	wd.findElement(By.id("wp-submit")).click();
	Thread.sleep(2000);
	String str =
	wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[3]/p/span[1]")).getText();
	if(str=="Completed Courses")
	{
	System.out.println("Login Successful");
	}
	else
	{
	System.out.println("Login Failed");
	}
	
	}
	
	@AfterMethod
	void ProgramTermination() {
		wd.quit();
	}
	
	@DataProvider(name="testdata")
	public Object[][] testDataExample(){
		ReadExcelFile configuration = new ReadExcelFile("C:\\Users\\NARENDER KESWANI\\Downloads\\XYZ.xlsx");

		int rows = configuration.getRowCount(0);
		
		Object[][]signin_credentials = new Object[rows][2];
		
		for(int i=0;i<rows;i++)
		{
			signin_credentials[i][0] = configuration.getData(0, i, 0);
			signin_credentials[i][1] = configuration.getData(0, i, 1);
		}
		return signin_credentials;
	}



}
