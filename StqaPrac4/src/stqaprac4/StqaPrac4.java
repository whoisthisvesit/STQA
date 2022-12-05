/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stqaprac4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 *
 * @author NARENDER KESWANI
 */
public class StqaPrac4 {

    /**
     * @param args the command line arguments
     */
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
        System.setProperty("webdriver.chrome.driver","C:\\Users\\NARENDER KESWANI\\Downloads\\chromedriver_win321\\chromedriver.exe");
        driver = new ChromeDriver();

        String appUrl = "https://narenderkeswani.com/";
        driver.get(appUrl);
        Thread.sleep(3000);

        // Click on Contact Us
        ///html/body/div/div/div/div[1]/div/header/ul/li[6]/a
        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/header/ul/li[6]/a")).click();
        Thread.sleep(3000);

        // Go back to Home Page
        driver.navigate().back();
        Thread.sleep(3000);

        // Go forward to  Contact Us
        driver.navigate().forward();
        Thread.sleep(3000);

        // Go back to Home page
        driver.navigate().to(appUrl);
        Thread.sleep(3000);

        // Refresh browser
        driver.navigate().refresh();
        Thread.sleep(3000);

        // Close browser
        driver.close();
    }
    
}
