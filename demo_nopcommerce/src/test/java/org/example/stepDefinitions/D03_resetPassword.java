package org.example.stepDefinitions;

import org.example.Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class D03_resetPassword {
    LoginPage loginPage=new LoginPage();

    @And("Click on forgot Password")
    public void Click_on_forgot_Password() throws InterruptedException {
        loginPage.forgotPassword().click();
        Thread.sleep(1500);
    }
    @And("Enter Your email address")
    public void Enter_Your_email_address() throws InterruptedException {
        WebElement emailaddress=Hooks.driver.findElement(By.cssSelector("input[class=\"email\"]"));
        emailaddress.sendKeys("HassanAutomation77@gmail.com");
        Thread.sleep(1000);
    }
    @And("Click on Recover Button")
    public void Click_on_Recover_Button() throws InterruptedException {
        WebElement RecoverButton=Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 password-recovery-button\"]"));
        RecoverButton.click();
        Thread.sleep(1000);
    }
    @Then("Email with instructions has been sent to you")
    public void Email_sent_to_you() throws InterruptedException {
       WebElement Notification= Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));
        Assert.assertTrue(Notification.isDisplayed(),"Message displayed");
        Assert.assertEquals("Email with instructions has been sent to you.",Notification.getText());
        System.out.println(Notification.getText());
        Thread.sleep(3000);
    }
}
