package pom;

import helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo extends BaseClass{
public Demo() {
	PageFactory.initElements(driver, this);
}
@CacheLookup
@FindAll({
	@FindBy(xpath="//input[@id='first-name']"),
	@FindBy(xpath="//input[@name='firstName']")
	
})
private WebElement txtFirstName;
@CacheLookup
@FindAll({
	@FindBy(xpath="//input[@id='last-name']"),
	@FindBy(xpath="//input[@name='lastName']")
	
})
private WebElement txtLastName;
@CacheLookup
@FindAll({
	@FindBy(xpath="//input[@id='email']"),
	@FindBy(xpath="//input[@name='email']")
	
})
private WebElement txtEmail;
@CacheLookup
@FindAll({
	@FindBy(xpath="//input[@id='mobile']"),
	@FindBy(xpath="//input[@name='mobile']")
	
})
private WebElement txtMobile;
@CacheLookup
@FindBy(name="country")
private WebElement selCountry;	

@CacheLookup
@FindAll({
	@FindBy(xpath="//input[@id='city']"),
	@FindBy(xpath="//label[text()='City (required)']")
	
})
private WebElement txtCity;
@CacheLookup
@FindBy(name="message")
private WebElement txtMsg;

@CacheLookup
@FindBy(xpath="//button[text()='Send']")
	
private WebElement btnSend;

public WebElement getTxtFirstName() {
	return txtFirstName;
}

public WebElement getTxtLastName() {
	return txtLastName;
}

public WebElement getTxtEmail() {
	return txtEmail;
}

public WebElement getTxtMobile() {
	return txtMobile;
}

public WebElement getSelCountry() {
	return selCountry;
}

public WebElement getTxtCity() {
	return txtCity;
}

public WebElement getTxtMsg() {
	return txtMsg;
}

public WebElement getBtnSend() {
	return btnSend;
}


}
