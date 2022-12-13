package org.example.pages;

import org.example.dfs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorCompare {
public WebElement compare1() {
    WebElement compareBtn1 = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/div[3]/div[2]/button[2]"));
    return compareBtn1;
}
public WebElement compare2(){
    WebElement compareBtn2 = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[3]"));
    return compareBtn2;
}
public String message(){
    String msg = Hooks.driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div")).getText();
    return msg;
}
}
