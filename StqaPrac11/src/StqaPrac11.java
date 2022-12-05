
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author NARENDER KESWANI
 */
public class StqaPrac11 {

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

        wd.findElement(By.name("log")).sendKeys("narender.rk10@gmail.com");
        Thread.sleep(2000);

        wd.findElement(By.id("user_pass")).sendKeys("---");
        Thread.sleep(2000);

        wd.findElement(By.id("wp-submit")).click();
        Thread.sleep(2000);
        
        System.out.println("Logged in");

        Actions act = new Actions(wd);
        List<WebElement> menu = wd.findElements(By.xpath("/html/body/div[1]/header/div[1]/div/div/div/div/div[4]/div/div/ul"));

        System.out.println("Menu List");
        for (int i = 0; i <= menu.size() - 1; i++) {
            System.out.println(menu.get(i).getText() + "\n");
            //print text of all the element on console
            act.moveToElement(menu.get(i)).click();
            //to perform mousehover on all elements of list
            Thread.sleep(2000);
        }

        wd.navigate().to("https://maarula.in/dashboard/logout");
        Thread.sleep(2000);
        
        System.out.println("Logout");
        wd.close();

    }

}
