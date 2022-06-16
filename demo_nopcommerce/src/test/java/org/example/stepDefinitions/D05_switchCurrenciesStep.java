package org.example.stepDefinitions;

import org.example.Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class D05_switchCurrenciesStep {
    HomePage homePage=new HomePage();
    @And("Select Euro")
    public void Select_Euro() throws InterruptedException {
        HomePage homePage=new HomePage();
        homePage.switchCurrencies().selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
        Thread.sleep(5000);
    }
    @Then("see Euro sign")
    public void see_Euro_sign() throws InterruptedException {
        int productNumber=homePage.productPrices().size();
        for (int i=0;i<productNumber;i++)
        {
            String price=homePage.productPrices().get(i).getText();
            Assert.assertTrue(price.contains("€"));
            System.out.println(price);
            Thread.sleep(1000);
        }
    }
}
