package com.Stepdefinitions;

import com.Utils.DriverFactory;
import com.pages.LoginPage;
import com.pages.ShoppingPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class Shoppingsteps {

    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    private ShoppingPage shoppingPage;

    @Given("Login to application with datatable credentials")
    public void login_to_application_with_datatable_credentials(DataTable creddatatable) {
        List<Map<String, String>> credmap = creddatatable.asMaps();
       String username= credmap.get(0).get("username");
        String password= credmap.get(0).get("password");
        DriverFactory.getDriver().get("https://rahulshettyacademy.com/loginpagePractise/");
        shoppingPage = loginPage.doLogin(username,password);

    }
    @Given("user is in Shopping Page")
    public void user_is_in_shopping_page() throws InterruptedException {
        Thread.sleep(3000);
      String titleofsshoping= shoppingPage.getShoppingtitle();
        Assert.assertEquals(titleofsshoping,"ProtoCommerce");
    }
    @Then("Verify Checkout link is displaying")
    public void verify_checkout_link_is_displaying() {
       Assert.assertTrue(shoppingPage.verifycheckoutlink());
    }

    @Then("user gets category sections")
    public void userGetsCategorySections() {
        shoppingPage.getcategorieslist();
    }

    @And("count of categories should be {int}")
    public void countOfCategoriesShouldBe(int actualcount) {
       int expectedcount= shoppingPage.getthecategorycount();
       Assert.assertEquals(expectedcount,actualcount);
    }
}
