package pom;

import helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreensTech extends BaseClass {
	public GreensTech() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(xpath="(//div[@class='trainer-info'])[6]")
	private WebElement PageDown;
	@CacheLookup
	@FindBy(xpath="//h2[contains(text(),'Call us for course fees')]")
	private WebElement PageUp;
	@CacheLookup
	@FindBy(xpath="//p[@style='float:left;padding-top:20px;padding-left:20px;']")
	private WebElement last;
	@CacheLookup
	@FindBy(xpath="//h1[text()='No 1 Software Training Institutes in Chennai with Placements']")
	private WebElement print;
	@CacheLookup
	@FindBy(xpath="//a[text()='Certifications']")
	private WebElement certification;
	@CacheLookup
	@FindBy(xpath="(//a[text()='Course Content']) [29]")
	private WebElement courseContent;
	@CacheLookup
	@FindBy(xpath="(//h1[text()='SELENIUM'])[1]")
	private WebElement selenium;
	@CacheLookup
	@FindBy(xpath="//p[contains(text(),'I have taken Selenium training in chennai at Greens technology.')]")
	private WebElement testimonial;
	@CacheLookup
	@FindBy(xpath="//a[text()='COURSES']")
	private WebElement courses;
	@CacheLookup
	@FindBy(xpath="//a[text()='Java Training ']")
	private WebElement javaTraining;
	@CacheLookup
	@FindBy(xpath="//a[text()='Core Java Training']")
	private WebElement coreJava;
	@CacheLookup
	@FindBy(xpath="//h2[text()='Java training Reviews from Anitha']")
	private WebElement javaReview;
	@CacheLookup
	@FindBy(xpath="//a[text()='CAREERS']")
	private WebElement careers;
	@CacheLookup
	@FindBy(xpath="//a[text()='www.greenstechnologys.com.']")
	private WebElement lastMail;
	
	
	public WebElement getPageUp() {
		return PageUp;
	}


	public WebElement getLast() {
		return last;
	}


	public WebElement getPrint() {
		return print;
	}


	public WebElement getCertification() {
		return certification;
	}


	public WebElement getCourseContent() {
		return courseContent;
	}


	public WebElement getSelenium() {
		return selenium;
	}


	public WebElement getTestimonial() {
		return testimonial;
	}


	public WebElement getCourses() {
		return courses;
	}


	public WebElement getJavaTraining() {
		return javaTraining;
	}


	public WebElement getCoreJava() {
		return coreJava;
	}


	public WebElement getJavaReview() {
		return javaReview;
	}


	public WebElement getCareers() {
		return careers;
	}


	public WebElement getLastMail() {
		return lastMail;
	}


	public WebElement getPageDown() {
		return PageDown;
	}

	
	
	
}
