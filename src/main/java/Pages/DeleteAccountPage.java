package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class DeleteAccountPage {
    private WebDriver driver;
   private By setAccountNumberLocator= By.xpath("//input[@name='accountno']");
    private By clickSubmitButtonLocator=By.xpath("//input[@name='AccSubmit']");

    public DeleteAccountPage(WebDriver driver){
        this.driver=driver;
    }
    public void setAccountNumber(String accountNumber){
        driver.findElement(setAccountNumberLocator).sendKeys(accountNumber);
    }

    public void clickSubmitButton(){
        driver.findElement(clickSubmitButtonLocator).click();
    }
    public String getPopUpMessage(){
        return driver.switchTo().alert().getText();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();

    }
    public String getAlertAcceptionMessage(){

        return driver.switchTo().alert().getText();
    }

}
