package org.example.dfs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.LocatorSearch;
import org.testng.Assert;

public class Search {
    LocatorSearch search = new LocatorSearch();

    @Given("user enter a product name in the search bar")
    public void searchBar(){ search.srchBar().sendKeys("Book");}
    @When("user clicks on search button")
    public void searchButn(){ search.srchButn().click();}
    @Then("the product shows up")
    public void searchResult(){
        System.out.println(Hooks.driver.getCurrentUrl());
        Assert.assertEquals(search.srchRes(),"https://demo.nopcommerce.com/search?q=Book");
    }

}
