package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.sample.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources",glue = "org.sample",
        dryRun=false,monochrome = true,strict = true,snippets = SnippetType.CAMELCASE,
        plugin = {"html:C:\\photon\\Cucumber\\Reports\\htmlReport",
		"junit:C:\\photon\\Cucumber\\Reports\\JunitReport\\Fb1.xml",
		"json:C:\\photon\\Cucumber\\Reports\\JsonReport\\Faceb.json",
		"rerun:C:\\photon\\Cucumber\\rerun\\failed.txt"})
public class TestRunner {

	@AfterClass
	public static void report() {
		JVMReport.generateReport(System.getProperty("user.dir")+"\\Reports\\JsonReport\\Faceb.json");	

	}
}
