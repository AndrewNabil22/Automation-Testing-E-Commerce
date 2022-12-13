package org.example.pages;

import org.example.dfs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorSearch {

    public WebElement srchBar(){
        WebElement searchBar = Hooks.driver.findElement(By.id("small-searchterms"));
        return searchBar;
    }
    public WebElement srchButn(){
        WebElement searchButn = Hooks.driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button"));
        return searchButn;
    }
    public String srchRes() {
        String searchResult = Hooks.driver.getCurrentUrl();
        return searchResult;
    }
}
