package BaseTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest extends AbstractTestNGCucumberTests {
    public static WebDriver driver;

    @Before()
    public void setUp() {
      System.setProperty("webdriver.chromedriver","resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.demo.guru99.com/V4/");
    }
    @After()
    public void tearDown(){
        driver.quit();
    }

}
