package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FundTransferPage {
    private WebDriver driver;
    private By enterPayersAccNoLocator= By.xpath("//input[@name='payersaccount']");
    private By enterPayeesAccNoLocator=By.xpath("//input[@name='payeeaccount']");
    private By enterAmountLocator=By.xpath("//input[@name='ammount']");
    private By enterDescriptionLocator=By.xpath(" //input[@name='desc']" );
    private By clickSubmitButtonLocator=By.xpath("//input[@name='AccSubmit']");

    public FundTransferPage(WebDriver driver){
        this.driver=driver;
    }
    public void enterPayersAccNo(String payersAccNoLocator){
        driver.findElement(enterPayersAccNoLocator).sendKeys(payersAccNoLocator);
    }
    public void enterPayeesAccNo(String payeesAccNo ){
        driver.findElement(enterPayeesAccNoLocator).sendKeys(payeesAccNo);
    }
    public void enterAmount(String amount){
        driver.findElement(enterAmountLocator).sendKeys(amount);
    }
    public void enterDescription(String description){
        driver.findElement(enterDescriptionLocator).sendKeys(description);
    }
    public void clickSubmitButton(){
        driver.findElement(clickSubmitButtonLocator).click();
    }
    public String getPopUpMessage(){
        return  driver.switchTo().alert().getText();
    }

}
