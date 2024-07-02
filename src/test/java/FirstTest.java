import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class FirstTest {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        String originalWindow = driver.getWindowHandle();

  /*      driver.navigate().to("https://mvnrepository.com/search?q=Selenium");
        System.out.println(driver.getCurrentUrl());
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();*/

        //switch windows

/*        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.switchTo().newWindow(WindowType.TAB);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.switchTo().window(originalWindow);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

        // browser action

/*        driver.manage().window().getSize().getWidth();
        driver.manage().window().getSize().getHeight();
        Dimension size = driver.manage().window().getSize();
        System.out.println(size.getHeight());
        System.out.println(size.getWidth());

        driver.manage().window().setSize(new Dimension(100, 1200));
        Thread.sleep(3000);*/


        // screenshots
     /*   File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("./image.png"));

        WebElement element = driver.findElement(By.cssSelector(".lnXdpd"));
        File scrElement = element.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrElement, new File("./elementScreenshot.png"));

*/
        // browser actions
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement feelingBtn = driver.findElement(By.name("btnI"));
        js.executeScript("arguments[0].click();", feelingBtn);


        js.executeScript("console.log('hello EnvER')");


        driver.quit();

    }
}
