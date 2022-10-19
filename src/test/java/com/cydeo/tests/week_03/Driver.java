package com.cydeo.tests.week_03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private Driver(){}

    static private WebDriver driver;

    public static WebDriver getDriver(){
        if(driver == null) {
            String browserType = ConfigurationReader.getValueOf("browser");
            switch (browserType.toLowerCase()) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            return driver;
        } else {
            System.out.println("We have problem with Driver class");
            return  null;
        }
    }



    public static void closeDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }














}
