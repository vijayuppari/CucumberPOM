package com.Stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Shoppingsteps {

    @Given("Login to application with datatable credentials")
    public void login_to_application_with_datatable_credentials(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }
    @Given("user is in Shopping Page")
    public void user_is_in_shopping_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Verify Checkout link is displaying")
    public void verify_checkout_link_is_displaying() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user gets category sections")
    public void userGetsCategorySections() {
    }

    @And("count of categories should be {int}")
    public void countOfCategoriesShouldBe(int arg0) {
    }
}
