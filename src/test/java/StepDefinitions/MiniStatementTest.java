package StepDefinitions;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.MiniStatementPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static BaseTest.BaseTest.driver;
import static org.testng.Assert.assertEquals;

public class MiniStatementTest {
    LoginPage loginPage;
    HomePage homePage;
    MiniStatementPage miniStatementPage;
    @Given("user is in the home page by valid credentials8 {string} and {string}")
    public void user_is_in_the_home_page_by_valid_credentials8_and(String username, String password) {
        loginPage=new LoginPage(driver);
        homePage=new HomePage(driver);
        loginPage.setUserName(username);
        loginPage.setPassword(password);
        var homepage=loginPage.clickLoginButton();
    }
    @When("user click miniStatement and enter the account number {string}")
    public void user_click_mini_statement_and_enter_the_account_number(String accNo) {
        miniStatementPage=new MiniStatementPage(driver);
        var miniStatementPage=homePage.clickMiniStatement();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        miniStatementPage.setAccountNumber(accNo);
        miniStatementPage.clickSubmitButton();
    }
    @Then("alert message will be displayed that account doesn't exist1")
    public void alert_message_will_be_displayed_that_account_doesn_t_exist1() {
        assertEquals(miniStatementPage.getPopUpMessage(),"Account does not exist");
        miniStatementPage.acceptAlert();
        assertEquals(miniStatementPage.getRedirectedToPageMessage(),"Mini Statement Form");
    }


}
