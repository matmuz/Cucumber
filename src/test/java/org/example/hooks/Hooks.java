package org.example.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import lombok.extern.java.Log;
import org.example.driver.Driver;
import org.example.driver.DriverFactory;

import static org.example.configuration.ConfigurationRetriever.getConfiguration;

@Log
public class Hooks {

    @Before
    public void setUp() {
        new Driver(getConfiguration().browser());
        DriverFactory.getDriver().navigate().to(getConfiguration().appUrl());
    }

    @After
    public void tearDown() {
        DriverFactory.getDriver().quit();
        DriverFactory.removeDriver();
    }
}
