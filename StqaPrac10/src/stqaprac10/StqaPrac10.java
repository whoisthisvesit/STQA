/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stqaprac10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author NARENDER KESWANI
 */
public class StqaPrac10 {

    /**
     * @param args the command line arguments
     */
    static WebDriver wd;

    public static void main(String[] args) {
        // TODO code application logic here

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\NARENDER KESWANI\\Downloads\\chromedriver_win32\\chromedriver.exe");
        wd = new ChromeDriver();

        wd.get("https://narenderkeswani.com/stqa10.html");

        WebElement l = wd.findElement(By.name("fullname"));
        l.sendKeys("Narender Keswani");
        String val = l.getAttribute("value");
        System.out.println("Entered fullname is: " + val);

        WebElement radio1 = wd.findElement(By.id("flexRadioDefault1"));
        WebElement radio2 = wd.findElement(By.id("flexRadioDefault2"));
        WebElement radio3 = wd.findElement(By.id("flexRadioDefault3"));

        //Radio Button3 is selected
        radio3.click();
        System.out.println("Radio Button Option 3 (transgender) Selected");

        //Radio Button1 is de-selected and Radio Button2 is selected
        radio2.click();
        System.out.println("Radio Button Option 2 (Female) Selected");

        //Radio Button2 is de-selected and Radio Button1 is selected
        radio1.click();
        System.out.println("Radio Button Option 1  (Male) Selected");

        // Selecting CheckBox
        WebElement option1 = wd.findElement(By.id("flexCheckDefault4"));
        WebElement option2 = wd.findElement(By.id("flexCheckDefault5"));
        WebElement option3 = wd.findElement(By.id("flexCheckDefault6"));
        WebElement option4 = wd.findElement(By.id("flexCheckDefault7"));
        WebElement option5 = wd.findElement(By.id("flexCheckDefault8"));

        // This will Toggle the Check box
        option1.click();

        // Check whether the Check box is toggled on
        if (option1.isSelected()) {
            System.out.println("Checkbox 1 (Backend) is Toggled On");
        } else {
            System.out.println("Checkbox 1 (Backend) is Toggled Off");
        }

        option2.click();

        if (option2.isSelected()) {
            System.out.println("Checkbox 2 (Frontend) is Toggled On");
        } else {
            System.out.println("Checkbox 2 (Frontend) is Toggled Off");
        }

        option5.click();

        if (option5.isSelected()) {
            System.out.println("Checkbox 5 (Data Engineering) is Toggled On");
        } else {
            System.out.println("Checkbox 5 (Data Engineering) is Toggled Off");
        }

        option5.click();

        if (option5.isSelected()) {
            System.out.println("Checkbox 5 (Data Engineering) is Toggled On");
        } else {
            System.out.println("Checkbox 5 (Data Engineering) is Toggled Off");
        }

    }

}
