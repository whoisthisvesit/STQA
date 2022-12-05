/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NARENDER KESWANI
 */
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class P3 {
	
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\NARENDER KESWANI\\Downloads\\chromedriver_win321\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://narenderkeswani.com/stqa.html");

		// navigates to the page consisting an iframe
		driver.manage().window().maximize();
		Thread.sleep(5000);

		System.out.println("Switching to iframe");
                driver.switchTo().frame("stqa");
                Thread.sleep(5000);
                
                System.out.println("Switched iframe sucessfully!");
                
                System.out.println("Playing video!");

                driver.findElement(By.xpath("/html/body/div/div/div[4]/button")).click();
		Thread.sleep(2000);
                
                System.out.println("Sharing video!");

                driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[3]/button[2]")).click();
		Thread.sleep(5000);

		System.out.println("Finished");
	}
}
