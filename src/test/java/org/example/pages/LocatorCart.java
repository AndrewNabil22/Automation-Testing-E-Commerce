package org.example.pages;

import org.example.dfs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorCart {
    public WebElement addCartButton2(){
        WebElement cartButton2 = Hooks.driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div.center-2 > div > div.page-body > div.products-container > div.products-wrapper > div > div > div:nth-child(2) > div > div.details > div.add-info > div.buttons > button.button-2.product-box-add-to-cart-button"));
        return cartButton2;
    }
    public WebElement addCartButton1(){
        WebElement cartButton1 = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]"));
        return cartButton1;
    }
    public WebElement assertion(){
        WebElement addMessage = Hooks.driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div"));
        return addMessage;
    }
}
