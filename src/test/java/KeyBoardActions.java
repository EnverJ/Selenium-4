import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class KeyBoardActions {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // sendkeys
     /*   driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Selenium" + Keys.ENTER);*/

        // keyDown
      /*  driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Selenium" + Keys.ENTER);
        Actions actionProvider = new Actions(driver);
        Action keyDown = actionProvider.keyDown(Keys.COMMAND).sendKeys("a").build();
        keyDown.perform();*/

        // keyUp
        driver.get("https://www.google.com");
        Actions actions = new Actions(driver);
        WebElement searchBox = driver.findElement(By.name("q"));
        actions.keyDown(Keys.SHIFT).sendKeys(searchBox, "Selenium")
                .keyUp(Keys.SHIFT).sendKeys("Automation").perform();


        searchBox.clear();
        Thread.sleep(2000);
        driver.quit();
    }
}
