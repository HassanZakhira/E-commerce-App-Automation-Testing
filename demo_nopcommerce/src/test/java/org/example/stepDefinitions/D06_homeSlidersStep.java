package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class D06_homeSlidersStep {

    @Given("user click on first slider")
    public void user_click_on_first_slider() throws InterruptedException {
        Thread.sleep(5000);
      //  WebElement slider=Hooks.driver.findElement(By.className("nivo-imageLink"));
        WebElement slider1=Hooks.driver.findElement(By.xpath("//a[@href=\"http://demo.nopcommerce.com/\"][1]"));
        slider1.click();
        Thread.sleep(5000);
    }
    @Then("relative product for first slider is displayed")
    public void relative_product_for_first_slider_is_displayed() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println(Hooks.driver.getCurrentUrl());
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020");
    }

    @Given("user click on Second slider")
    public void user_click_on_Second_slider() throws InterruptedException {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
        Thread.sleep(5000);
        //  WebElement slider=Hooks.driver.findElement(By.className("nivo-imageLink"));
        WebElement slider2=Hooks.driver.findElement(By.xpath("//a[@href=\"http://demo.nopcommerce.com/\"][2]"));
        slider2.click();
        Thread.sleep(5000);
    }
    @Then("relative product for Second slider is displayed")
    public void relative_product_for_Second_slider_is_displayed() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println(Hooks.driver.getCurrentUrl());
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphone-6");
    }
}
