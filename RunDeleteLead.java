package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
				dryRun = false,
				features = {"src/test/java/features/DeleteLead.feature"},
				glue = {"stepDefine"},
				monochrome = true
				)


public class RunDeleteLead extends AbstractTestNGCucumberTests{

}
