package com.quandoo.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {

    //Initial webdriver declaration
    public static WebDriver driver;

    //Info method to print browser name
    public void chooseBrowserName(String browserName) {
        System.out.println("Initializing the choosen browser: " + browserName);
    }

    //Main method to config driver and props
    public WebDriver initDriver() throws IOException {

        //Configuration object
        Properties props = new Properties();
        FileInputStream inputFile = new FileInputStream("/Users/mateusz/IdeaProjects/proofofconceptquandoo/src/main/java/com/quandoo/resources/configFile.properties");

        props.load(inputFile);
        String browserName = props
                    .getProperty("browser")
                    .toLowerCase();

        switch (browserName) {
            case "chrome":
                driver = new ChromeDriver();
                chooseBrowserName(browserName);
                break;
             default:
                 System.out.println("Browser " + browserName + " is invalid, launching Chrome as default choice...");
                 driver = new ChromeDriver();
        }

        //Custom wait setup
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Clearing and maximizing
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        return driver;
    }

}
























