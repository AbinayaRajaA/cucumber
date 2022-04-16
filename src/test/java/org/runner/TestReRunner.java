package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.sample.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@rerun\\failed.txt",glue = "org.sample",
        dryRun=false,monochrome = true,strict = true,snippets = SnippetType.CAMELCASE,
        plugin = {
		"rerun:C:\\photon\\Cucumber\\rerun\\failed.txt"})
public class TestReRunner {

	@AfterClass
	public static void report() {
		JVMReport.generateReport(System.getProperty("user.dir")+"\\Reports\\JsonReport\\Faceb.json");

	}
}
