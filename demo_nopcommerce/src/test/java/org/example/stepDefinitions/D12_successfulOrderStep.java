package org.example.stepDefinitions;

import org.example.Pages.HomePage;
import org.example.Pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D12_successfulOrderStep {
    ShoppingCartPage shoppingCartPage=new ShoppingCartPage();
    HomePage homePage=new HomePage();

    @And("click on agree")
    public void click_on_agree() throws InterruptedException {
        homePage.CartTap().click();
        Thread.sleep(1000);
        shoppingCartPage.Agree().click();
        Thread.sleep(1000);
    }
    @And("click on checkout")
    public void click_on_checkout() throws InterruptedException {
        shoppingCartPage.checkout().click();
        Thread.sleep(3000);
    }
    @And("Add address")
    public void Add_address() throws InterruptedException {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
        Thread.sleep(1000);
        homePage.AddressesTap().click();
        Thread.sleep(1000);
        Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 add-address-button\"]")).click();
        Thread.sleep(1000);
        shoppingCartPage.Address_FirstName().sendKeys("Hassan");
        Thread.sleep(1000);
        shoppingCartPage.Address_Email().sendKeys("HassanAutomation10@gmail.com");
        Thread.sleep(1000);
        shoppingCartPage.Address_LastName().sendKeys("Zakhira");
        Thread.sleep(1000);
        shoppingCartPage.Country().selectByIndex(1);
        Thread.sleep(1000);
        shoppingCartPage.State().selectByIndex(1);
        shoppingCartPage.City().sendKeys("Zakhira City ");
        shoppingCartPage.Address1().sendKeys("Zakhira");
        shoppingCartPage.Address2().sendKeys("NewVally");
        shoppingCartPage.Zip().sendKeys("123456");
        shoppingCartPage.Phone().sendKeys("0123456789");
        shoppingCartPage.Fax().sendKeys("134679");
        Thread.sleep(1000);
        shoppingCartPage.AddressSave().click();
    }
    @And("Billing address")
    public void Billing_address() throws InterruptedException
    {
        Thread.sleep(2000);
        shoppingCartPage.Continue().click();
    }
    @And("Shipping method")
    public void Shipping_method() throws InterruptedException
    {
        Thread.sleep(2000);
        shoppingCartPage.Continue_Shipping().click();
    }
    @And("Payment method")
    public void Payment_method() throws InterruptedException
    {
        Thread.sleep(2000);
        shoppingCartPage.Continue_Payment().click();
    }
    @And("Payment Information")
    public void PaymentInformation() throws InterruptedException
    {
        Thread.sleep(2000);
        shoppingCartPage.Continue_information().click();
    }
    @And("Confirm Order")
    public void Confirm_Order() throws InterruptedException
    {
        Thread.sleep(2000);
        shoppingCartPage.ConfirmOrder().click();
    }
    @Then("Check successfully Order")
    public void Check_successfully_Order() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(shoppingCartPage.successfullyOrder().getText().contains("Your order has been successfully processed!"));
        System.out.println(shoppingCartPage.successfullyOrder().getText());
        shoppingCartPage.Continue_Complete().click();
    }
    @And("Check All Orders")
    public void Check_All_Orders() throws InterruptedException {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
        Thread.sleep(1000);
        homePage.OrderTap().click();
        Thread.sleep(1000);
        int OrdersNumber=Hooks.driver.findElements(By.cssSelector("div[class=\"section order-item\"]")).size();
        System.out.println("OrdersNumber=" + OrdersNumber);
    }
}
