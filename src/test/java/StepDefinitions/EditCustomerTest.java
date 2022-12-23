package StepDefinitions;

import Pages.EditCustomerPage;
import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static BaseTest.BaseTest.driver;
import static org.testng.Assert.assertEquals;

public class EditCustomerTest {
    LoginPage loginPage;
    HomePage homePage;
    EditCustomerPage editCustomerPage;
    @Given("user is in the home page by valid credentials10 {string} and {string}")
    public void user_is_in_the_home_page_by_valid_credentials10_and(String username, String password) {
        loginPage=new LoginPage(driver);
        homePage=new HomePage(driver);
        loginPage.setUserName(username);
        loginPage.setPassword(password);
        var homepage=loginPage.clickLoginButton();
    }
    @When("user clicks on edit customer and enters {string}")
    public void user_clicks_on_edit_customer_and_enters(String customerId) {
        editCustomerPage=new EditCustomerPage(driver);
        var editCustomerPage=homePage.clickEditCustomer();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        editCustomerPage.setSetCustomerId(customerId);
        editCustomerPage.clickSubmitButton();    }
    @Then("alert message will be displayed customer does not exist")
    public void alert_message_will_be_displayed_customer_does_not_exist() {
        assertEquals(editCustomerPage.getPopUpMessage(),"Customer does not exist!!");
        editCustomerPage.acceptAlert();
        assertEquals(editCustomerPage.redirectedToEditPage(),"Edit Customer Form");
    }
}
