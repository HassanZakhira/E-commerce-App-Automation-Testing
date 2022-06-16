package org.example.Pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class HomePage {
    public WebElement registerTap ()
    {
        WebElement register_hyperlink= Hooks.driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));
        return register_hyperlink;
    }
    public WebElement login ()
    {
        WebElement login= Hooks.driver.findElement(By.cssSelector("a[class=\"ico-login\"]"));
        return login;
    }
    public WebElement MyAccount()
    {
        WebElement MyAccount =Hooks.driver.findElement(By.cssSelector("a[class=\"ico-account\"]"));
        return MyAccount;
    }
    public WebElement searchField ()
    {
        WebElement searchField= Hooks.driver.findElement(By.cssSelector("input[id=\"small-searchterms\"]"));
        return searchField;
    }
    public WebElement searchButton ()
    {
        WebElement searchButton= Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
        return searchButton;
    }
    public Select switchCurrencies()
    {
        WebElement switchCurrencies= Hooks.driver.findElement(By.cssSelector("select[id=\"customerCurrency\"]"));
        Select Currencies = new Select(switchCurrencies);
        return Currencies;
    }

    public List<WebElement> productPrices ()
    {
        List <WebElement> productPrices = Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
        return productPrices;
    }
    public List<WebElement> categories ()
    {
        List <WebElement> categories = Hooks.driver.findElements(By.xpath("//div[@class=\"header-menu\"]//child::ul[@class=\"top-menu notmobile\"]/li/a"));
        return categories;
    }
    public List<WebElement> categoriesHaveSub ()
    {
        List <WebElement> categoriesHaveSub = Hooks.driver.findElements(By.xpath("//div[@class=\"header-menu\"]//child::ul[@class=\"top-menu notmobile\"]//li //a //following-sibling::div //preceding-sibling::a"));
        return categoriesHaveSub;
    }
    public List<WebElement> allSubCategories ()
    {
        List <WebElement> allSubCategories = Hooks.driver.findElements(By.xpath("//div[@class=\"listbox\"]//child::ul[@class=\"list\"]//li//ul//a"));
        return allSubCategories;
    }
    public WebElement apparelCategory ()
    {
        List <WebElement> Category = Hooks.driver.findElements(By.xpath("//div[@class=\"header-menu\"]//child::ul[@class=\"top-menu notmobile\"]/li/a"));
        return Category.get(2);
    }
    public WebElement shoesSubCategory ()
    {
        List <WebElement> allSubCategories = Hooks.driver.findElements(By.xpath("//div[@class=\"listbox\"]//child::ul[@class=\"list\"]//li//ul//a"));
        WebElement shoesSubCategory= allSubCategories.get(0);
        return shoesSubCategory;
    }
    Random random = new Random();
    int randomColorNumber = this.random.nextInt(3);
    public WebElement apparelColor()
    {
        List <WebElement> apparelColor = Hooks.driver.findElements(By.xpath("//div[@class=\"filter-content\"]//child::li[@class=\"item color-item\"]"));
        WebElement RandomColor= apparelColor.get(randomColorNumber);
        return RandomColor;
    }
    public WebElement CartTap()
    {
        WebElement CartTap= Hooks.driver.findElement(By.cssSelector("span[class=\"cart-label\"]"));
        return CartTap;
    }

    public WebElement WishlistTap()
    {
        WebElement WishlistTap= Hooks.driver.findElement(By.cssSelector("span[class=\"wishlist-label\"]"));
        return WishlistTap;
    }
    public WebElement WishlistQty()
    {
        WebElement WishlistQty= Hooks.driver.findElement(By.cssSelector("span[class=\"wishlist-label\"]"));
        return WishlistQty;
    }
    //compareList
    public WebElement compareList()
    {
        WebElement compareList= Hooks.driver.findElement(By.cssSelector("a[href=\"/compareproducts\"]"));
        return compareList;
    }

    public WebElement OrderTap()
    {
        WebElement Order= Hooks.driver.findElement(By.cssSelector("a[href=\"/order/history\"]"));
        return Order;
    }
    public WebElement AddressesTap()
    {
        WebElement Address= Hooks.driver.findElement(By.cssSelector("a[href=\"/customer/addresses\"]"));
        return Address;
    }

    //Follow us
    public WebElement twitterTap()
    {
        WebElement twitter= Hooks.driver.findElement(By.cssSelector("li[class=\"twitter\"]"));
        return twitter;
    }
    public WebElement facebookTap()
    {
        WebElement facebook=Hooks.driver.findElement(By.cssSelector("li[class=\"facebook\"]"));
        return facebook;
    }
    public WebElement rssTap()
    {
        WebElement rss= Hooks.driver.findElement(By.cssSelector("li[class=\"rss\"]"));
        return rss;
    }
    public WebElement youtubeTap()
    {
        WebElement youtube= Hooks.driver.findElement(By.cssSelector("li[class=\"youtube\"]"));
        return youtube;
    }
    }
