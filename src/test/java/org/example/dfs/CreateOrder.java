package org.example.dfs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.LocatorCreateOrder;
import org.example.pages.LocatorRegister;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CreateOrder {
    LocatorCreateOrder crtOrder = new LocatorCreateOrder();
    LocatorRegister register = new LocatorRegister();
    @Given("user hover \"Shopping cart\"")
    public void hover() throws InterruptedException {
        Thread.sleep(6000);
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(crtOrder.hover()).perform();
    }

    @When("user clicks on \"Go To Cart\" button")
    public void goToCartButton() {
        crtOrder.goToCart().click();
    }

    @And("user check to agree the terms of service")
    public void checkAgree() {
        crtOrder.agree().click();
    }

    @And("user clicks on \"Checkout\" button")
    public void checkButton() {
        crtOrder.checkout().click();
    }

    @And("user select the country")
    public void slctCountry() throws InterruptedException {
        Thread.sleep(1000);
        Select countries = new Select(crtOrder.country());
        countries.selectByValue("123");
    }
    @And("user enter the city")
    public void ntrCity(){crtOrder.city().sendKeys("Cairo");}
    @And("user enter the address1")
    public void nrtAddress1(){crtOrder.address1().sendKeys("7 El-Tahawy St.");}
    @And("user enter zip")
    public void ntrZip(){crtOrder.zip().sendKeys("12345");}
    @And("user enter phone number")
    public void ntrPhoneNumber(){crtOrder.phoneNumber().sendKeys("01200724546");}
    @And("user clicks on \"Continue\" to shipping method")
    public void conButton1() throws InterruptedException {Thread.sleep(1000);crtOrder.continueButton1().click();}
    @And("user clicks on \"Next Day Air\"")
    public void shippingMethod(){crtOrder.shippingMethodCheck().click();}
    @And("user clicks on \"Continue\" to payment method")
    public void conButton2() throws InterruptedException {Thread.sleep(1000);crtOrder.continueButton2().click();}
    @And("user clicks on \"Credit Card\" option")
    public void paymentMethod(){crtOrder.paymentMethodCheck().click();}
    @And("user clicks on \"Continue\" to payment info")
    public void conButton3() throws InterruptedException {Thread.sleep(1000);crtOrder.continueButton3().click();}
    @And("user select credit card type")
    public void cardType() throws InterruptedException {
        Thread.sleep(1000);
        crtOrder.cardTypeCheck().click();
        Select selectType = new Select(crtOrder.cardTypeCheck());
        selectType.selectByVisibleText("Master card");
    }
    @And("user enter cardholder name")
    public void cardHolderName(){crtOrder.cardHolderNameField().sendKeys("Andrew Nabil");}
    @And("user enter card number")
    public void cardNumber(){crtOrder.cardNumberField().sendKeys("5335180653469010");}
    @And("user enter expiration month")
    public void expirationMonth(){
        Select selectMonth = new Select(crtOrder.expirationMonthField());
        selectMonth.selectByValue("12");
    }
    @And("user enter expiration year")
    public void expirationYear(){
        Select selectYear = new Select(crtOrder.expirationYearField());
        selectYear.selectByVisibleText("2025");
    }
    @And("user enter card code")
    public void cardCode(){crtOrder.cardCodeField().sendKeys("086");}
    @And("user clicks on \"Continue\" to confirm order")
    public void conButton4() throws InterruptedException {Thread.sleep(1000);crtOrder.continueButton4().click();}
    @And("user clicks on \"confirm\" to final confirm order")
    public void conButton5() throws InterruptedException {Thread.sleep(1000);crtOrder.continueButton5().click();}
    @Then("Your order has been successfully processed!")
    public void processedMessage(){
        String message = crtOrder.processedMessageMsg().getText();
        String expectedResult = "Your order has been successfully processed!";
        Assert.assertTrue(message.contains(expectedResult));
    }
}
