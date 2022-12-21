package StepDefinitions;

import Pages.DeleteAccountPage;
import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static BaseTest.BaseTest.driver;
import static org.testng.Assert.assertEquals;

public class DeleteAccountTest {
    LoginPage loginPage;
    HomePage homePage;
    DeleteAccountPage deleteAccountPage;
    @Given("user is in the home page by valid credentials3 {string} and {string}")
    public void user_is_in_the_home_page_by_valid_credentials1_and(String username, String password) {
        loginPage=new LoginPage(driver);
        homePage=new HomePage(driver);
        loginPage.setUserName(username);
        loginPage.setPassword(password);
        var homepage=loginPage.clickLoginButton();
    }

    @When("user clicks on delete account and enters {string}")
    public void user_clicks_on_delete_account_and_enters(String accNo) {
        deleteAccountPage=new DeleteAccountPage(driver);
       var deleteAccountPage=homePage.clickDeleteAccount();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        deleteAccountPage.setAccountNumber(accNo);
        deleteAccountPage.clickSubmitButton();
    }
    @Then("alert will be displayed to confirm delete account")
    public void alert_will_be_displayed_to_confirm_delete_account() {
        assertEquals(deleteAccountPage.getPopUpMessage(),"Do you really want to delete this Account?");
        deleteAccountPage.acceptAlert();
        assertEquals(deleteAccountPage.getAlertAcceptionMessage(),"Account does not exist");
        deleteAccountPage.acceptAlert();
    }
}
