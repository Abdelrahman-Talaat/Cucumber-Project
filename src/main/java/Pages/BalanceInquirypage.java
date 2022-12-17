package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BalanceInquirypage {
    private WebDriver driver;
    private By setAccountNumberLocator= By.xpath("//input[@name='accountno']");
    private By clickSubmitButtonLocator=By.xpath("//input[@name='AccSubmit']");
    private By redirectedToThePageMessageLocator=By.cssSelector("p.heading3");
    public BalanceInquirypage (WebDriver driver){
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
    public String getPageMessage(){
        return driver.findElement(redirectedToThePageMessageLocator).getText();
    }

}
