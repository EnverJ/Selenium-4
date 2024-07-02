import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Alerts {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        System.out.println(text);
        alert.accept();
        if (driver.getPageSource().contains("You successfully clicked an alert"))
            System.out.println("You successfully clicked an alert");
        System.out.println("=============");

        // js confirm
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        Alert alert2 = driver.switchTo().alert();
        String text2 = alert.getText();
        System.out.println(text2);
        alert2.accept();
        if (driver.getPageSource().contains("You clicked: Ok"))
            System.out.println("You clicked: Ok");
        System.out.println("=============");

        // js prompt

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Alert alert3 = driver.switchTo().alert();
        String text3 = alert.getText();
        System.out.println(text3);

        alert3.sendKeys("Automation");
        alert3.accept();
        if (driver.getPageSource().contains("You entered: Automation"))
            System.out.println("You entered: Automation");
        System.out.println("=============");

        driver.close();
        driver.quit();


    }
}
