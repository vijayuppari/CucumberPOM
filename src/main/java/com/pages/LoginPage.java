package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    // By Locators
    private By username =By.id("username");
    private By password =By.id("password");
    private By terms =By.id("terms");
    private By signInBtn =By.id("signInBtn");
    private  By termsandconditions = By.xpath("//*[contains(text(),'terms and conditions')]");

    // Create Constructor
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    // Page Actions
    public String getPageTitile(){
        return driver.getTitle();
    }

    public boolean termsconditionslink(){
       return  driver.findElement(termsandconditions).isDisplayed();
    }

    public void enteruserName(String uname){

        driver.findElement(username).sendKeys(uname);
    }
    public void enterPassword(String pword){
        driver.findElement(password).sendKeys(pword);
    }
    public void clickterms(){
        driver.findElement(terms).click();
    }
    public void signIn(){
        driver.findElement(signInBtn).click();
    }

    public ShoppingPage doLogin(String uname, String pass){
        driver.findElement(username).sendKeys(uname);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(terms).click();
        return new ShoppingPage(driver);

    }

}
