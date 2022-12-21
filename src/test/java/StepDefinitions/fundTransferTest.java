package StepDefinitions;

import Pages.FundTransferPage;
import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static BaseTest.BaseTest.driver;
import static org.testng.Assert.assertEquals;

public class fundTransferTest {
    LoginPage loginPage;
    HomePage homePage;
    FundTransferPage fundTransferPage;
    @Given("user is in the home page by valid credentials7 {string} and {string}")
    public void user_is_in_the_home_page_by_valid_credentials7_and(String username, String password) {
        loginPage=new LoginPage(driver);
        homePage=new HomePage(driver);
        loginPage.setUserName(username);
        loginPage.setPassword(password);
        var homepage=loginPage.clickLoginButton();
    }
    @When("user click fund transfer and enters {string} and {string} and {string} and {string}")
    public void user_click_fund_transfer_and_enters_and_and_and(String payerAccNo, String payeesAccNo, String amountValue, String description) {
        fundTransferPage=new FundTransferPage(driver);
        var fundTransferPage=homePage.clickFundTransfer();
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        fundTransferPage.enterPayersAccNo(payerAccNo);
        fundTransferPage.enterPayeesAccNo(payeesAccNo);
        fundTransferPage.enterAmount(amountValue);
        fundTransferPage.enterDescription(description);
        fundTransferPage.clickSubmitButton();
    }
    @Then("alert message will be displayed that account doesn't exist")
    public void alert_message_will_be_displayed_that_account_doesn_t_exist() {
        assertEquals(fundTransferPage.getPopUpMessage(),"Account 123does not exist!!!");
    }
}
