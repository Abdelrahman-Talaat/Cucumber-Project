package StepDefinitions;

import Pages.CustomizedStatementPage;
import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static BaseTest.BaseTest.driver;
import static org.testng.Assert.assertEquals;

public class CustomizedStatementTest {
    LoginPage loginPage;
    HomePage homePage;
    CustomizedStatementPage customizedStatementPage;
    @Given("user is in the home page by valid credentials11 {string} and {string}")
    public void user_is_in_the_home_page_by_valid_credentials11_and(String username, String password) {
        loginPage=new LoginPage(driver);
        homePage=new HomePage(driver);
        loginPage.setUserName(username);
        loginPage.setPassword(password);
        var homepage=loginPage.clickLoginButton();
    }
    @When("user clicks on customized statement and enter {string} and {string} and {string} and {string} and {string}")
    public void user_clicks_on_customized_statement_and_enter_and_and_and_and(String accNO, String fromDate, String toDate, String minNoOfTransactions, String noOFTransactions)
    { customizedStatementPage=new CustomizedStatementPage(driver);
        var customizedStatementPage=homePage.clickCustomizedStatement();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        customizedStatementPage.setAccountNo(accNO);
        customizedStatementPage.setFromDate(fromDate);
        customizedStatementPage.setToDate(toDate);
        customizedStatementPage.setMinTrsansactionsValue(minNoOfTransactions);
        customizedStatementPage.setNoOfTransactions(noOFTransactions);
        customizedStatementPage.clickSubmitButton();

    }
    @Then("alert message will be displayed1")
    public void alert_message_will_be_displayed1(){
        assertEquals(customizedStatementPage.getPopUpMessage(),"Account does not exist");
    }

}
