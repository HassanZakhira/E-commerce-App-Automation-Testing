package org.example.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    //define before & after annotation for browser
    public static WebDriver driver=null;
    //global variable must have value
    // null to be clear in all test case as reset
    // Static ? to you does not need to create new object like Hook hook =newHooks;
@Before
    public  void openBrowser() throws InterruptedException {
    //1- should be first method
    System.setProperty("webdriver.chrome.driver","E:\\testing\\Cucumber\\chrome driver\\chrome driver 102\\chromedriver.exe");
    //2- new object
    driver =new ChromeDriver();
    //configuration the driver
    driver.manage().window().maximize();
    //navigate to url
    driver.navigate().to("https://demo.nopcommerce.com/");
    //implicitWait
    //Only one condition :check if element is present in DOM page
    //if present do action
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    Thread.sleep(5000);
}
@After
    public  void quiteBrowser() throws InterruptedException {
    Thread.sleep(5000);
    driver.quit();
}
}
