package StepDefinitions;

import BaseTest.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class LoginTest extends BaseTest{
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
      var homepage=loginPage.clickLoginButton();

    }
    @Then("User Should Login Successfully")
    public void user_should_login_successfully() {
        assertEquals(homePage.getWelcomeMessage(),"Welcome To Manager's Page of Guru99 Bank");
    }
}
