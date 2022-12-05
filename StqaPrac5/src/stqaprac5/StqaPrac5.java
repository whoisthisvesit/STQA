/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stqaprac5;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author NARENDER KESWANI
 */
public class StqaPrac5 {

    /**
     * @param args the command line arguments
     */
    static WebDriver wd;

    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\NARENDER KESWANI\\Downloads\\chromedriver_win321\\chromedriver.exe");
        wd = new ChromeDriver();

        wd.get("https://narenderkeswani.com/stqap5.html");
        Thread.sleep(2000);

        wd.findElement(By.id("flexRadioDefault1")).click();
        Thread.sleep(2000);

        wd.findElement(By.id("buttoncheck")).click();
        Thread.sleep(2000);

        List<WebElement> elements = wd.findElements(By.name("gender"));

        System.out.println("Number of elements:" + elements.size());

        Thread.sleep(2000);

        for (int i = 0; i < elements.size(); i++) {
            System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
            Thread.sleep(2000);
        }

    }

}
