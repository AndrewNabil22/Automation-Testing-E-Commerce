package org.example.pages;

import com.google.j2objc.annotations.Weak;
import org.example.dfs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorWishlist {
    public WebElement wishList2(){
        WebElement wish2 = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[3]"));
        return wish2;
    }
    public WebElement wishList1() {
        WebElement wish1 = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/div[3]/div[2]/button[3]"));
        return wish1;
    }
    public WebElement assertion(){
        WebElement addMessage = Hooks.driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div"));
        return addMessage;
    }
}
