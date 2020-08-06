package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//this annotation sets the feature and steps loaction, and the output format of the report in console
//tags definty the features the runner will run
//plugin is used to generate a html report insird target/cucumber folder
@CucumberOptions(
		features= {"src/test/resources/features"},
		glue= {"steps"},
		monochrome=true,
		//tags= {"@sanity, @bvt"},
		plugin = {"pretty", "html:target/cucumber"}
		)
public class RunCuke {
	
}
