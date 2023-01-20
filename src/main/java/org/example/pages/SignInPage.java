package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

    @FindBy(css = "#login-form input[type='email']")
    private WebElement emailInput;
    @FindBy(css = "#login-form input[type='password']")
    private WebElement passwordInput;
    @FindBy(css = "#submit-login")
    private WebElement signInButton;
    @FindBy(css = ".alert")
    private WebElement alert;

    public boolean isAuthErrorDisplayed() {
        return alert.isDisplayed();
    }

    public YourAccountPage signIn(String email, String password) {
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        signInButton.click();
        return new YourAccountPage();
    }
}
