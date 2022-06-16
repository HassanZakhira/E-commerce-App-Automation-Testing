package org.example.stepDefinitions;

import org.example.Pages.HomePage;
import org.example.Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class D02_loginStep {
    LoginPage loginPage=new LoginPage();
    HomePage homePage=new HomePage();

    @Given("Click on Login Tab")
    public void Click_on_Login_Tab() throws InterruptedException {
        homePage.login().click();
        Thread.sleep(1000);
    }
    @And("Enter valid Email And Password")
    public void Enter_valid_Email_And_Password() throws InterruptedException {
        loginPage.email().sendKeys("HassanAutomation77@gmail.com");

       loginPage.password().sendKeys("P@ssw0rd");

        Thread.sleep(1000);
    }
    @Then("Click on Login Button")
    public void Click_on_Login_Button() throws InterruptedException {
        loginPage.loginButton().click();
        Thread.sleep(8000);
    }
    @Then("Go to correct URl")
    public void Go_to_correct_URl(){
        String URL=Hooks.driver.getCurrentUrl();
        System.out.println(URL);
        Assert.assertEquals(URL,"https://demo.nopcommerce.com/");

    }
    @Then("MYAccount Displayed")
    public void MYAccount_Displayed(){

        WebElement MYAccount=Hooks.driver.findElement(By.className("ico-account"));
        Assert.assertTrue(MYAccount.isDisplayed());
    }
}
