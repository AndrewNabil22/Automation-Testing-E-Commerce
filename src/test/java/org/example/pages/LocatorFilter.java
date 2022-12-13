package org.example.pages;

import org.example.dfs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorFilter {
    public WebElement hoverApparel(){
        WebElement hvrAprl = Hooks.driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.header-menu > ul.top-menu.notmobile > li:nth-child(3) > a"));
        return hvrAprl;
    }
    public WebElement subCat() {
        WebElement subShoes = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/ul/li[1]/a"));
        return subShoes;
    }
    public WebElement colorFilter(){
        WebElement clrFil = Hooks.driver.findElement(By.id("attribute-option-15"));
        return clrFil;
    }
    public String sucRedFilter(){
        String filter = Hooks.driver.getCurrentUrl();
        return filter;
    }
}
