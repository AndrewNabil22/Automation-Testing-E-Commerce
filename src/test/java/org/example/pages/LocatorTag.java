package org.example.pages;

import org.example.dfs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorTag {
    public WebElement elecCat(){
        WebElement elec = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a"));
        return elec;
    }
    public WebElement awesomeTag(){
        WebElement aweTag = Hooks.driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div.side-2 > div.block.block-popular-tags > div.listbox > div.tags > ul > li:nth-child(2) > a"));
        return aweTag;
    }
    public WebElement gameTag(){
        WebElement gaTag = Hooks.driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div.side-2 > div.block.block-popular-tags > div.listbox > div.tags > ul > li:nth-child(10) > a"));
        return gaTag;
    }
    public WebElement assertion(){
        WebElement sucAssert = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[1]/h1"));
        return sucAssert;
    }
}
