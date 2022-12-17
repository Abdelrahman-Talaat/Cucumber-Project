package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditCustomerPage {
    private WebDriver driver;
    private By setCustomerIdLocator= By.xpath("//input[@name='cusid']");
    private By clickSubmitButtonLocator=By.xpath("//input[@name='AccSubmit']");
    private By getRedirectedPageMessageLocator=By.cssSelector("p.heading3");
    public EditCustomerPage (WebDriver driver){
        this.driver=driver;
    }
    public void setSetCustomerId(String customerId){
        driver.findElement(setCustomerIdLocator).sendKeys(customerId);
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
    public String redirectedToEditPage(){
        return driver.findElement(getRedirectedPageMessageLocator).getText();
    }
}
