package org.sample;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import helper.BaseClass;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{
@Before
public void bef() {
	launchBrowser();
	   launchUrl("https://www.facebook.com/");
	   maxWindow();

}
@After
public void aft(Scenario s) {
	if(s.isFailed()) {
		TakesScreenshot t=(TakesScreenshot)driver;
		byte[] screen = t.getScreenshotAs(OutputType.BYTES);
		s.embed(screen, "image/png");
		}
	toClose();

}
}
