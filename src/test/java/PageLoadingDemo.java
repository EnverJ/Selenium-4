import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PageLoadingDemo {
    public static void main(String[] args) {
        // normal  waits for the entire page tp be loaded.
        ChromeOptions options = new ChromeOptions();
        //   options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        //   options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        options.setPageLoadStrategy(PageLoadStrategy.NONE);
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        driver.close();
        driver.quit();


    }
}
