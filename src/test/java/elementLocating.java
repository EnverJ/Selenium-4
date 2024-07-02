import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.util.List;

public class elementLocating {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        /*driver.get("https://www.google.com/");

        WebElement searchBtn = driver.findElement(By.name("q"));
        searchBtn.sendKeys("selenium", Keys.ENTER);
        Thread.sleep(2000);*/

    /*    driver.get("https://trytestingthis.netlify.app/");
        List<WebElement> options = driver.findElements(By.name("Optionwithcheck[]"));
        for (WebElement ele : options) {
            System.out.println(ele.getText());
        }

        driver.findElement(By.cssSelector("#fname")).sendKeys("Enver");*/

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement loginBtn = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        driver.findElement(RelativeLocator.with(By.tagName("input")).above(loginBtn)).sendKeys("enver");

        Thread.sleep(2000);

        driver.quit();

    }



    /*
    * Web Elements:
What are web elements
How to locate web elements in Selenium

Locating single & multiple elements
Locate element using any of its unique properties
WebElement searchBox = driver.findElement(By.name("q"));

Locate multiple elements
List＜WebElement＞ options = driver.findElements(By.name("Optionwithcheck[]"));

  for(WebElement element : options) {
   System.out.println(element.getText());
  }

Elements Selector Strategies
ID : using ID property of the element
Name : using Name property of the element
Link Text : using the visible text value of an anchor element
Partial Link Text : using the partial value of visible text of an anchor element
Class name : using Class name property of the element
Tag name : using Tag name property of the element
CSS Selectors : using a CSS selector with available properties
XPath : using XPath expression with available properties

Tips on using Selectors

ID : use ID if available, unique and consistent

CSS Selectors : If unique ID’s not available

XPath : If CSS Selectors can’t be used

keep your locators as compact and readable as possible
traversing the DOM structure is an expensive operation,
the more you can narrow the scope of your search, the better

Selenium 4 - Relative Locators

The findElement method accepts a new method with(By) which returns a RelativeLocator
above
below
toLeftOf
toRightOf
near

WebElement loginButton = driver.findElement(By.id("btnLogin"));
WebElement passwordTextBox = driver.findElement(RelativeLocator.with(By.tagName("input")).above(loginButton));
    *
    * */
}
