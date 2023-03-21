
package com.Stepdefinitions;

import com.Utils.DriverFactory;
import com.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Loginsteps {

    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
   private static String acttitle;
    @Given("user is on login page")
    public void user_is_on_login_page() {
        DriverFactory.getDriver().get("https://rahulshettyacademy.com/loginpagePractise/");
    }
    @When("user gets the title of page")
    public void user_gets_the_title_of_page() {
         acttitle = loginPage.getPageTitile();
        System.out.println("Title of the Application as " + acttitle);
    }
    @Then("verify the title of the login application")
    public void verify_the_title_of_the_login_application() {
        Assert.assertEquals("LoginPage Practise | Rahul Shetty Academy",acttitle);
    }
    @When("user enters username as {string}")
    public void user_enters_username_as(String username) {
        loginPage.enteruserName(username);
    }
    @When("user enters the password as {string}")
    public void user_enters_the_password_as(String password) {
        loginPage.enterPassword(password);
    }
    @When("user click on the login button")
    public void user_click_on_the_login_button() {
            loginPage.clickterms();
            loginPage.signIn();
    }

}
