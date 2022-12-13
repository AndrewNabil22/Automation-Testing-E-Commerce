package org.example.dfs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.LocatorCart;

public class Cart {
    LocatorCart cart = new LocatorCart();
    @Given("user clicks on \"Add To Cart\" button2")
    public void addCartButn2(){cart.addCartButton2().click();
    }
    @Given("user clicks on \"Add To Cart\" button1")
    public void addCartButn1(){cart.addCartButton1().click();
    }
    @Then("add to cart message is displayed")
    public void assertions(){cart.assertion().isDisplayed();}
}
