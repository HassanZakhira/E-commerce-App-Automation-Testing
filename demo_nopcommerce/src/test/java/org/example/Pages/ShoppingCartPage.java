package org.example.Pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ShoppingCartPage {

    public WebElement Total ()
    {
        List<WebElement> Price = Hooks.driver.findElements(By.cssSelector("span[class=\"value-summary\"]"));
        return Price.get(3);
    }
    public List<WebElement>  ShoppingItems()
    {
        List <WebElement>  ShoppingItems = Hooks.driver.findElements(By.cssSelector("td[class=\"sku\"]"));
        return  ShoppingItems;
    }
    public WebElement Agree()
    {
        WebElement agree=Hooks.driver.findElement(By.cssSelector("input[name=\"termsofservice\"]"));
        return agree;
    }


    public WebElement checkout()
    {
        WebElement checkout=Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 checkout-button\"]"));
        return checkout;
    }
    //Address

    public WebElement Address_FirstName()
    {
        WebElement Address_FirstName=Hooks.driver.findElement(By.id("Address_FirstName"));
        return Address_FirstName;
    }
    public WebElement Address_LastName()
    {
        WebElement Address_LastName=Hooks.driver.findElement(By.id("Address_LastName"));
        return Address_LastName;
    }
    public WebElement Address_Email()
    {
        WebElement Address_Email=Hooks.driver.findElement(By.id("Address_Email"));
        return Address_Email;
    }
    public WebElement Address_Company()
    {
        WebElement Address_Company=Hooks.driver.findElement(By.id("Address_Company"));
        return Address_Company;
    }
    public Select Country()
    {
        WebElement Country=Hooks.driver.findElement(By.cssSelector("select[name=\"Address.CountryId\"]"));
        //select[name="BillingNewAddress.CountryId"]  old Path
        Select selectObject = new Select(Country);
        return selectObject;
    }
    public Select State()
    {
        WebElement State=Hooks.driver.findElement(By.id("Address_StateProvinceId"));
        //select[name="BillingNewAddress.StateProvinceId"]
        Select selectObject = new Select(State);
        return selectObject;
    }
    public WebElement City()
    {
        WebElement City=Hooks.driver.findElement(By.id("Address_City"));
        //BillingNewAddress_City
        return City;
    }
    public WebElement Address1()
    {
        WebElement Address1=Hooks.driver.findElement(By.id("Address_Address1"));
        //BillingNewAddress_Address1
        return Address1;
    }
    public WebElement Address2()
    {
        WebElement Address2=Hooks.driver.findElement(By.id("Address_Address2"));
        //BillingNewAddress_Address2
        return Address2;
    }
    public WebElement Zip()
    {
        WebElement Zip=Hooks.driver.findElement(By.id("Address_ZipPostalCode"));
        //BillingNewAddress_ZipPostalCode
        return Zip;
    }
    public WebElement Phone()
    {
        WebElement Phone=Hooks.driver.findElement(By.id("Address_PhoneNumber"));
        //BillingNewAddress_PhoneNumber
        return Phone;
    }
    public WebElement Fax()
    {
        WebElement Fax=Hooks.driver.findElement(By.id("Address_FaxNumber"));
        //BillingNewAddress_FaxNumber
        return Fax;
    }
    public WebElement Continue()
    {
        WebElement Continue=Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 new-address-next-step-button\"]"));
        return Continue;
    }
    public WebElement AddressSave()
    {
        WebElement AddressSave=Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 save-address-button\"]"));
        return AddressSave;
    }
    public WebElement Continue_Shipping()
    {
        WebElement Continue2=Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 shipping-method-next-step-button\"]"));
        return Continue2;
    }
    public WebElement Continue_Payment ()
    {
        WebElement ContinuePayment =Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 payment-method-next-step-button\"]"));
        return ContinuePayment ;
    }
    public WebElement Continue_information ()
    {
        WebElement information =Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 payment-info-next-step-button\"]"));
        return information ;
    }
    public WebElement ConfirmOrder()
    {
        WebElement ConfirmOrder =Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 confirm-order-next-step-button\"]"));
        return ConfirmOrder ;
    }

    public WebElement successfullyOrder()
    {
        WebElement successfullyOrder =Hooks.driver.findElement(By.cssSelector("div[class=\"title\"]"));
        return successfullyOrder ;
    }
    public WebElement Continue_Complete ()
    {
        WebElement Complete =Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 order-completed-continue-button\"]"));
        return Complete ;
    }


}
