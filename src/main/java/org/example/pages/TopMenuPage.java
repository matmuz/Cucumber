package org.example.pages;

import org.example.driver.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class TopMenuPage {

    @FindBy(css = "img.logo")
    private WebElement shopLogo;
    @FindBy(css = ".account")
    private WebElement account;
    @FindBy(css = ".user-info .material-icons")
    private WebElement userIcon;
    @FindBy(css = ".dropdown-item:not(.dropdown-submenu)")
    private List<WebElement> mainCategories;

    public TopMenuPage() {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    public boolean isShopLogoDisplayed() {
        return shopLogo.isDisplayed();
    }

    public boolean isUsernameVisible() {
        return account.isDisplayed();
    }

    public String getLoggedInAccount() {
        return account.getText();
    }

    public List<String> getListOfMainCategories() {
        List<String> mainCategoriesLabels = new ArrayList<>();
        mainCategories.forEach(category -> mainCategoriesLabels.add(category.getText()));
        return mainCategoriesLabels;
    }

    public SignInPage goToSignInSection() {
        userIcon.click();
        return new SignInPage();
    }
}
