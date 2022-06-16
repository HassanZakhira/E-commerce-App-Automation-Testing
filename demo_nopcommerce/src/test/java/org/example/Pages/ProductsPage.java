package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.example.stepDefinitions.Hooks;

import java.util.List;
import java.util.Random;

public class ProductsPage {
    Random random = new Random();
    int randomProductNumber = this.random.nextInt(2);
    public WebElement RandomProduct()
    {
        List<WebElement> RandomProduct = Hooks.driver.findElements(By.cssSelector("button[class=\"button-2 product-box-add-to-cart-button\"]"));
        WebElement Product= RandomProduct.get(randomProductNumber);
        return Product;
    }
    public List<WebElement> allAvailableTags()
    {
        List <WebElement> allAvailableTags = Hooks.driver.findElements(By.xpath("//div[@class=\"tags\"]/ul/li/a"));
        return allAvailableTags;
    }
    public WebElement pageTitle()
    {
        WebElement pageTitle= Hooks.driver.findElement(By.xpath("//div[@class=\"page-title\"]/h1"));
        return pageTitle;
    }

    ///Desktop
    public Select Processor()
    {
        WebElement Processor= Hooks.driver.findElement(By.id("product_attribute_1"));
        Select PS = new Select(Processor);
        return  PS;
    }
    public Select RAM()
    {
        WebElement RAM= Hooks.driver.findElement(By.id("product_attribute_2"));
        Select RAMSelected = new Select(RAM);
        return  RAMSelected;
    }
    public WebElement HDD()
    {
        WebElement HDD=Hooks.driver.findElement(By.id("product_attribute_3_6"));
        return HDD ;
    }
    //Shoes adidas Consortium Campus 80s Running Shoes
    public Select Shoes()
    {
        WebElement ShoesSize=Hooks.driver.findElement(By.id("product_attribute_9"));
        Select ShoesSizeSelected = new Select(ShoesSize);
        return ShoesSizeSelected ;
    }
    //Nike Floral Roshe Customized Running Shoes
    public Select ShoesSize()
    {
        WebElement ShoesSize=Hooks.driver.findElement(By.id("product_attribute_6"));
        Select ShoesSizeSelected = new Select(ShoesSize);
        return ShoesSizeSelected ;
    }
    public Select ShoesColor()
    {
        WebElement ShoesColor=Hooks.driver.findElement(By.id("product_attribute_7"));
        Select ShoesColorSelected = new Select(ShoesColor);
        return ShoesColorSelected ;
    }
    public WebElement ShoesPrint()
    {
        WebElement ShoesPrint=Hooks.driver.findElement(By.cssSelector("span[class=\"attribute-square\"]"));
        return ShoesPrint ;
    }
    //Custom T-Shirt
    public WebElement shirtText()
    {
        WebElement shirtText=Hooks.driver.findElement(By.cssSelector("input[name=\"product_attribute_12\"]"));
        return shirtText ;
    }
    //Obey Propaganda Hat
    public WebElement Hat()
    {
        WebElement Hat=Hooks.driver.findElement(By.cssSelector("div[class=\"product-name\"]"));
        return Hat ;
    }
    public Select HatSize()
    {
        WebElement HatSize1=Hooks.driver.findElement(By.cssSelector("select[name=\"product_attribute_13\"]"));
        Select HatSize = new Select(HatSize1);
        return HatSize ;
    }

    //Gift Card
    public WebElement RecipientName()
    {
        WebElement RecipientName=Hooks.driver.findElement(By.id("giftcard_43_RecipientName"));
        return RecipientName ;
    }
    public WebElement RecipientMail()
    {
        WebElement RecipientMail=Hooks.driver.findElement(By.id("giftcard_43_RecipientEmail"));
        return RecipientMail ;
    }
    public WebElement YourName()
    {
        WebElement YourName=Hooks.driver.findElement(By.id("giftcard_43_SenderName"));
        return YourName ;
    }
    public WebElement YourMail()
    {
        WebElement YourMial=Hooks.driver.findElement(By.id("giftcard_43_SenderEmail"));
        return YourMial ;
    }
    public WebElement GiftMessage()
    {
        WebElement GiftMessage=Hooks.driver.findElement(By.id("giftcard_43_Message"));
        return GiftMessage ;
    }
    //$50 Physical Gift Card
    public WebElement RecipientName50()
    {
        WebElement RecipientName50=Hooks.driver.findElement(By.id("giftcard_44_RecipientName"));
        return RecipientName50 ;
    }
    public WebElement YourName50()
    {
        WebElement YourName50=Hooks.driver.findElement(By.id("giftcard_44_SenderName"));
        return YourName50 ;
    }
    public WebElement GiftMessage50()
    {
        WebElement GiftMessage50=Hooks.driver.findElement(By.id("giftcard_44_Message"));
        return GiftMessage50 ;
    }
    ///Elegant Gemstone Necklace (rental)
    public WebElement RentStart()
    {
        WebElement  RentStart=Hooks.driver.findElement(By.id("rental_start_date_40"));
        return  RentStart ;
    }
    public WebElement RentEnd()
    {
        WebElement  RentEnd=Hooks.driver.findElement(By.id("rental_end_date_40"));
        return  RentEnd ;
    }

///
    public WebElement AddWishlist()
    {
        List<WebElement> AddWishlist = Hooks.driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));
        WebElement Add= AddWishlist.get(randomProductNumber);
        return Add;
    }
    //compare
    public WebElement AddCompareList()
    {
        List<WebElement> AddCompareList = Hooks.driver.findElements(By.cssSelector("button[class=\"button-2 add-to-compare-list-button\"]"));
        WebElement Add= AddCompareList.get(randomProductNumber);
        return Add;
    }
    public List<WebElement> CompareProducts()
    {
        List<WebElement> Products = Hooks.driver.findElements(By.cssSelector("a[class=\"picture\"]"));
        return Products;
    }

    //Search
    public List<WebElement> items()
    {
        List <WebElement> items = Hooks.driver.findElements(By.cssSelector("div[class=\"details\"]"));
        return items;
    }

}




