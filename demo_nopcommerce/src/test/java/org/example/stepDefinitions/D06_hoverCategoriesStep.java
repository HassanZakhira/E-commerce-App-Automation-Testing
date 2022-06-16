package org.example.stepDefinitions;

import org.example.Pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Random;

public class D06_hoverCategoriesStep {
      HomePage homePage=new HomePage();
    Random random = new Random();
    int randomNumber = this.random.nextInt(3);
    int randomNumber2 = this.random.nextInt(3);
    @When("user hover random category")
    public void user_hover_category() throws InterruptedException {
        homePage.categoriesHaveSub().get(randomNumber).click();
        Thread.sleep(2000);
    }
    @Then("CategoryNameAssertion")
    public void CategoryName_Assertion ()
    {
        WebElement CategoryName=Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
        Assert.assertTrue(CategoryName.isDisplayed());
        System.out.println("CategoryName : " + CategoryName.getText());
      //  System.out.println(CategoryName.getText().toLowerCase());
        String AR=homePage.categoriesHaveSub().get(randomNumber).getText();
        Assert.assertTrue(AR.contains(CategoryName.getText()),"Category Assertion Done");
    }
    @When("select random subcategory")
    public void select_subcategory() throws InterruptedException {
        if(homePage.allSubCategories().get(randomNumber2).isDisplayed()) {
            homePage.allSubCategories().get(randomNumber2).click();
        }
        Thread.sleep(2000);
    }
    @Then("subCategoryNameAssertion")
    public void SubCategory_Assertion()
    {
        WebElement SubCategoryName=Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
        Assert.assertTrue(SubCategoryName.isDisplayed());
        System.out.println("subCategoryName : " + SubCategoryName.getText());
       // System.out.println(SubCategoryName.getText().toLowerCase());
        String AR=homePage.allSubCategories().get(randomNumber2).getText();
        Assert.assertTrue(AR.contains(SubCategoryName.getText()),"SubCategory Assertion Done");
    }
}
