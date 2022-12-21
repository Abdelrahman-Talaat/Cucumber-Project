package StepDefinitions;

import Pages.DepositPage;
import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static BaseTest.BaseTest.driver;
import static org.testng.Assert.assertEquals;

public class DepositTest {
    LoginPage loginPage;
    HomePage homePage;
    DepositPage depositPage;
    @Given("user is in the home page by valid credentials6 {string} and {string}")
    public void user_is_in_the_home_page_by_valid_credentials6_and(String username, String password) {
        loginPage=new LoginPage(driver);
        homePage=new HomePage(driver);
        loginPage.setUserName(username);
        loginPage.setPassword(password);
        var homepage=loginPage.clickLoginButton();
    }
    @When("user clicks deposit and enters {string} and {string} and {string}")
    public void user_clicks_deposit_and_enters_and_and(String accNo, String amountValue, String description) {
        depositPage=new DepositPage(driver);
        var depositPage=homePage.clickDeposit();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        depositPage.enterAccNo(accNo);
        depositPage.enterAmount(amountValue);
        depositPage.enterDescription(description);
        depositPage.clickSubmitButton();
    }
    @Then("alert message will be displayed")
    public void alert_message_will_be_displayed() {
        assertEquals(depositPage.getMessage(),"Account does not exist");
    }
}
