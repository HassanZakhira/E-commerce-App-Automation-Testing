package org.example.Pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginPage {
    public WebElement email ()
    {
        WebElement email= Hooks.driver.findElement(By.cssSelector("input[class=\"email\"]"));
        return email;
    }
    public WebElement password ()
    {
        WebElement password= Hooks.driver.findElement(By.cssSelector("input[class=\"password\"]"));
        return password;
    }
    public WebElement loginButton ()
    {
        WebElement loginButton= Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
        return loginButton;
    }
    public WebElement forgotPassword ()
    {
        WebElement forgotPassword= Hooks.driver.findElement(By.cssSelector("a[href=\"/passwordrecovery\"]"));
        return forgotPassword;
    }
    public WebElement changePassword ()
    {
        WebElement changePassword = Hooks.driver.findElement(By.cssSelector("a[href=\"/customer/changepassword\"]"));
        return changePassword ;
    }
}
