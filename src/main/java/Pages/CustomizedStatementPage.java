package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomizedStatementPage {
    private WebDriver driver;
    private By setAccountNoLocator= By.xpath("//input[@name='accountno']");
    private By setFromDateLocator=By.xpath("//input[@name='fdate']");
    private By setToDateLocator= By.xpath("//input[@name='tdate']");
    private By minStatementValueLocator=By.xpath("//input[@name='amountlowerlimit']");
    private By noOfTransactionsLocator=By.xpath("//input[@name='numtransaction']");
    private By submitButtonLocator=By.xpath("//input[@name='AccSubmit']");
    public CustomizedStatementPage (WebDriver driver){
        this.driver=driver;
    }
    public void setAccountNo(String accountNo){
        driver.findElement(setAccountNoLocator).sendKeys(accountNo);
    }
    public void setFromDate(String fromDate){
        driver.findElement(setFromDateLocator).sendKeys(fromDate);
    }
    public void setToDate(String ToDate){
        driver.findElement(setToDateLocator).sendKeys(ToDate);
    }
    public void setMinTrsansactionsValue(String minStatementValue){
        driver.findElement(minStatementValueLocator).sendKeys(minStatementValue);
    }
    public void  setNoOfTransactions(String noOfTransactions){
        driver.findElement(noOfTransactionsLocator).sendKeys(noOfTransactions);
    }
    public void clickSubmitButton(){
        driver.findElement(submitButtonLocator).click();
    }
    public String getPopUpMessage(){
        return driver.switchTo().alert().getText();
    }





}
