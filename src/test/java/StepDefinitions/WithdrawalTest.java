package StepDefinitions;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.WithdrawalPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static BaseTest.BaseTest.driver;
import static org.testng.Assert.assertEquals;

public class WithdrawalTest {
    LoginPage loginPage;
    HomePage homePage;
    WithdrawalPage withdrawalPage;
    @Given("user is in the home page by valid credentials9 {string} and {string}")
    public void user_is_in_the_home_page_by_valid_credentials9_and(String username, String password) {
      loginPage=new LoginPage(driver);
      homePage=new HomePage(driver);
        loginPage.setUserName(username);
        loginPage.setPassword(password);
        var homepage=loginPage.clickLoginButton();
    }
    @When("user clicks on withdrawal and enter {string} and {string} and {string}")
    public void user_clicks_on_withdrawal_and_enter_and_and(String accNo, String amountValue, String description) {
        withdrawalPage=new WithdrawalPage(driver);
        var withdrawalPage=homePage.clickWithdrawal();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        withdrawalPage.enterAccNo(accNo);
        withdrawalPage.enterAmount(amountValue);
        withdrawalPage.enterDescription(description);
        withdrawalPage.clickSubmitButton();
    }
    @Then("alert message will be displayed Account does not exist")
    public void alert_message_will_be_displayed_account_does_not_exist() {
        assertEquals(withdrawalPage.getPopUpMessage(),"Account does not exist");
    }
}
