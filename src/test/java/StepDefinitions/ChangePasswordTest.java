package StepDefinitions;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.changePasswordPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static BaseTest.BaseTest.driver;
import static org.junit.Assert.assertEquals;

public class ChangePasswordTest {
    LoginPage loginPage;
    HomePage homePage;
    changePasswordPage changePasswordPage;
    @Given("user is in the home page by valid credentials1 {string} and {string}")
    public void user_is_in_the_home_page_by_valid_credentials1_and(String username, String password) {
        loginPage=new LoginPage(driver);
        homePage=new HomePage(driver);
        loginPage.setUserName(username);
        loginPage.setPassword(password);
        var homepage=loginPage.clickLoginButton();
    }
    @When("user clicks on change password button")
    public void user_clicks_on_change_password_button() {
        changePasswordPage=new changePasswordPage(driver);
        var changePasswordPage=homePage.clickChangePassword();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @When("user enter {string} and {string} and {string}")
    public void user_enter_and_and(String oldPassword, String newPassword, String confirmedPassword) {
        changePasswordPage.enterOldPassword(oldPassword);
        changePasswordPage.enterNewPassword(newPassword);
        changePasswordPage.enterConfirmPassword(confirmedPassword);
        changePasswordPage.clickSubmit();
        assertEquals(changePasswordPage.getPopUpMessage(),"Password is Changed");
    }
    @Then("user can login again with the changed password {string}")
    public void user_can_login_again_with_the_changed_password(String newPassword) {
        changePasswordPage.acceptAlert();
        loginPage.setUserName("mngr455793");
        loginPage.setPassword(newPassword);
        var homepage2=loginPage.clickLoginButton();
        Assert.assertEquals(homepage2.getWelcomeMessage(),"Welcome To Manager's Page of Guru99 Bank");
    }
}
