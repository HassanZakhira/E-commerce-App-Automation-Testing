package org.example.stepDefinitions;

import org.example.Pages.HomePage;
import org.example.Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class D03_ChangePassword {
    LoginPage loginPage=new LoginPage();
    HomePage homePage=new HomePage();
    @Given("Click on MyAccount")
    public void Click_on_MyAccount() throws InterruptedException {
        homePage.MyAccount().click();
        Thread.sleep(1000);
    }
    @And("Click on ChangePassword")
    public void Click_on_ChangePassword() throws InterruptedException {
        loginPage.changePassword().click();
        Thread.sleep(1000);
    }
    @And("Enter old Password")
    public void Enter_old_Password() throws InterruptedException {
        WebElement OldPassword=Hooks.driver.findElement(By.id("OldPassword"));
        OldPassword.sendKeys("P@ssw0rd");
        Thread.sleep(1000);
    }
    @And("Enter New Password")
    public void Enter_New_Password() throws InterruptedException {
        WebElement NewPassword=Hooks.driver.findElement(By.id("NewPassword"));
        NewPassword.click();
        NewPassword.sendKeys("P@ssw0rdP@ssw0rd1");
        Thread.sleep(1000);
    }
    @And("Enter Confirm New Password")
    public void Enter_Confirm_New_Password() throws InterruptedException {
        WebElement ConfirmNewPassword=Hooks.driver.findElement(By.id("ConfirmNewPassword"));
        ConfirmNewPassword.sendKeys("P@ssw0rdP@ssw0rd1");
        Thread.sleep(1000);
    }
    @Then("ClickChangePasswordButton")
    public void Click_Change_Password_Button() throws InterruptedException {
        WebElement changePasswordButton=Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 change-password-button\"]"));
        changePasswordButton.click();
        Thread.sleep(10000);
    }
    @Then("Password Was Changed")
    public void Password_Was_Changed()
    {
        WebElement MSG=Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));
        Assert.assertTrue(MSG.isDisplayed(),"Message displayed");
        String Message=MSG.getText();
        System.out.println(Message);
    }

}
