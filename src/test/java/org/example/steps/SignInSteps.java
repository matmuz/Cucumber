package org.example.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.SignInPage;

import static org.testng.Assert.assertTrue;

public class SignInSteps {

    private final SignInPage signInPage = new SignInPage();

    @When("User Signs In with email {string} and password {string}")
    public void userSignsInWithEmailAndPassword(String email, String password) {
        signInPage.signIn(email, password);
    }

    @Then("Auth error is displayed")
    public void authErrorIsDisplayed() {
        assertTrue(signInPage.isAuthErrorDisplayed(), "Auth error is not displayed, but should be");
    }
}
