package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LandingPage extends BasePage {

    @FindBy(css = ".thumbnail-container")
    private List<WebElement> products;

    public int getNumberOfPopularProducts() {
        return products.size();
    }
}
