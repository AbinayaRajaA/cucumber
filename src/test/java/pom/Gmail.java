package pom;

import helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Gmail extends BaseClass{
	public Gmail() {
		PageFactory.initElements(driver, this);
		
	}
	@CacheLookup
	@FindBy(xpath="//input[@type='email']")
	private WebElement txtEmail;
	@CacheLookup
	@FindBy(xpath="//span[text()='Next']")
	private WebElement btnNext;
	@CacheLookup
	@FindBys({
		@FindBy(name="password"),
		@FindBy(xpath="//input[@type='password']")
		
	})
	private WebElement txtPass;
	@CacheLookup
	@FindBys({
		@FindBy(xpath="//button[@type='button']"),
		@FindBy(xpath="//span[text()='Next']")
		
	})
	private WebElement btnNextP;
	
	@CacheLookup
	
		@FindBy(xpath="//span[text()='Try again']")
		
		
	
	private WebElement btnTryAgain;
	public WebElement getBtnTryAgain() {
		return btnTryAgain;
	}
	public WebElement getTxtEmail() {
		return txtEmail;
	}
	public WebElement getBtnNext() {
		return btnNext;
	}
	public WebElement getTxtPass() {
		return txtPass;
	}
	public WebElement getBtnNextP() {
		return btnNextP;
	}
	
}
