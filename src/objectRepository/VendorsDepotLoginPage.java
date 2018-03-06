package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VendorsDepotLoginPage {
	
	WebDriver driver;
	
	public VendorsDepotLoginPage(WebDriver driver){
		
		this.driver=driver;
		
	}

	By username  = By.xpath("//*[@id='email']");
	By Password  = By.xpath("//*[@id='password']");
	By SignIn    = By.xpath("//*[@id='signInForm']/div[5]/button");
	
	public WebElement username(){
		
		return driver.findElement(username);
	}
	
	
	public WebElement Password(){
		
		return driver.findElement(Password);
	}
	
	public WebElement SignIn(){
		
		return driver.findElement(SignIn);
	}
	
	

}
