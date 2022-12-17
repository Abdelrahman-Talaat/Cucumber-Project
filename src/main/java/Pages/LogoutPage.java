package Pages;

import org.openqa.selenium.WebDriver;

public class LogoutPage {
    private WebDriver driver;

    public LogoutPage (WebDriver driver){
        this.driver=driver;
    }


    public String getLogOutMessage(){
        return driver.switchTo().alert().getText();
    }
}
