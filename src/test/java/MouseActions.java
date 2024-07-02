import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseActions {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");

        WebElement boxA = driver.findElement(By.xpath("//li[@name='A']"));
        WebElement boxD = driver.findElement(By.xpath("//li[@name='D']"));

        Actions actions = new Actions(driver);
    /*    actions.moveToElement(boxA);
        actions.clickAndHold();
        actions.moveToElement(boxD);
        actions.release().perform();*/

        // right click
        actions.contextClick(boxA);
        actions.build().perform();
        Thread.sleep(2000);
        System.out.println("done");


        driver.quit();
    }
}
