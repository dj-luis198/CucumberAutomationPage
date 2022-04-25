package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="./src/test/java/Features",
		glue = "TestGlue",
		monochrome = true,
		plugin = {"json:target/cucumber.json"},
		//tags = "  @registro",
		snippets = SnippetType.CAMELCASE)

public class TestRunner {

}
