/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stqaprac6;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author NARENDER KESWANI
 */
public class StqaPrac6 {

    /**
     * @param args the command line arguments
     */
    static WebDriver wd;
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\NARENDER KESWANI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		wd = new ChromeDriver();

		wd.get("https://maarula.in/dashboard/");
                
                wd.manage().window().maximize();
		Thread.sleep(5000);
                
		wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
                
		wd.findElement(By.name("log")).sendKeys("narender.rk10@gmail.com");
		Thread.sleep(2000);
		wd.findElement(By.id("user_pass")).sendKeys("---");
		Thread.sleep(2000);

		wd.findElement(By.id("wp-submit")).click();
		Thread.sleep(2000);	
                
                wd.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[2]/div[1]/p/a")).click();
                Thread.sleep(2000);
                
                wd.findElement(By.cssSelector("input[name='phone_number']")).sendKeys("9320907041");
		Thread.sleep(2000);

                wd.findElement(By.cssSelector("input[name='phone_number']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);

                wd.navigate().to("https://maarula.in/dashboard/logout");                
		Thread.sleep(2000);

    }
    
}
