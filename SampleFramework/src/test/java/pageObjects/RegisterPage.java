package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver driver;
	@FindBy(xpath="//a[@class=\"login\"]")
	WebElement loginButton;
	
	@FindBy(id="email_create")
	WebElement Rgemail;
    @FindBy(id="SubmitCreate")
    WebElement createButton;
    
    public RegisterPage(WebDriver driver) {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    
    public void clickSignin() {
    	loginButton.click();
    }
    
    public void enterEmail() {
    	Rgemail.sendKeys("mehmet@gmail.com");
    }
    public void submit() {
    	createButton.click();
    }
}
