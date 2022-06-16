package org.example.stepDefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.HomePage;
import org.junit.Assert;

import java.util.ArrayList;

public class D13_followUsStep {
    HomePage homePage=new HomePage();

    @When("opens facebook link")
    public void  opens_facebook_link() throws InterruptedException {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
        Thread.sleep(1000);
        homePage.facebookTap().click();
        Thread.sleep(1000);
    }
    @When("opens twitter link")
    public void  opens_twitter_link() throws InterruptedException {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
        Thread.sleep(1000);
        homePage.twitterTap().click();
        Thread.sleep(1000);
    }
    @When("opens rss link")
    public void  opens_rss_link() throws InterruptedException {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
        Thread.sleep(1000);
        homePage.rssTap().click();
        Thread.sleep(1000);
    }
    @When("opens YouTube link")
    public void  opens_YouTube_link() throws InterruptedException {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
        Thread.sleep(1000);
        homePage.youtubeTap().click();
        Thread.sleep(1000);
    }

    @Then("^go to correct Tab And check URl \"(.*?)\"")
    public void opens_correct_Tap(String URL) throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tabs.get(1));
        System.out.println(Hooks.driver.getCurrentUrl());
        System.out.println(Hooks.driver.getTitle());

        Assert.assertEquals(Hooks.driver.getCurrentUrl(),URL);

        Hooks.driver.close();
        Hooks.driver.switchTo().window(Tabs.get(0));
        System.out.println(Hooks.driver.getCurrentUrl());
        System.out.println(Hooks.driver.getTitle());
    }
}
