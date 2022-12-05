/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stqaprac2;

/**
 *
 * @author NARENDER KESWANI
 */

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class STQAPrac2 {

	static WebDriver wd;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NARENDER KESWANI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		Scanner sc = new Scanner(System.in);
		System.out.println("1.ChromeBrowser \n2. Firefox Broswer");
		System.out.println("Choice");
		int ch = sc.nextInt();
		sc.close();
		switch (ch)
		{
		case 1:
                    System.setProperty("webdriver.chrome.driver","C:\\Users\\NARENDER KESWANI\\Downloads\\chromedriver_win32\\chromedriver.exe");
                    wd = new ChromeDriver();
                    break;
		case 2:
                    System.setProperty("webdriver.gecko.driver","C:\\Users\\NARENDER KESWANI\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
                    wd = new FirefoxDriver();
		default:
                    System.out.println("Invalid Choice");
                    break; 
		}
		if(wd!=null) 
		{ 
			wd.get("http:\\google.com");
		}
	}
}
