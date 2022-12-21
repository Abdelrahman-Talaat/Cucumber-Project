package StepDefinitions;

import Pages.DeleteCustomerPage;
import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static BaseTest.BaseTest.driver;
import static org.testng.Assert.assertEquals;

public class DeleteCustomerTest {
    LoginPage loginPage;
    HomePage homePage;
    DeleteCustomerPage deleteCustomerPage;
    @Given("user is in the home page by valid credentials4 {string} and {string}")
    public void user_is_in_the_home_page_by_valid_credentials4_and(String username, String password) {
        loginPage=new LoginPage(driver);
        homePage=new HomePage(driver);
        loginPage.setUserName(username);
        loginPage.setPassword(password);
        var homepage=loginPage.clickLoginButton();
    }
    @When("user clicks delete customer and enters customer id {string}")
    public void user_clicks_delete_customer_and_enters_customer_id(String customerId) {
        deleteCustomerPage=new DeleteCustomerPage(driver);
        var deleteCustomerPage=homePage.clickDeleteCustomer();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        deleteCustomerPage.setCustomerId(customerId);
        deleteCustomerPage.clickSubmitButton();
    }
    @Then("alert will be displayed to confirm delete customer")
    public void alert_will_be_displayed_to_confirm_delete_customer() {
        assertEquals(deleteCustomerPage.getPopUpMessage(),"Do you really want to delete this Customer?");
    }
}
