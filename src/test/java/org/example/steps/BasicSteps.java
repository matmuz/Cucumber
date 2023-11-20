package org.example.steps;

import cucumber.api.java8.En;
import org.example.pages.TopMenuPage;

import java.io.IOException;

import static org.example.configuration.User.getUser;

public class BasicSteps implements En {

    private final TopMenuPage topMenuPage = new TopMenuPage();

    public BasicSteps() {
        Given("User is logged in", () -> {
            try {
                topMenuPage.goToSignInSection().signIn(getUser().getEmail(), getUser().getPassword());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        throw new io.cucumber.java8.PendingException();
    }



//    @Given("User is logged in")
//    public void userIsLoggedIn() throws IOException {
//        topMenuPage.goToSignInSection().signIn(getUser().getEmail(), getUser().getPassword());
//
//    }
}
