import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://trytestingthis.netlify.app/");
        WebElement option = driver.findElement(By.id("option"));

        Select select = new Select(option);
     /*   select.selectByValue("option 2");
        select.selectByIndex(1);
        select.selectByValue("option 1");*/

        List<WebElement> allOptions = select.getOptions();

        for (WebElement ele : allOptions) {
            System.out.println(ele.getText());
            if (ele.getText().equalsIgnoreCase("Option 1")) {
                ele.click();
            }

        }


        Thread.sleep(2000);
        driver.quit();
        System.out.println("done");

    }
}
