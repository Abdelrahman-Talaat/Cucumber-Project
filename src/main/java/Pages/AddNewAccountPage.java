package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class AddNewAccountPage {
    private WebDriver driver;
    private  By customerIdLocator= By.xpath("//input[@name='cusid']");
    private By accountTypeLocator=By.xpath("//select[@name='selaccount']");
    private By initialDepositLocator=By.xpath("//input[@name='inideposit']");
    private By clickSubmitButtonLocator=By.xpath("//input[@name='button2']");
    public AddNewAccountPage(WebDriver driver){
        this.driver=driver;
    }
    public void setCustomerId(String customerId){
        driver.findElement(customerIdLocator).sendKeys(customerId);
    }
    public void selectAccountType(String accountType){
        Select Type=new Select(driver.findElement(accountTypeLocator));
        Type.selectByVisibleText(accountType);
    }
    public List<String> SelectedOptions(){
        Select dropdownElement=new Select(driver.findElement(accountTypeLocator));
        List<WebElement>selected =  dropdownElement.getAllSelectedOptions();
        return selected.stream().map(e->e.getText()).collect(Collectors.toList());
    }
    public void setInitialDeposit(String initialDeposit){
        driver.findElement(initialDepositLocator).sendKeys(initialDeposit);
    }
    public void clickSubmitButton(){
        driver.findElement(clickSubmitButtonLocator).click();
    }
    public String getAlertMessage(){
        return driver.switchTo().alert().getText();
    }

}
