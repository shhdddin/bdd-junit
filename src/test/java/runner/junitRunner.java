package runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/search1.feature",
				 glue = {"stepDefinetion","base"},
				 tags = " @Regression",
				 plugin = {"pretty","html:target/Report.html", "json:target/Report.json"},
				 monochrome = true,
				 dryRun = false)
public class junitRunner  {

	
    

}
