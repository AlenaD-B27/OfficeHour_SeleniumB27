package com.cydeo.tests.week_03;

import org.testng.annotations.Test;

public class DriverTest {

    @Test
    public void testDriver() {
        Driver.getDriver().get(ConfigurationReader.getValueOf("url"));
        Driver.closeDriver();
    }
}
