package org.example.pages;

import org.example.driver.DriverFactory;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    private final TopMenuPage topMenuPage;

    public BasePage() {
        PageFactory.initElements(DriverFactory.getDriver(), this);
        topMenuPage = new TopMenuPage();
    }

    public TopMenuPage getTopMenuPage() {
        return topMenuPage;
    }
}
