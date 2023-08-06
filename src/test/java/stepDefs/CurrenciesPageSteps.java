package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static stepDefs.Hooks.*;

public class CurrenciesPageSteps {

    @Given("A user Navigates to The website URL")
    public void a_user_navigates_to_the_website_url() {
        driver.get("https://demo.nopcommerce.com/");
    }
    @When("A user changed currency successfully")
    public void a_user_changed_currency_successfully() {
        currenciesPage.CheckCurrency("Euro");
        currenciesPage.checkIfCurrency€("€");
    }
    @Then("The currencies of all products  is changed to Euro")
    public void the_currencies_of_all_products_is_changed_to_euro() {
        Assert.assertTrue(currenciesPage.checkIfCurrency€("€"),"the currency isn't euro!");
        softAssert.assertAll();

    }

}
