package org.example.testRun;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
                features = "src/main/resources/Features",
                glue = "org.example.dfs",
                tags = "@smoke",
                plugin = {"pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.text"}
        )

public class Run extends AbstractTestNGCucumberTests {

}
