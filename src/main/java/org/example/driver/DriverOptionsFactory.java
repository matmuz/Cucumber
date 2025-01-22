package org.example.driver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;

import static org.example.configuration.ConfigurationRetriever.getConfiguration;

public class DriverOptionsFactory {

    public static ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        if (getConfiguration().headless()) {
            options.addArguments("--headless=new");
        }
        return options;
    }

    public static EdgeOptions getEdgeOptions() {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");
        if (getConfiguration().headless()) {
            options.addArguments("--headless");
        }
        return options;
    }

}
