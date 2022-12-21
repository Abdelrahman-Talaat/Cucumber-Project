package BaseTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class BaseTest extends AbstractTestNGCucumberTests {
    public static WebDriver driver;

    @Before()
    public void setUp() {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
      System.setProperty("webdriver.chromedriver","resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.demo.guru99.com/V4/");
    }
    @After()
    public void tearDown(){
        driver.quit();
    }

}
