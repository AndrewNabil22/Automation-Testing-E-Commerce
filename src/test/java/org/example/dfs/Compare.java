package org.example.dfs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.LocatorCompare;
import org.testng.Assert;

public class Compare {
    LocatorCompare comp = new LocatorCompare();
    @Given("user clicks on compare list 1")
    public void compareList1(){comp.compare1().click();}
    @When("user clicks on compare list 2")
    public void compareList2(){comp.compare2().click();}
    @Then("compare message is displayed")
            public void copmareMsg(){
        String expectedResult = "The product has been added to your";
        Assert.assertTrue(comp.message().contains(expectedResult));
    }
}
