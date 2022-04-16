package pom;

import helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook extends BaseClass{
public Facebook() {
	PageFactory.initElements(driver, this);
	
}
@CacheLookup
@FindAll({
	@FindBy(xpath="//input[@id='email']"),
	@FindBy(xpath="//input[@name='email']"),
	@FindBy(xpath="//input[@placeholder='Email address or phone number']")
})
private WebElement txtEmail;
@CacheLookup
@FindAll({
	@FindBy(xpath="//input[@id='pass']"),
	@FindBy(xpath="//input[@name='pass']"),
	@FindBy(xpath="//input[@placeholder='Password']")
})
private WebElement txtPass;
@CacheLookup
@FindAll({
	@FindBy(xpath="//button[text()='Log In']"),
	@FindBy(xpath="//button[@name='login']"),
	
})
private WebElement btnLogin;
public WebElement getTxtEmail() {
	return txtEmail;
}
public WebElement getTxtPass() {
	return txtPass;
}
public WebElement getBtnLogin() {
	return btnLogin;
}


}


