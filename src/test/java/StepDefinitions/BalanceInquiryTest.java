package StepDefinitions;

import Pages.BalanceInquirypage;
import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static BaseTest.BaseTest.driver;
import static org.testng.Assert.assertEquals;

public class BalanceInquiryTest {
    LoginPage loginPage;
    HomePage homePage;
    BalanceInquirypage balanceInquirypage;
    @Given("user is in the home page by valid credentials2 {string} and {string}")
    public void user_is_in_the_home_page_by_valid_credentials2_and(String username, String password) {
        loginPage=new LoginPage(driver);
        homePage=new HomePage(driver);
        loginPage.setUserName(username);
        loginPage.setPassword(password);
        var homepage=loginPage.clickLoginButton();
    }
    @When("user clicks on balance inquiry")
    public void user_clicks_on_balance_inquiry() {
       balanceInquirypage=new BalanceInquirypage(driver);
       var balanceInquiryPage=homePage.clickBalanceInquiry();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @When("user enters Acc No {string} and click submit")
    public void user_enters_acc_no_and_click_submit(String accNo) {
        balanceInquirypage.setAccountNumber(accNo);
        balanceInquirypage.clickSubmitButton();
    }
    @Then("alert will be displayed and when accept it user will be directed to balance inquiry form")
    public void alert_will_be_displayed_and_when_accept_it_user_will_be_directed_to_balance_inquiry_form() {
        assertEquals(balanceInquirypage.getPopUpMessage(),"Account does not exist");
        balanceInquirypage.acceptAlert();
        assertEquals(balanceInquirypage.getPageMessage(),"Balance Enquiry Form");
    }
}
