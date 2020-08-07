package runnerPack6;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "src/main/java/featureFile6/File6.feature",

			
	glue = {"stepDefPack6"},
    plugin= {"pretty","html:html-output","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
	dryRun = false
	
	)
	
	public class RunnerClass6 {
	@AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File("config/report.xml"));
    
	}
}
