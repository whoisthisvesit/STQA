/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stqaprac7;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author NARENDER KESWANI
 */
public class StqaP7B {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\NARENDER KESWANI\\Downloads\\chromedriver_win32\\chromedriver.exe");

        driver = new ChromeDriver();
        // explicit wait - to wait for the compose button to be click-able
        Duration durationInMinutes = Duration.ofMinutes(30);
        WebDriverWait wait = new WebDriverWait(driver, durationInMinutes);

        // launch Chrome and redirect it to the Base URL
        String eTitle = "Dashboard – Maarula Classes";
        String aTitle = "";
        // launch Chrome and redirect it to the Base URL
        driver.get("https://maarula.in/dashboard/");
        //Maximizes the browser window
        driver.manage().window().maximize();
        //get the actual value of the title
        aTitle = driver.getTitle();
        //compare the actual title with the expected title

        if (aTitle.contentEquals(eTitle)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        driver.findElement(By.name("log")).sendKeys("narender.rk10@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.id("user_pass")).sendKeys("---");
        Thread.sleep(2000);

        driver.findElement(By.id("wp-submit")).click();
        Thread.sleep(2000);

        WebElement webElement;
        webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));
        webElement.click();

    }
}
