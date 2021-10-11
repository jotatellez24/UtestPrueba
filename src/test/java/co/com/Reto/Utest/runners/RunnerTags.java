package co.com.Reto.Utest.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/uTesting.feature",
        tags = " @stories",
        glue = "co.com.Reto.Utest.stepdefinitions" ,
        snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}
