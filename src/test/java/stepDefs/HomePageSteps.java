package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static stepDefs.Hooks.*;

public class HomePageSteps {
        @Given("A user Navigates to homepage URL")
        public void AUserNavigatesToHomepageURL(){
            driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

            registerPage.chooseGender("female");
            registerPage.personalData("Sondos","Nasser","mahmoudNasser22@gmail.com");
            registerPage.dateOfBirth("1","1","2000");
            registerPage.companyName("Vois");
            registerPage.passwords("27863686","27863686");
            registerPage.ClickContinue();

        }
    @When("A user click to add to wishlist&cart")
    public void a_user_click_to_add_to_wishlist_cart() {
           loginPage.Login("mahmoudNasser22@gmail.com","27863686");
           homePage.MoveToElement();
           homePage.AddToWishlist();
           homePage.WishlistCart();
           homePage.CheckAddToCart();
           homePage.AddToCart();

       }

        @Then("A product name is appeared")
        public void AProductNameIsAppeared(){
            softAssert.assertTrue(homePage.getProductNameDisplayed().contains("HTC One M8 Android L 5.0 Lollipop"),"Failed");

            softAssert.assertAll();
        }

    }



