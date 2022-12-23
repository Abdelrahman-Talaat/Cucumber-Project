package StepDefinitions;

import Pages.AddNewAccountPage;
import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static BaseTest.BaseTest.driver;
import static org.testng.Assert.assertEquals;

public class AddAccountTest {
    LoginPage loginPage;
    HomePage homePage;
    AddNewAccountPage addNewAccountPage;
    @Given("user is in the home page by valid credentials12 {string} and {string}")
    public void user_is_in_the_home_page_by_valid_credentials12_and(String username, String password) {
        loginPage=new LoginPage(driver);
        homePage=new HomePage(driver);
        loginPage.setUserName(username);
        loginPage.setPassword(password);
        var homepage=loginPage.clickLoginButton();
    }
    @When("user clicks on add account and enters {string} and {string} and {string}")
    public void user_clicks_on_add_account_and_enters_and_and(String customerID, String accountType, String initialDeposit) {
        addNewAccountPage = new AddNewAccountPage(driver);
        var addNewAccountPage = homePage.clickAddNewAccount();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        addNewAccountPage.setCustomerId(customerID);
        addNewAccountPage.selectAccountType(accountType);
        addNewAccountPage.setInitialDeposit(initialDeposit);
        addNewAccountPage.clickSubmitButton();
    }
    @Then("alert message will be displayed2")
    public void alert_message_will_be_displayed2() {
            assertEquals(addNewAccountPage.getAlertMessage(),"Customer does not exist!!");

    }
}
