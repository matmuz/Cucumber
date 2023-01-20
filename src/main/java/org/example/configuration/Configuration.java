package org.example.configuration;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:configuration.properties")
public interface Configuration extends Config {

    String browser();

    boolean headless();

    String appUrl();
}