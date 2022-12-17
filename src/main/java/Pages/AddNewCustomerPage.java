package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddNewCustomerPage {
    private WebDriver driver;
    private By customerNameLocator= By.xpath("//input[@name='name']");
    private By selectMaleGenderLocator=By.xpath("//input[@value='m']");
    private By selectFemaleGenderLocator=By.xpath("//input[@value='f']");
    private By setDateLocator=By.xpath("//input[@id='dob']");
    private By setAddressLocator=By.xpath("//textarea");
    private By setCityLocator=By.xpath("//input[@name='city']");
    private By setStateLocator=By.xpath("//input[@name='state']");
    private By setPinNoLocator=By.xpath("//input[@name='pinno']");

    private By setTelephoneLocator=By.xpath("//input[@name='telephoneno']");
    private By setEmailLocator=By.xpath("//input[@name='emailid']");
    private By setPasswordLocator=By.xpath("//input[@name='password']");
    private By clickSubmitLocator=By.xpath("//input[@name='sub']");

    public AddNewCustomerPage(WebDriver driver){
        this.driver=driver;
    }
    public void setCustomerName(String customerName){
        driver.findElement(customerNameLocator).sendKeys(customerName);
    }
    public void selectMaleGender(){
        driver.findElement(selectMaleGenderLocator).click();
    }
    public void selectFemaleGender(){
        driver.findElement(selectFemaleGenderLocator).click();
    }
    public void setDate(String date){
        driver.findElement(setDateLocator).sendKeys(date);

    }
    public void setAddress(String address){
        driver.findElement(setAddressLocator).sendKeys(address);
    }
    public void setCity(String city){
        driver.findElement(setCityLocator).sendKeys(city);
    }
    public void setState(String state){
        driver.findElement(setStateLocator).sendKeys(state);
    }
    public void setPIN(String pin){
        driver.findElement(setPinNoLocator).sendKeys(pin);
    }
    public void setTelephone(String telephone){
        driver.findElement(setTelephoneLocator).sendKeys(telephone);
    }
    public void setEmail(String email){
        driver.findElement(setEmailLocator).sendKeys(email);
    }
    public void setPassword(String password){
        driver.findElement(setPasswordLocator).sendKeys(password);
    }
    public void clickSubmit(){
        driver.findElement(clickSubmitLocator).click();
    }
    public String switchToAlert(){
        return driver.switchTo().alert().getText();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }






}
