package org.example.pages;

import io.cucumber.messages.types.Hook;
import org.example.dfs.CreateOrder;
import org.example.dfs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorCreateOrder {
    public WebElement hover(){
        WebElement hvrShoppingCart = Hooks.driver.findElement(By.cssSelector("#topcartlink > a"));
        return hvrShoppingCart;
    }
    public WebElement goToCart(){
        WebElement shoppingCartBtn = Hooks.driver.findElement(By.cssSelector("#flyout-cart > div > div.buttons > button"));
        return shoppingCartBtn;
    }
    public WebElement agree() {
        WebElement checkBtn = Hooks.driver.findElement(By.id("termsofservice"));
        return checkBtn;
    }
    public WebElement checkout(){
        WebElement checkoutBtn = Hooks.driver.findElement(By.id("checkout"));
        return checkoutBtn;
    }
    public WebElement country(){
        WebElement countryChoose = Hooks.driver.findElement(By.id("BillingNewAddress_CountryId"));
        return countryChoose;
    }
    public WebElement city(){
        WebElement cityEnter = Hooks.driver.findElement(By.name("BillingNewAddress.City"));
        return cityEnter;
    }
    public WebElement address1(){
        WebElement address1Enter = Hooks.driver.findElement(By.id("BillingNewAddress_Address1"));
        return address1Enter;
    }
    public WebElement zip(){
        WebElement zipEnter = Hooks.driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        return zipEnter;
    }
    public WebElement phoneNumber(){
        WebElement phoneNumberEnter = Hooks.driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
        return phoneNumberEnter;
    }
    public WebElement continueButton1(){
        WebElement conButn1 = Hooks.driver.findElement(By.cssSelector("#billing-buttons-container > button.button-1.new-address-next-step-button"));
        return conButn1;
    }
    public WebElement shippingMethodCheck() {
        WebElement shippingMC = Hooks.driver.findElement(By.id("shippingoption_1"));
        return shippingMC;
    }
    public WebElement continueButton2() {
        WebElement conButn2 = Hooks.driver.findElement(By.cssSelector("#shipping-method-buttons-container > button"));
        return conButn2;
    }
    public WebElement paymentMethodCheck(){
        WebElement paymetnMC = Hooks.driver.findElement(By.id("paymentmethod_1"));
        return paymetnMC;
    }
    public WebElement continueButton3() {
        WebElement conButn3 = Hooks.driver.findElement(By.cssSelector("#payment-method-buttons-container > button"));
        return conButn3;
    }
    public WebElement cardTypeCheck(){
        WebElement cardTC = Hooks.driver.findElement(By.name("CreditCardType"));
        return cardTC;
    }
    public WebElement cardHolderNameField(){
        WebElement cardHNF = Hooks.driver.findElement(By.id("CardholderName"));
        return cardHNF;
    }
    public WebElement cardNumberField(){
        WebElement cardN = Hooks.driver.findElement(By.id("CardNumber"));
        return cardN;
    }
    public WebElement expirationMonthField(){
        WebElement expirationMF = Hooks.driver.findElement(By.id("ExpireMonth"));
        return expirationMF;
    }
    public WebElement expirationYearField(){
        WebElement expirationYF = Hooks.driver.findElement(By.id("ExpireYear"));
        return expirationYF;
    }
    public WebElement cardCodeField(){
        WebElement cardCF = Hooks.driver.findElement(By.id("CardCode"));
        return cardCF;
    }
    public WebElement continueButton4() {
        WebElement conButn4 = Hooks.driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/button"));
        return conButn4;
    }
    public WebElement continueButton5() {
        WebElement conButn5 = Hooks.driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/button"));
        return conButn5;
    }
    public WebElement processedMessageMsg(){
        WebElement processedMM = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong"));
        return processedMM;
    }
}
