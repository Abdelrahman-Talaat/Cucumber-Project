package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class changePasswordPage {
    private WebDriver driver;
    private By enterOldPasswordLocator= By.xpath("//input[@name='oldpassword']");
    private By enterNewPasswordLocator= By.xpath("//input[@name='newpassword']");
    private By enterConfirmPasswordLocator= By.xpath("//input[@name='confirmpassword']");
    private By clickSubmitLocator=By.xpath("//input[@name='sub']");

    public changePasswordPage(WebDriver driver){
        this.driver=driver;
    }
    public void enterOldPassword(String oldPassword){
        driver.findElement(enterOldPasswordLocator).sendKeys(oldPassword);
    }
    public void enterNewPassword(String newPassword){
        driver.findElement(enterNewPasswordLocator).sendKeys(newPassword);
    }
    public void enterConfirmPassword(String confirmPassword){
        driver.findElement(enterConfirmPasswordLocator).sendKeys(confirmPassword);
    }
    public void clickSubmit(){
        driver.findElement(clickSubmitLocator).click();
    }
    public String getPopUpMessage() {
        return driver.switchTo().alert().getText();

    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

}
