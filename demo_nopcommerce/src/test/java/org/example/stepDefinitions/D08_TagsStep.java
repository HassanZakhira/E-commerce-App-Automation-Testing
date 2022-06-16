package org.example.stepDefinitions;

import org.example.Pages.ProductsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;

import java.util.Random;

public class D08_TagsStep {
    ProductsPage productsPage=new ProductsPage();
    Random random = new Random();
    SoftAssert tagPage= new SoftAssert();
    int randomNumber;
    @Given("Guest select random tag")
    public void userSelectRandomTag()
    {
        int numberOfAvailableTags = productsPage.allAvailableTags().size();
        randomNumber=random.nextInt(numberOfAvailableTags);
        productsPage.allAvailableTags().get(randomNumber).click();
    }
    @Then("user should see relative products to the selected tag")
    public void userShouldSeeRelativeProductsToTheSelectedTag()
    {
        tagPage.assertTrue(productsPage.pageTitle().getText().contains(productsPage.allAvailableTags().get(randomNumber).getText()));
        tagPage.assertAll();
    }
}
