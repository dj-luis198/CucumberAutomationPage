package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:\\Users\\Daniel\\eclipse-workspace\\CucumberAutomationPage\\src\\test\\java\\Features",
		glue = "TestGlue",
		monochrome = true,
		plugin = {"json:target/cucumber.json"},
		tags = "  @pay",
		snippets = SnippetType.CAMELCASE)

public class TestRunner {

}