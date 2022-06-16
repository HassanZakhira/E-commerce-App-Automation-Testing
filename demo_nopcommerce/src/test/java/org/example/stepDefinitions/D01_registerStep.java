package org.example.stepDefinitions;

import org.example.Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class D01_registerStep {
    HomePage homePage=new HomePage();

    @Given("Click on Register Tab")
    public void Click_on_Register_Tab() throws InterruptedException {
        homePage.registerTap().click();
        Thread.sleep(1000);
    }
    @And("^Click on any Gender \"(.*?)\"")
    public void Click_on_any_Gender_Option(String Gender){
        if (Gender.equalsIgnoreCase("male"))
        {
            WebElement maleOption =Hooks.driver.findElement(By.id("gender-male"));
            maleOption.click();
        }
    }
    @And("^Fill First Name \"(.*?)\"")
    public void Fill_First_Name(String FirstName) throws InterruptedException {
        WebElement firstName =Hooks.driver.findElement(By.id("FirstName"));

       firstName.sendKeys(FirstName);
        Thread.sleep(1000);
    }
    @And("^Fill Second Name \"(.*?)\"")
    public void Fill_Second_Name(String LastName) throws InterruptedException {
        WebElement secondName =Hooks.driver.findElement(By.id("LastName"));
        secondName.sendKeys(LastName);
        Thread.sleep(1000);
    }
    @And("^Select Day \"(.*?)\"")
    public void Select_Day(String day) throws InterruptedException {
        WebElement selectDay = Hooks.driver.findElement(By.name("DateOfBirthDay"));
        Select selectObject = new Select(selectDay);
        selectObject.selectByValue(day);
        Thread.sleep(1000);
    }
    @And("^Select Month \"(.*?)\"")
    public void Select_Month(String month) throws InterruptedException {
        WebElement selectMonth = Hooks.driver.findElement(By.name("DateOfBirthMonth"));
        Select selectObject = new Select(selectMonth);
        selectObject.selectByValue(month);
        Thread.sleep(1000);
    }
    @And("^Select Year \"(.*?)\"")
    public void Select_Year(String year) throws InterruptedException {
        WebElement selectYear = Hooks.driver.findElement(By.name("DateOfBirthYear"));
        Select selectObject = new Select(selectYear);
        selectObject.selectByValue(year);
        Thread.sleep(1000);
    }
    @And("^Enter any email \"(.*?)\"")
    public void Enter_any_email(String mail) throws InterruptedException {
        WebElement email =Hooks.driver.findElement(By.id("Email"));
        email.sendKeys(mail);
        Thread.sleep(1000);
    }
    @And("^Enter any company name \"(.*?)\"")
    public void Enter_any_company_name(String company) throws InterruptedException {
        WebElement companyName =Hooks.driver.findElement(By.id("Company"));
        companyName.sendKeys(company);
        Thread.sleep(1000);
    }

    @And("^Enter password \"(.*?)\"")
    public void Enter_password(String password) throws InterruptedException {
        WebElement pass =Hooks.driver.findElement(By.id("Password"));
        pass.sendKeys(password);
        Thread.sleep(1000);
    }
    @And("^Enter Confirm password \"(.*?)\"")
    public void Enter_Confirm_password(String ConfirmPassword) throws InterruptedException {
        WebElement password =Hooks.driver.findElement(By.id("ConfirmPassword"));
        password.sendKeys(ConfirmPassword);
        Thread.sleep(1000);
    }
    @And("Click on REGISTER button")
    public void Click_on_REGISTER_button() throws InterruptedException {
        WebElement RegisterButton= Hooks.driver.findElement(By.id("register-button"));
        RegisterButton.click();

        Thread.sleep(5000);
    }
    @Then("userShouldSeeMessage")
    public void user_Should_See_Message(){
        String ER="Your registration completed";
        String AR=Hooks.driver.findElement(By.className("result")).getText();
        System.out.println(AR);
        //Assert.assertEquals(AR,ER);
        Assert.assertTrue(AR.contains(ER),"Error Message : Wrong");
        //String  =Hooks.driver.findElement(By.className("result").);
        String color = Hooks.driver.findElement(By.className("result")).getCssValue("color");
        System.out.println(color);
        Assert.assertTrue(color.contains("rgba(76, 177, 124, 1)"),"color is correct");
    }

}
