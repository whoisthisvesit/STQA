/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stqaprac7;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author NARENDER KESWANI
 */
public class StqaP7A {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\NARENDER KESWANI\\Downloads\\chromedriver_win32\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String eTitle = "Maarula Classes – Best MCA NIMCET Classes";
        String aTitle = "";

        // launch Chrome and redirect it to the Base URL
        driver.get("https://maarula.in/");
        //Maximizes the browser window
        driver.manage().window().maximize();
        //get the actual value of the title
        aTitle = driver.getTitle();
        //compare the actual title with the expected title
        if (aTitle.equals(eTitle)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        //close browser
        driver.close();

    }

}
