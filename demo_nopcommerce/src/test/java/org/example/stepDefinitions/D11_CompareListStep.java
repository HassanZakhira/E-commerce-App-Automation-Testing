package org.example.stepDefinitions;

import org.example.Pages.HomePage;
import org.example.Pages.ProductsPage;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class D11_CompareListStep {
    HomePage homePage=new HomePage();



    ProductsPage productsPage=new ProductsPage();
    @And("Add Random Product to CompareList")
    public void Add_Random_Product() throws InterruptedException {
        productsPage.AddCompareList().click();
        Thread.sleep(3000);
        WebElement CompareMessage = Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification-container\"]"));
        String AR11= CompareMessage.getText();
        System.out.println(AR11);
        Thread.sleep(3000);
        if (AR11.equals("The product has been added to your product comparison")) {
            Assert.assertTrue(AR11.contains("The product has been added to your product comparison"));
            System.out.println("Product have not Attributes");
            Thread.sleep(3000);
        }

        //("Product need to Choose Attributes")
        else {
            ///click on next Add to Wishlist
            Hooks.driver.findElement(By.cssSelector("button[class=\"button-2 add-to-compare-list-button\"]")).click();
            Thread.sleep(1000);

            WebElement CompareMessage1 = Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification-container\"]"));
            String AR12 = CompareMessage1.getText();
            System.out.println(AR12);
            Thread.sleep(1000);

        }
    }
    @And("CompareList updated")
    public void CompareList_updated() throws InterruptedException {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
            homePage.compareList().click();
        Thread.sleep(2000);
        int  CompareProducts=productsPage.CompareProducts().size();
        if( CompareProducts>0)
        {
            System.out.println("There are products in Compare list");
            System.out.println(" CompareProducts is "+ CompareProducts);

        }
        else
        {
            System.out.println("There are No products in Compare list");
        }
        Thread.sleep(2000);
        }
}
