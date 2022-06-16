package org.example.stepDefinitions;

import org.example.Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class D07_FilterColorStep {
    HomePage homePage=new HomePage();

    @Then("Select Apparel Category")
    public void Select_Apparel_Category() throws InterruptedException {
        homePage.apparelCategory().click();
        Thread.sleep(5000);
    }

    @Then("CategoryApparelAssertion")
    public void CategoryApparel_Assertion ()
    {
        WebElement CategoryName=Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
        Assert.assertTrue(CategoryName.isDisplayed());
        System.out.println(CategoryName.getText());
        String AR=homePage.apparelCategory().getText();
        System.out.println(AR);
        Assert.assertTrue(AR.contains(CategoryName.getText()),"CategoryApparelAssertion Done");
    }

    @And("Select shoes SubCategory")
    public void Select_shoes_SubCategory() throws InterruptedException {
        homePage.shoesSubCategory().click();
        Thread.sleep(1000);
    }

    @Then("shoes SubCategory Assertion")
    public void shoes_SubCategory_Assertion ()
    {
        WebElement CategoryName=Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
        Assert.assertTrue(CategoryName.isDisplayed());
        System.out.println(CategoryName.getText());
        String AR=homePage.shoesSubCategory().getText();
        System.out.println(AR);
        Assert.assertTrue(AR.contains(CategoryName.getText()),"CategoryApparelAssertion Done");
    }

    @And("filter Category with Random color")
    public void filter_Category_with_Random_color() throws InterruptedException {
        homePage.apparelColor().click();
        System.out.println("color is "+homePage.apparelColor().getText());
        Thread.sleep(9000);
    }
}