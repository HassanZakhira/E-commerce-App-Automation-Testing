package org.example.stepDefinitions;

import org.example.Pages.HomePage;
import org.example.Pages.ProductsPage;
import org.example.Pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Random;


public class D09_ShoppingStep {
    HomePage homePage=new HomePage();
    ShoppingCartPage shoppingCartPage=new ShoppingCartPage();
    Random random = new Random();
    int randomNumber = this.random.nextInt(7);
    int randomNumber2 = this.random.nextInt(3);

    @Then("Cart Overview")
    public void Cart_Overview() throws InterruptedException {
        homePage.CartTap().click();
        if(Hooks.driver.findElement(By.cssSelector("div[class=\"no-data\"]")).isDisplayed())
        {
            WebElement CartMessage=Hooks.driver.findElement(By.cssSelector("div[class=\"no-data\"]"));
            System.out.println(CartMessage.getText());
        }
        else
        {
            Assert.assertTrue(shoppingCartPage.Total().isDisplayed());
            System.out.println(shoppingCartPage.Total().getText());
        }
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
        Thread.sleep(2000);
    }

    @When("select random category")
    public void select_random_category() throws InterruptedException {
        homePage.categories().get(randomNumber).click();
        Thread.sleep(1000);
    }

    @And("check if category have subcategory")
    public void check_if_category_have_subcategory() throws InterruptedException {
        if (0<=randomNumber&&randomNumber<3){
            if(homePage.allSubCategories().get(randomNumber2).isDisplayed()) {
                homePage.allSubCategories().get(randomNumber2).click();
            }
            Thread.sleep(5000);
        }
    }
ProductsPage productsPage=new ProductsPage();
    @And("Add Random Product to cart")
    public void Add_Random_Product() throws InterruptedException {
      productsPage.RandomProduct().click();
        Thread.sleep(3000);
        WebElement CartMessage=Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification-container\"]"));
        String AR=CartMessage.getText();
        System.out.println(AR);
        Thread.sleep(3000);
        if(AR.equals("The product has been added to your shopping cart"))
        {
            Assert.assertTrue(AR.contains("The product has been added to your shopping cart"));
            System.out.println("Product have not Attributes");
            Thread.sleep(3000);
        }

        //("Product need to Choose Attributes")
        else
        {
            ///click on next Add to cart
            Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 add-to-cart-button\"]")).click();
            Thread.sleep(1000);

            WebElement CartMessage1=Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification-container\"]"));
            String AR1=CartMessage1.getText();
            System.out.println(AR1);
            Thread.sleep(1000);

            if(AR1.equals("The product has been added to your shopping cart"))
            {
                System.out.println("Product have not Attributes");
                Thread.sleep(1000);
            }
            else if (AR1.contains("Please select RAM"))
            {
                System.out.println("Desktop have  Attributes");
                productsPage.Processor().selectByIndex(1);
                productsPage.RAM().selectByIndex(1);
                productsPage.HDD().click();
                Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 add-to-cart-button\"]")).click();
                Thread.sleep(2000);
                WebElement CartMessage2=Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification-container\"]"));
                String AR2=CartMessage2.getText();
                System.out.println(AR2);
                Assert.assertTrue(AR2.contains("The product has been added to your shopping cart"));
                Thread.sleep(1000);
            }
            else if ((AR1.equals("Please select Size")&&Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/adidas-consortium-campus-80s-running-shoes")))
            {
                System.out.println("Shoes have  Attributes");
                productsPage.Shoes().selectByIndex(1);

                Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 add-to-cart-button\"]")).click();
                Thread.sleep(2000);
                WebElement CartMessage3=Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification-container\"]"));
                String AR3=CartMessage3.getText();
                System.out.println(AR3);
                Assert.assertTrue(AR3.contains("The product has been added to your shopping cart"));
                Thread.sleep(1000);
            }

           else if (AR1.contains("Please select Color"))
            {
                System.out.println("Shoes have  Attributes");
                productsPage.ShoesSize().selectByIndex(1);
                productsPage.ShoesColor().selectByIndex(1);
                productsPage.ShoesPrint().click();

                Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 add-to-cart-button\"]")).click();
                Thread.sleep(2000);
                WebElement CartMessage4=Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification-container\"]"));
                String AR4=CartMessage4.getText();
                System.out.println(AR4);
                Assert.assertTrue(AR4.contains("The product has been added to your shopping cart"));
                Thread.sleep(1000);
            }
            else if (AR1.contains("Enter your text:"))
            {
                System.out.println("shirt have  Attributes");
                productsPage.shirtText().sendKeys("Hassan");
                Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 add-to-cart-button\"]")).click();
                Thread.sleep(2000);
                WebElement CartMessage5=Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification-container\"]"));
                String AR5=CartMessage5.getText();
                System.out.println(AR5);
                Assert.assertTrue(AR5.contains("The product has been added to your shopping cart"));
                Thread.sleep(1000);
            }
            else if (AR1.equals("Please select Size")&&Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/obey-propaganda-hat"))
            {
                System.out.println("hat have  Attributes");
                productsPage.HatSize().selectByIndex(1);
                Thread.sleep(1000);
                Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 add-to-cart-button\"]")).click();
                Thread.sleep(2000);
                WebElement CartMessage6=Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification-container\"]"));
                String AR6=CartMessage6.getText();
                System.out.println(AR6);
                Assert.assertTrue(AR6.contains("The product has been added to your shopping cart"));
                Thread.sleep(1000);
            }
            else if (Hooks.driver.getCurrentUrl().equals("https://demo.nopcommerce.com/25-virtual-gift-card"))
        {
            System.out.println("hat have  Attributes");
            productsPage.RecipientName().sendKeys("aaaaaa");
            productsPage.RecipientMail().sendKeys("aaaaaa@gmail.com");
            productsPage.YourName().sendKeys("bbbbbbb");
            productsPage.GiftMessage().sendKeys("Thanks Hassan Aboelela");
            Thread.sleep(2000);
            Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 add-to-cart-button\"]")).click();
            Thread.sleep(2000);
            WebElement CartMessage7=Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification-container\"]"));
            String AR7=CartMessage7.getText();
            System.out.println(AR7);
            Assert.assertTrue(AR7.contains("The product has been added to your shopping cart"));
            Thread.sleep(1000);
        }

             else if (Hooks.driver.getCurrentUrl().equals("https://demo.nopcommerce.com/50-physical-gift-card"))
        {
            System.out.println("hat have  Attributes");
            productsPage.RecipientName50().sendKeys("aaaaaa");
            Thread.sleep(2000);
            productsPage.YourName50().sendKeys("bbbbbbb");
            Thread.sleep(2000);
            productsPage.GiftMessage50().sendKeys("Thanks Hassan Aboelela");
            Thread.sleep(2000);
            Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 add-to-cart-button\"]")).click();
            Thread.sleep(2000);
            WebElement CartMessage7=Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification-container\"]"));
            String AR7=CartMessage7.getText();
            System.out.println(AR7);
            Assert.assertTrue(AR7.contains("The product has been added to your shopping cart"));
            Thread.sleep(1000);
        }
            else if (Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/elegant-gemstone-necklace-rental"))
            {
                System.out.println("hat have  Attributes");
                productsPage.RentStart().sendKeys("7/12/2022");
                productsPage.RentEnd().sendKeys("7/12/2022");
                Thread.sleep(2000);
                Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 add-to-cart-button\"]")).click();
                Thread.sleep(2000);
                WebElement GiftMessage77=Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification-container\"]"));
                String AR770=GiftMessage77.getText();
                System.out.println(AR770);
                Assert.assertTrue(AR770.contains("The product has been added to your shopping cart"));
                Thread.sleep(1000);
            }

        }

    }

    @Then("Cart Updated And prise is displayed")
    public void CartUpdated() throws InterruptedException {

        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
        Thread.sleep(1000);
        homePage.CartTap().click();
        Thread.sleep(1000);
        System.out.println(shoppingCartPage.Total().getText());
        Assert.assertTrue(shoppingCartPage.Total().isDisplayed());
    }
    @And("Products in cart Greater than zero")
    public void Products_in_cart_Greater_than_zero()
    {
        int Products= shoppingCartPage.ShoppingItems().size();
        System.out.println("Products is "+Products);
        Assert.assertTrue(Products>0);
    }

}
