package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import objectRepository.DashboardPage;
import objectRepository.VendorsDepotLoginPF;

public class LoginApplication {
	
	@Test
	public void login(){
		
	
	WebDriver driver = new FirefoxDriver();
	driver.get("https://beta.vendorsdepot.com/login/buyer");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
	
	VendorsDepotLoginPF vd = new VendorsDepotLoginPF(driver);
	
	vd.username().sendKeys("KenWilliamson");
	vd.Password().sendKeys("indianic");
	vd.SignIn().click();
	
	DashboardPage dp = new DashboardPage(driver);
	
	Actions action = new Actions(driver);
	action.moveToElement(dp.hover()).build().perform();
	dp.profile().click();
	
	
	
	}

}
