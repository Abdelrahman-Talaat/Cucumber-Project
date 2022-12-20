package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private WebDriver driver;
    private By userNameLocator= By.xpath("//input[@name='uid']");
    private By passwordLocator=By.xpath("//input[@name='password']");
    private By clickLoginButtonLocator=By.xpath("//input[@name='btnLogin']");
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void setUserName(String userName){
        driver.findElement(userNameLocator).clear();
        driver.findElement(userNameLocator).sendKeys(userName);
    }
    public void setPassword(String password){
        driver.findElement(passwordLocator).clear();
        driver.findElement(passwordLocator).sendKeys(password);
    }
    public HomePage clickLoginButton(){
        driver.findElement(clickLoginButtonLocator).click();
        return new HomePage(driver);
    }
    public String getPopUpMessage(){
        return driver.switchTo().alert().getText();

    }

}
