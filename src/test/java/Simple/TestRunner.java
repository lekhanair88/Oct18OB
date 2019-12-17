package Simple;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\lekha.k.nair\\Desktop\\Workspace-BackUp\\eclipse-Cucumber\\CucumberDemo\\src\\resources\\java\\Testfile.feature",
tags="@Functional",
plugin ="html:target/reports")
public class TestRunner {
}
