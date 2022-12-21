package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "src/test/resources/features/website.feature",
	 glue = {"stepDefinetion","base"},
	 
	 plugin = {"pretty","html:target/Report.html", "json:target/Report.json"},
	 monochrome = true,
	 dryRun = false)

public class NavigateToWebJunit {

}
