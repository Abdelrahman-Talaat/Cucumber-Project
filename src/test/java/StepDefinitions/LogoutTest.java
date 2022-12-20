package StepDefinitions;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.LogoutPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static BaseTest.BaseTest.driver;
import static org.junit.Assert.assertEquals;

public class LogoutTest {
    LoginPage loginPage;
    HomePage homePage;
    LogoutPage logoutPage;
    @Given("user is in the home page by valid credentials {string} and {string}")
    public void user_is_in_the_home_page_by_valid_credentials_and(String username, String password) {
        loginPage=new LoginPage(driver);
        homePage=new HomePage(driver);
        loginPage.setUserName(username);
        loginPage.setPassword(password);
        var homepage=loginPage.clickLoginButton();
    }
    @When("user click on logout")
    public void user_click_on_logout() {
        homePage.clickLogout();
    }
    @Then("user logout successfully")
    public void user_logout_successfully() {
        logoutPage=new LogoutPage(driver);
        assertEquals(logoutPage.getLogOutMessage(),"You Have Succesfully Logged Out!!");
    }
}
