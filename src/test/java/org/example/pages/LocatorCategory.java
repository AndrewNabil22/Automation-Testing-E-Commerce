package org.example.pages;

import org.example.dfs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorCategory {
    public WebElement hover(){
        WebElement hvr = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));
        return hvr;
    }
   public WebElement subCats(){
        WebElement sub = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[1]/a"));
        return sub;
   }
   public WebElement subName(){
        WebElement label = Hooks.driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div.center-2 > div > div.page-title > h1"));
        return label;
   }

}
