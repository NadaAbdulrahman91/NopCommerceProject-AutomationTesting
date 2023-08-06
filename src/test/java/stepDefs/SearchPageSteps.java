package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static stepDefs.Hooks.*;

public class SearchPageSteps {

    @Given("A user Navigates to The Search URL")
    public void aUserNavigatesToTheSearchURL() {
        driver.get("https://demo.nopcommerce.com/");
    }
        @When("A user searching to {string} successfully")
        public void Searching(String ProductName) {
            searchPage.searching(ProductName);

        }


    @Then("The result of searching contains {string}")
    public void the_result_of_searching_contains(String string) {
        Assert.assertTrue(searchPage.searchKeyWordChecker(string),"Failed Search");
        softAssert.assertAll();

    }

//    @Then("The result of searching contains book")
//    public void theResultOfSearchingContainsBook() {
//        Assert.assertTrue(searchPage.searchKeyWordChecker("book"),"Failed Search");
//        softAssert.assertAll();
//    }
}


