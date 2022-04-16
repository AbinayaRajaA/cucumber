package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.BaseClass;

public class ForPass extends BaseClass {
public ForPass() {
	PageFactory.initElements(driver, this);
}
@CacheLookup
@FindBy(xpath="//a[text()='Forgotten password']")
private WebElement forPass;
@CacheLookup
@FindBy(xpath="//input[@placeholder='Email address or mobile number']")
private WebElement txtMail;
@CacheLookup
@FindBy(xpath="//button[text()='Search']")
private WebElement btnSearch;
public WebElement getForPass() {
	return forPass;
}
public WebElement getTxtMail() {
	return txtMail;
}
public WebElement getBtnSearch() {
	return btnSearch;
}

}
