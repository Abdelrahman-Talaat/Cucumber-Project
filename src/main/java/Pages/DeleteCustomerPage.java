package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteCustomerPage {
    private WebDriver driver;
    private By setCustomerIdLocator= By.xpath("//input[@name='cusid']");
    private By clickSubmitButtonLocator=By.xpath("//input[@name='AccSubmit']");

    public DeleteCustomerPage (WebDriver driver){
        this.driver=driver;
    }
    public void setCustomerId(String customerId){
        driver.findElement(setCustomerIdLocator).sendKeys(customerId);
    }
    public void clickSubmitButton(){
        driver.findElement(clickSubmitButtonLocator).click();
    }
    public String getPopUpMessage(){
        return driver.switchTo().alert().getText();
    }


}
