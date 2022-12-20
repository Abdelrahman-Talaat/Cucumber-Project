package StepDefinitions;

import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static BaseTest.BaseTest.driver;
import static org.junit.Assert.assertEquals;

public class LoginTest {

   LoginPage loginPage;
   HomePage homePage;

    @Given("User Is In The Login Page")
    public void user_is_in_the_login_page() {
          loginPage=new LoginPage(driver);
    }
    @When("User Enters {string} and {string}")
    public void user_enters_and(String username, String Password) {
      loginPage.setUserName(username);
      loginPage.setPassword(Password);
      homePage=loginPage.clickLoginButton();

    }
    @Then("User Should Login Successfully")
    public void user_should_login_successfully() {
        assertEquals(homePage.getWelcomeMessage(),"Welcome To Manager's Page of Guru99 Bank");
    }
}
