package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\resources\\features",
		glue="stepDefinations",
	    dryRun = false,
		monochrome = true,
		tags= "",
		plugin = {"html:target/cucumber-reports/index.html"} 
		
		)


public class Runner {

}
