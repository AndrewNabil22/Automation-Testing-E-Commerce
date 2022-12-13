package org.example.dfs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.LocatorWishlist;

public class Wishlist {
    LocatorWishlist wish = new LocatorWishlist();

    @Given("user clicks on \"Add To Wishlist\" button2")
    public void addWishButn2(){wish.wishList2().click();}
    @When("user clicks on \"Add To Wishlist\" button1")
    public void addWishButn1(){wish.wishList1().click();}
    @Then("add wishlist message is displayed")
    public void assertions(){wish.assertion().isDisplayed();}
}
