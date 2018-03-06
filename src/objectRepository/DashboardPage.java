package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {
	
	WebDriver driver;
	
	public DashboardPage(WebDriver driver){
		
		this.driver=driver;
		
	}
	
	By hover = By.xpath("html/body/header/div[2]/div[2]/div[3]/ul/li[3]/a");
	
	By profile = By.xpath("html/body/header/div[2]/div[2]/div[3]/ul/li[3]/ul/li[1]/a");
	

	public WebElement hover(){
		
		return driver.findElement(hover);
	}
	
	public WebElement profile(){
		
		return driver.findElement(profile);
	}
}
