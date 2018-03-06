package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorsDepotLoginPF {
	
	WebDriver driver;
	
	public VendorsDepotLoginPF(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	/*By username  = By.xpath("//*[@id='email']");
	By Password  = By.xpath("//*[@id='password']");
	By SignIn    = By.xpath("//*[@id='signInForm']/div[5]/button");
	*/
	
	@FindBy(xpath="//*[@id='email']")
	WebElement username;
	
	@FindBy(xpath="//*[@id='password']")
	WebElement Password;
	
	@FindBy(xpath="//*[@id='signInForm']/div[5]/button")
	WebElement SignIn;
	
	
	
	public WebElement username(){
		
		return username;
	}
	
	
	public WebElement Password(){
		
		return Password;
	}
	
	public WebElement SignIn(){
		
		return SignIn;
	}
	
	

}
