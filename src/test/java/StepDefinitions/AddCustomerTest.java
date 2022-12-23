package StepDefinitions;

import Pages.AddNewCustomerPage;
import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static BaseTest.BaseTest.driver;
import static org.testng.Assert.assertEquals;

public class AddCustomerTest {
    LoginPage loginPage;
    HomePage homePage;
    AddNewCustomerPage addNewCustomerPage;
    @Given("user is in the home page by valid credentials13 {string} and {string}")
    public void user_is_in_the_home_page_by_valid_credentials13_and(String username, String password) {
        loginPage=new LoginPage(driver);
        homePage=new HomePage(driver);
        loginPage.setUserName(username);
        loginPage.setPassword(password);
        var homepage=loginPage.clickLoginButton();
    }
    @When("user clicks on add customer and enters the following fields  {string}  {string}  {string} {string} {string} {string} {string} {string} {string}")
    public void user_clicks_on_add_customer_and_enters_the_following_fields(String customerName, String DOB, String address, String city, String state, String telephone, String pin, String email, String password) {
       addNewCustomerPage=new AddNewCustomerPage(driver);
        var addCustomerPage=homePage.clickAddNewCustomer();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        addCustomerPage.setCustomerName(customerName);
        addCustomerPage.selectMaleGender();
        addCustomerPage.setDate(DOB);
        addCustomerPage.setAddress(address);
        addCustomerPage.setCity(city);
        addCustomerPage.setState(state);
        addCustomerPage.setPIN(pin);
        addCustomerPage.setTelephone(telephone);
        addCustomerPage.setEmail(email);
        addCustomerPage.setPassword(password);
        addCustomerPage.clickSubmit();
    }
    @Then("message will be displayed")
    public void message_will_be_displayed() {
        assertEquals(addNewCustomerPage.switchToAlert(),"Email Address Already Exist !!");
        addNewCustomerPage.acceptAlert();
    }

}
