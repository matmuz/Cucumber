package org.example.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Driver {

    public Driver(String browser) {
        if (DriverFactory.getDriver() == null) {
            WebDriver driver;
            switch (browser) {
                case "chrome":
                    driver = new ChromeDriver(DriverOptionsFactory.getChromeOptions());
                    break;
                case "edge":
                    driver = new EdgeDriver(DriverOptionsFactory.getEdgeOptions());
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported driver selected");
            }
            DriverFactory.addDriver(driver);
        }
    }
}