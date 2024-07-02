import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ElementDemos {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Find Elements
  /*      driver.get("https://www.google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium", Keys.ENTER);*/

  /*      driver.get("https://trytestingthis.netlify.app/");
        List<WebElement> options = driver.findElements(By.tagName("select"));
        Thread.sleep(1000);
        for (WebElement ele : options) {
            System.out.println(ele.getText());
        }*/

     /*   driver.get("https://www.google.com");
        WebElement form = driver.findElement(By.tagName("form"));
        form.findElement(By.name("q")).sendKeys("Selenium");*/

        // get active Element
   /*     driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Automation");
        String attribute = driver.switchTo().activeElement().getAttribute("title");
        System.out.println(attribute);*/

        // get tag name, css

       /* driver.get("https://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        String tagName = searchBox.getTagName();
        String text = searchBox.getText();
        String cssValue = searchBox.getCssValue("font");

        System.out.println("tageName = " + tagName + " text" + text + " cssVale = " + cssValue);*/

        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement checkbox1 = driver.findElement(By.xpath("//form[@id='checkboxes'][1]"));
        System.out.println(checkbox1.isEnabled());
        System.out.println(checkbox1.isSelected());

        Thread.sleep(2000);


        driver.quit();

    }
}
