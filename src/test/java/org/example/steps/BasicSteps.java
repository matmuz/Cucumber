package org.example.steps;

import io.cucumber.java.en.Given;
import org.example.pages.TopMenuPage;

import java.io.IOException;

import static org.example.configuration.User.getUser;

public class BasicSteps {

    private final TopMenuPage topMenuPage = new TopMenuPage();

    @Given("User is logged in")
    public void userIsLoggedIn() throws IOException {
        topMenuPage.goToSignInSection().signIn(getUser().getEmail(), getUser().getPassword());

    }
}
