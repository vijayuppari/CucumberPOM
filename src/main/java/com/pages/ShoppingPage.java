package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class ShoppingPage {

    private WebDriver driver;

    private By checkout= By.xpath("//*[contains(text(),'Checkout')]");
    private By categories = By.xpath("//*[contains(text(),'Shop Name')]//following::div[1]//a");

    public ShoppingPage(WebDriver driver){
        this.driver =driver;
    }
    public String getShoppingtitle(){
      return   driver.getTitle();
    }
    public int getthecategorycount(){
        return driver.findElements(categories).size();
    }
    public void getcategorieslist(){
      List<WebElement> catlist= driver.findElements(categories);
      catlist.stream().map(ele->ele.getText()).collect(Collectors.toList());
    }


}
