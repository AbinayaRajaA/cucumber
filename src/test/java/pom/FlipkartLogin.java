package pom;

import helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLogin extends BaseClass {
	public FlipkartLogin() {
		PageFactory.initElements(driver, this);
		
	}
	@CacheLookup
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement txtEmail;
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//input[@type='password']"),
		@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']"),
		
	})
	private WebElement txtPass;
	@CacheLookup
	@FindBys({
		@FindBy(xpath="//button[@type='submit']"),
		@FindBy(xpath="//span[text()='Login']")
		
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
