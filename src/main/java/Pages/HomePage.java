package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By getMessageLocator= By.xpath("//marquee[@class='heading3']");
    private By getManagerIdLocator=By.xpath("//td[@style='color: green']");
    private By clickChangePasswordLocator=By.xpath("//a[@href='PasswordInput.php']");
    private By clickAddNewCustomerLocator=By.xpath("//a[@href='addcustomerpage.php']");
    private By clickAddNewAccountLocator=By.xpath("//a[@href='addAccount.php']");
    private  By clickDeleteAccountLocator=By.xpath("//a[@href='deleteAccountInput.php']");
    private By clickBalanceInquiryLocator=By.xpath("//a[@href='BalEnqInput.php']");
    private By clickCustomizedStatement=By.xpath("//a[@href='CustomisedStatementInput.php']");
    private By clickDeleteCustomerLocator=By.xpath("//a[@href='DeleteCustomerInput.php']");
    private By clickMiniStatementLocator=By.xpath("//a[@href='MiniStatementInput.php']");
    private By clickEditCustomerLocator=By.xpath("//a[@href='EditCustomer.php']");
    private By clickFundTransferLocator =By.xpath("//a[@href='FundTransInput.php']");
    private By clickDepositLocator=By.xpath("//a[@href='DepositInput.php']");
    private By clickWithdrawalLocator=By.xpath("//a[@href='WithdrawalInput.php']");
    private By clickLogoutLocator=By.xpath("//a[@href='Logout.php']");


    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    public String getWelcomeMessage(){
        return driver.findElement(getMessageLocator).getText();
    }
    public String getManagerId(){
      return   driver.findElement(getManagerIdLocator).getText();
    }
    public changePasswordPage clickChangePassword(){
        driver.findElement(clickChangePasswordLocator).click();
        return new changePasswordPage(driver);
    }
    public AddNewCustomerPage clickAddNewCustomer(){
        driver.findElement(clickAddNewCustomerLocator).click();
        return new AddNewCustomerPage(driver);
    }
    public AddNewAccountPage clickAddNewAccount(){
        driver.findElement(clickAddNewAccountLocator).click();
        return new AddNewAccountPage(driver);
    }
    public DeleteAccountPage clickDeleteAccount(){
        driver.findElement(clickDeleteAccountLocator).click();
        return new DeleteAccountPage(driver);
    }
    public BalanceInquirypage clickBalanceInquiry(){
        driver.findElement(clickBalanceInquiryLocator).click();
        return new BalanceInquirypage(driver);
    }
    public CustomizedStatementPage clickCustomizedStatement(){
        driver.findElement(clickCustomizedStatement).click();
        return new CustomizedStatementPage(driver);
    }
    public DeleteCustomerPage clickDeleteCustomer(){
        driver.findElement(clickDeleteCustomerLocator).click();
        return new DeleteCustomerPage(driver);
    }
    public MiniStatementPage clickMiniStatement(){
        driver.findElement(clickMiniStatementLocator).click();
        return new MiniStatementPage(driver);
    }
    public EditCustomerPage clickEditCustomer(){
        driver.findElement(clickEditCustomerLocator).click();
        return new EditCustomerPage(driver);
    }
    public FundTransferPage clickFundTransfer(){
        driver.findElement(clickFundTransferLocator).click();
        return new FundTransferPage(driver);
    }
    public DepositPage clickDeposit(){
        driver.findElement(clickDepositLocator).click();
        return new DepositPage(driver);
    }
    public WithdrawalPage clickWithdrawal(){
        driver.findElement(clickWithdrawalLocator).click();
        return new WithdrawalPage(driver);
    }
    public LogoutPage clickLogout(){
        driver.findElement(clickLogoutLocator).click();
        return new LogoutPage(driver);
    }
}
