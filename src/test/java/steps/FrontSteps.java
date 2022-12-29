package steps;

import pageObjects.LoginPage;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class FrontSteps {

    LoginPage amazon = new LoginPage();

    @Given("I am on the Amazon search page")
    public void navigateToAmazon(){
        amazon.navigateToAmazon();
    }

    @When("I enter a search criteria")
    public void enterSearchCriteria(){
        amazon.enterSearchCriteria("Libros");
    }

    @And("click on the search button")
    public void clickSearchButton(){
        amazon.clickAmazonSearch();
    }

    @Then("the result match the criteria")
    public void validateResult(){
        Assert.assertEquals("Texto que esperamos", amazon.firstResult());
    }
}

