/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stqaprac8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author NARENDER KESWANI
 */
public class Stqaprac8 {

    /**
     * @param args the command line arguments
     */
    static WebDriver wd;

    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\NARENDER KESWANI\\Downloads\\chromedriver_win321\\chromedriver.exe");
        wd = new ChromeDriver();

        wd.get("https://narenderkeswani.com/stqap8.html");
Thread.sleep(3000);
        wd.findElement(By.name("fullname")).sendKeys("Narender Keswani");
Thread.sleep(3000);
        wd.findElement(By.name("submit")).click();
        Thread.sleep(3000);
        // Switching to Alert
        Alert alert = wd.switchTo().alert();

        // Capturing alert message.
        String alertMessage = wd.switchTo().alert().getText();
Thread.sleep(3000);
        // Displaying alert message
        System.out.println(alertMessage);
        Thread.sleep(2000);
        
    }

}
