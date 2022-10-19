package com.cydeo.tests.week_03;

import org.testng.annotations.Test;

public class ConfigurationTest {

    @Test
    public void testConfig() {

        String url = ConfigurationReader.getValueOf("url");
        System.out.println(url);


    }
}
