package org.example.stepDefinitions;

import org.example.Pages.HomePage;
import org.example.Pages.ProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class D04_Search {
    HomePage homePage=new HomePage();
    ProductsPage productsPage=new ProductsPage();
    @Given("click on search field in Home page")
    public void click_on_search_field_in_Home_page() throws InterruptedException {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
        Thread.sleep(1000);
        homePage.searchField().click();
    }
    @And("^search for any product like \"(.*?)\"")
    public void search_for_any_product_like_Apple(String Search) throws InterruptedException {
        homePage.searchField().sendKeys(Search);
        homePage.searchButton().click();
        Thread.sleep(2000);
    }
    @Then("Assertion Soft Go to URL")
    public void Assertion_Soft(){
        String URL=Hooks.driver.getCurrentUrl();
        System.out.println(URL);
        Assert.assertTrue((URL).contains("https://demo.nopcommerce.com/search?q="),"All Done");
    }
    @And("results size is more than zero")
    public void results_size_is_more_than_zero() throws InterruptedException {
        int itemsNumber =productsPage.items().size();
        System.out.println("itemsNumber="+ itemsNumber);
        Assert.assertTrue(itemsNumber>0,"items Number IN Search>0");
    }
    @And("^search for any product By SKU Search \"(.*?)\"")
    public void search_for_any_product_By_SKU(String Search) throws InterruptedException {
        homePage.searchField().sendKeys(Search);
        homePage.searchButton().click();
        Thread.sleep(2000);
    }
    @Then("See correct Product OF SKU")
    public void seeCorrectProduct()
    {
        WebElement ProductName= Hooks.driver.findElement(By.cssSelector("h2[class=\"product-title\"]"));
        System.out.println(ProductName.getText());
        Assert.assertTrue(ProductName.getText().contains("Apple MacBook Pro 13-inch"));
    }

}
