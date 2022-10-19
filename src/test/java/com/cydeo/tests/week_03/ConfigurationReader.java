package com.cydeo.tests.week_03;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties();

    static {

        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("config.properties");

            properties.load(fileInputStream);
        } catch (Exception e) {
            System.out.println("We have problem with in ConfigurationReader class");
        }

    }

    public static String getValueOf(String key){
        return properties.getProperty(key);
    }





}
