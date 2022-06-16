package org.example.stepDefinitions;


import org.example.Pages.HomePage;
import org.example.Pages.ProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class D10_WishlistStep {
    HomePage homePage=new HomePage();


    @Given("Wishlist Overview")
    public void Wishlist_Overview() throws InterruptedException {
        homePage.compareList().click();
        if(Hooks.driver.findElement(By.cssSelector("div[class=\"no-data\"]")).isDisplayed())
        {
            WebElement WishlistMessage=Hooks.driver.findElement(By.cssSelector("div[class=\"no-data\"]"));
            System.out.println(WishlistMessage.getText());
        }
        else
        {
            Assert.assertTrue(homePage.WishlistQty().isDisplayed());
            System.out.println(homePage.WishlistQty().getText());
        }
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
        Thread.sleep(2000);
    }


    ProductsPage productsPage=new ProductsPage();
    @And("Add Random Product to Wishlist")
    public void Add_Random_Product() throws InterruptedException {
        productsPage.AddWishlist().click();
        Thread.sleep(3000);
        WebElement WishMessage=Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification-container\"]"));
        String AR=WishMessage.getText();
        System.out.println(AR);
        Thread.sleep(3000);
        if(AR.equals("The product has been added to your wishlist"))
        {
            Assert.assertTrue(AR.contains("The product has been added to your wishlist"));
            System.out.println("Product have not Attributes");
            Thread.sleep(3000);
        }

        //("Product need to Choose Attributes")
        else
        {
            ///click on next Add to Wishlist
            Hooks.driver.findElement(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]")).click();
            Thread.sleep(1000);

            WebElement WishMessage1=Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification-container\"]"));
            String AR10=WishMessage1.getText();
            System.out.println(AR10);
            Thread.sleep(1000);

            if(AR10.equals("The product has been added to your wishlist"))
            {
                System.out.println("Product have not Attributes");
                Thread.sleep(1000);
            }
            else if (AR10.contains("Please select RAM"))
            {
                System.out.println("Desktop have  Attributes");
                productsPage.Processor().selectByIndex(1);
                productsPage.RAM().selectByIndex(1);
                productsPage.HDD().click();
                Hooks.driver.findElement(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]")).click();
                Thread.sleep(2000);
                WebElement CartMessage2=Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification-container\"]"));
                String AR20=CartMessage2.getText();
                System.out.println(AR20);
                Assert.assertTrue(AR20.contains("The product has been added to your wishlist"));
                Thread.sleep(1000);
            }
            else if ((AR10.equals("Please select Size")&&Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/adidas-consortium-campus-80s-running-shoes")))
            {
                System.out.println("Shoes have  Attributes");
                productsPage.Shoes().selectByIndex(1);

                Hooks.driver.findElement(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]")).click();
                Thread.sleep(2000);
                WebElement CartMessage3=Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification-container\"]"));
                String AR30=CartMessage3.getText();
                System.out.println(AR30);
                Assert.assertTrue(AR30.contains("The product has been added to your wishlist"));
                Thread.sleep(1000);
            }

            else if (AR10.contains("Please select Color"))
            {
                System.out.println("Shoes have  Attributes");
                productsPage.ShoesSize().selectByIndex(1);
                productsPage.ShoesColor().selectByIndex(1);
                productsPage.ShoesPrint().click();

                Hooks.driver.findElement(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]")).click();
                Thread.sleep(2000);
                WebElement CartMessage4=Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification-container\"]"));
                String AR40=CartMessage4.getText();
                System.out.println(AR40);
                Assert.assertTrue(AR40.contains("The product has been added to your wishlist"));
                Thread.sleep(1000);
            }
            else if (AR10.contains("Enter your text:"))
            {
                System.out.println("shirt have  Attributes");
                productsPage.shirtText().sendKeys("Hassan");
                Hooks.driver.findElement(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]")).click();
                Thread.sleep(2000);
                WebElement CartMessage5=Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification-container\"]"));
                String AR50=CartMessage5.getText();
                System.out.println(AR50);
                Assert.assertTrue(AR50.contains("The product has been added to your wishlist"));
                Thread.sleep(1000);
            }
            else if (AR10.equals("Please select Size")&&Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/obey-propaganda-hat"))
            {
                System.out.println("hat have  Attributes");
                productsPage.HatSize().selectByIndex(1);
                Thread.sleep(1000);
                Hooks.driver.findElement(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]")).click();
                Thread.sleep(2000);
                WebElement CartMessage6=Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification-container\"]"));
                String AR60=CartMessage6.getText();
                System.out.println(AR60);
                Assert.assertTrue(AR60.contains("The product has been added to your wishlist"));
                Thread.sleep(1000);
            }
            else if (Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/25-virtual-gift-card"))
            {
                System.out.println("hat have  Attributes");
                productsPage.RecipientName().sendKeys("aaaaaa");
                productsPage.RecipientMail().sendKeys("aaaaaa@gmail.com");
                productsPage.YourName().sendKeys("bbbbbbb");
                productsPage.YourMail().sendKeys("bbbbbbb@gmail.com");
                productsPage.GiftMessage().sendKeys("Thanks Hassan Aboelela");
                Thread.sleep(2000);
                Hooks.driver.findElement(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]")).click();
                Thread.sleep(2000);
                WebElement CartMessage7=Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification-container\"]"));
                String AR70=CartMessage7.getText();
                System.out.println(AR70);
                Assert.assertTrue(AR70.contains("The product has been added to your wishlist"));
                Thread.sleep(1000);
            }

            else if (Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/50-physical-gift-card"))
            {
                System.out.println("hat have  Attributes");
                productsPage.RecipientName50().sendKeys("aaaaaa");
                Thread.sleep(2000);
                productsPage.YourName50().sendKeys("bbbbbbb");
                Thread.sleep(2000);
                productsPage.GiftMessage50().sendKeys("Thanks Hassan Aboelela");
                Thread.sleep(2000);
                Hooks.driver.findElement(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]")).click();
                Thread.sleep(2000);
                WebElement CartMessage77=Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification-container\"]"));
                String AR77=CartMessage77.getText();
                System.out.println(AR77);
                Assert.assertTrue(AR77.contains("The product has been added to your wishlist"));
                Thread.sleep(1000);
            }
            else if (Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/elegant-gemstone-necklace-rental"))
            {
                System.out.println("hat have  Attributes");
                productsPage.RentStart().sendKeys("6/12/2022");
                productsPage.RentEnd().sendKeys("6/12/2022");
                Thread.sleep(1000);
                Hooks.driver.findElement(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]")).click();
                Thread.sleep(2000);
                WebElement CartMessage77=Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification-container\"]"));
                String AR77=CartMessage77.getText();
                System.out.println(AR77);
                Assert.assertTrue(AR77.contains("The product has been added to your wishlist"));
                Thread.sleep(1000);
            }

        }

    }
    int num;
    @And("user get number of items Wishlist after adding product")
    public void Items_number()
    {
        String Text=Hooks.driver.findElement(By.cssSelector("span[class=\"wishlist-qty\"]")).getText();
        System.out.println(Text);
        //convert string to integer
        Text=Text.replaceAll("[^0-9]",""); //still string put remove ()
        num= Integer.parseInt(Text);
        System.out.println("Wislist items is" + num);
        Assert.assertTrue(num>0,"Wishlist increased");
    }
    @Then("number of Wishlist items increased")
    public void Wishlist_increased()
    {
        Assert.assertTrue(num>0,"Wishlist increased");
    }


}
