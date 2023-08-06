package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static stepDefs.Hooks.*;

public class RegisterPageSteps {
        @Given("A user Navigates to registration URL")
        public void AUserNavigatesToRegistrationURL(){
            driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

    }
        @When("A user inserts valid Data")
        public void AUserInsertsValidData(){
            registerPage.chooseGender("female");
            registerPage.personalData("Nada","Abdulrahman","nada.abdulrahman91@gmail.com");
            registerPage.dateOfBirth("17","8","1999");
            registerPage.companyName("Nagwa");
            registerPage.passwords("12345678","12345678");
    }
        @Then("A registration Msg is appeared")
        public void ARegistrationMsgIsAppeared(){
            Assert.assertEquals(openPage.getRegritionPassMsg(),"Your registration completed");
            softAssert.assertEquals(openPage.getMsgColor(),"#4cb17c","message color isn't green");
            softAssert.assertAll();
    }

}
