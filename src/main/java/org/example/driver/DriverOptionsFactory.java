package org.example.driver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;

import static org.example.configuration.ConfigurationRetriever.getConfiguration;

public class DriverOptionsFactory {

    public static ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(getConfiguration().headless()).addArguments("--start-maximized", "--incognito");
        return options;
    }

    public static EdgeOptions getEdgeOptions() {
        EdgeOptions options = new EdgeOptions();
        options.setHeadless(getConfiguration().headless()).addArguments("--start-maximized", "--inprivate");
        return options;
    }

}
