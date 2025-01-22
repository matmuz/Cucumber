package org.example.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import lombok.extern.java.Log;
import org.example.driver.Driver;
import org.example.driver.DriverFactory;

import java.time.Duration;

import static org.example.configuration.ConfigurationRetriever.getConfiguration;

@Log
public class Hooks {

    @Before
    public void setUp() {
        new Driver(getConfiguration().browser());
        DriverFactory.getDriver().navigate().to(getConfiguration().appUrl());
        DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @After
    public void tearDown() {
        DriverFactory.getDriver().quit();
        DriverFactory.removeDriver();
    }
}
