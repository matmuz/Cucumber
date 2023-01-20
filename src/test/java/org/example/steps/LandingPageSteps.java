package org.example.steps;

import io.cucumber.java.en.Then;
import org.example.pages.LandingPage;

import static org.testng.Assert.assertEquals;

public class LandingPageSteps {

    private final LandingPage landingPage = new LandingPage();

    @Then("Number of popular products is equal to {int}")
    public void numberOfPopularProductsIsEqualTo(int count) {
        assertEquals(landingPage.getNumberOfPopularProducts(), count,
                     "The number of popular products on Landing Page is not equal to expected");
    }
}
