package org.example.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import org.example.pages.TopMenuPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TopMenuSteps {

    private final TopMenuPage topMenuPage = new TopMenuPage();

    @Then("Username {string} is displayed")
    public void usernameIsDisplayed(String username) {
        assertEquals(topMenuPage.getLoggedInAccount(), username,
                     "Logged in username is not equal to expected");
    }

    @Then("Shop logo is displayed")
    public void shopLogoIsDisplayed() {
        assertTrue(topMenuPage.isShopLogoDisplayed(), "Shop logo is not displayed");
    }

    @Then("Main product categories are displayed")
    public void mainProductCategoriesAreDisplayed(DataTable expectedCategories) {
        assertEquals(topMenuPage.getListOfMainCategories(), expectedCategories.asList(),
                     "List of main product categories is different than expected");
    }

    @When("Go to Sign In section")
    public void goToSignInSection() {
        topMenuPage.goToSignInSection();
    }
}
