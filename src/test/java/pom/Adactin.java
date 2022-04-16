package pom;

import helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin extends BaseClass {
	public Adactin() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//input[@id='username']"),
		@FindBy(xpath="//input[@name='username']")
		
	})
	private WebElement txtUserName;
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//input[@id='password']"),
		@FindBy(xpath="//input[@name='password']")
		
	})
	private WebElement txtPassword;
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//input[@id='login']"),
		@FindBy(xpath="//input[@name='login']")
		
	})
	private WebElement btnLogin;
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//select[@id='location']"),
		@FindBy(xpath="//select[@name='location']")
		
	})
	private WebElement selLocation;
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//input[@id='Submit']"),
		@FindBy(xpath="//input[@name='Submit']")
		
	})
	private WebElement btnSearch;
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//input[@id='radiobutton_2']"),
		@FindBy(xpath="//input[@name='radiobutton_2']")
		
	})
	private WebElement btnSelect;
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//input[@id='continue']"),
		@FindBy(xpath="//input[@name='continue']")
		
	})
	private WebElement btnContinue;
	public WebElement getBtnContinue() {
		return btnContinue;
	}
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//input[@id='first_name']"),
		@FindBy(xpath="//input[@name='first_name']")
		
	})
	
	private WebElement txtFirstName;
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//input[@id='last_name']"),
		@FindBy(xpath="//input[@name='last_name']")
		
	})
	private WebElement txtLastName;
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//textarea[@id='address']"),
		@FindBy(xpath="//texarea[@name='address']")
		
	})
	private WebElement txtAddress;
	

	@CacheLookup
	@FindAll({
		@FindBy(xpath="//input[@id='cc_num']"),
		@FindBy(xpath="//input[@name='cc_num']")
		
	})
	private WebElement txtCreNo;
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//select[@id='cc_type']"),
		@FindBy(xpath="//select[@name='cc_type']")
		
	})
	private WebElement selCreType;
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//select[@id='cc_exp_month']"),
		@FindBy(xpath="//select[@name='cc_exp_month']")
		
	})
	private WebElement selExpMonth;
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//select[@id='cc_exp_year']"),
		@FindBy(xpath="//select[@name='cc_exp_year']")
		
	})
	private WebElement selExpYear;
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//input[@id='cc_cvv']"),
		@FindBy(xpath="//input[@name='cc_cvv']")
		
	})
	private WebElement txtCvvNo;
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//input[@id='book_now']"),
		@FindBy(xpath="//input[@name='book_now']")
		
	})
	private WebElement btnBook;
	
	@CacheLookup
	@FindBy(name="order_no")
	private WebElement orderNo;
	public WebElement getBtnSelect() {
		return btnSelect;
	}
	public WebElement getOrderNo() {
		return orderNo;
	}
	public WebElement getTxtUserName() {
		return txtUserName;
	}
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	public WebElement getSelLocation() {
		return selLocation;
	}
	public WebElement getBtnSearch() {
		return btnSearch;
	}
	public WebElement getTxtFirstName() {
		return txtFirstName;
	}
	public WebElement getTxtLastName() {
		return txtLastName;
	}
	public WebElement getTxtAddress() {
		return txtAddress;
	}
	public WebElement getTxtCreNo() {
		return txtCreNo;
	}
	public WebElement getSelCreType() {
		return selCreType;
	}
	public WebElement getSelExpMonth() {
		return selExpMonth;
	}
	public WebElement getSelExpYear() {
		return selExpYear;
	}
	public WebElement getTxtCvvNo() {
		return txtCvvNo;
	}
	public WebElement getBtnBook() {
		return btnBook;
	}
	
	
	
}
