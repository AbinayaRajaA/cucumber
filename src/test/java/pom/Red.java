package pom;

import helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Red extends BaseClass{
public Red() {
	PageFactory.initElements(driver, this);
}
@CacheLookup
@FindBy(id="signin-block")
private WebElement Signin;
@CacheLookup
@FindBy(id="signInLink")
private WebElement SigninLink;
@CacheLookup
@FindBy(id="recaptcha-anchor-label")
private WebElement checkBox;
@CacheLookup

@FindBy(id="mobileNoInp")

private WebElement mobileNoInp;
@CacheLookup
@FindBy(xpath="//span[text()='GENERATE OTP ']")
private WebElement Otp;
public WebElement getSignin() {
	return Signin;
}
public WebElement getSigninLink() {
	return SigninLink;
}
public WebElement getCheckBox() {
	return checkBox;
}
public WebElement getMobileNoInp() {
	return mobileNoInp;
}
public WebElement getOtp() {
	return Otp;
}

}
