/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stqaprac9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author NARENDER KESWANI
 */
public class StqaPrac9 {

    /**
     * @param args the command line arguments
     */
    
    static WebDriver wd;
    
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\NARENDER KESWANI\\Downloads\\chromedriver_win321\\chromedriver.exe");
        wd = new ChromeDriver();

        wd.get("https://narenderkeswani.com/stqa9.html");

                Select s = new Select(wd.findElement(By.name("fromStn")));
		Select t = new Select(wd.findElement(By.name("toStn")));
		s.selectByVisibleText("KALYAN JN");
		t.selectByVisibleText("GANAGAPUR ROAD");

               String sMessage = s.getFirstSelectedOption().getText();
               String tMessage = t.getFirstSelectedOption().getText();

               System.out.println(sMessage);
               System.out.println(tMessage);
               
               Thread.sleep(2000);
               
               
               Select list = new Select(wd.findElement(By.name("favFood")));

		if(list.isMultiple())
		{
			list.selectByIndex(0);
		//	list.selectByValue("vadapav");
			list.selectByVisibleText("Paneer");
                        System.out.println("Selected:");
                        System.out.println(list.getAllSelectedOptions().get(0));
			Thread.sleep(5000);
			list.deselectByIndex(3);
			list.deselectAll();
                        System.out.println("Deselected:");
                        System.out.println(list.getAllSelectedOptions());
		}

    }
    
}
